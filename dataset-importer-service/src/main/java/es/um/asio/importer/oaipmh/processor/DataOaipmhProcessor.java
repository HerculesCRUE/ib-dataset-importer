package es.um.asio.importer.oaipmh.processor;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import es.um.asio.abstractions.perfomance.WatchDog;
import es.um.asio.domain.DataSetData;
import es.um.asio.domain.InputData;
import es.um.asio.importer.constants.Constants;
import es.um.asio.importer.oaipmh.mapper.OaipmhBeansMapper;
import es.um.asio.importer.oaipmh.model.HeaderType;
import es.um.asio.importer.oaipmh.model.OAIPMHtype;
import es.um.asio.importer.oaipmh.model.SetType;
import es.um.asio.importer.oaipmh.processor.mappings.ActaMapping;
import es.um.asio.importer.oaipmh.processor.mappings.ActividadMapping;
import es.um.asio.importer.oaipmh.processor.mappings.ActuacionMapping;
import es.um.asio.importer.oaipmh.processor.mappings.ArticuloAcademicoMapping;
import es.um.asio.importer.oaipmh.processor.mappings.ArticuloConferenciaMapping;
import es.um.asio.importer.oaipmh.processor.mappings.ArticuloMapping;
import es.um.asio.importer.oaipmh.writer.OaipmhWriter;

public class DataOaipmhProcessor implements Tasklet {

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(DataOaipmhProcessor.class);

	/**
	 * The job execution id.
	 */
	private long jobExecutionId;

	private RestTemplate restTemplate;

	@Autowired
	private OaipmhWriter dataService;

	@Autowired
	private OaipmhBeansMapper mapper;
    
    @Value("${app.services.oai.endpoint}")
    public String oaiEndpoint; 
	
	/** The SGI factory endpoint. */
	@Value("${app.services.oai.endpoint-list}")
	private String uriFactoryListContext;

	/** The SGI factory endpoint. */
	@Value("${app.services.oai.endpoint-ids}")
	private String uriFactoryIdsContext;

	/** The uri factory endpoint. */
	@Value("${app.services.oai.endpoint-xml}")
	private String uriFactoryXmlContext;

	/**
	 * @inheritDoc
	 */
	@BeforeStep
	public void beforeStep(StepExecution stepExecution) {
		jobExecutionId = stepExecution.getJobExecutionId();
	}

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		WatchDog eventNotifyWatchDog = new WatchDog();
		ResponseEntity<OAIPMHtype> responseIds = null;
		ResponseEntity<OAIPMHtype> responseXml = null;
		List<InputData<DataSetData>> list = new ArrayList<InputData<DataSetData>>();

		try {
			restTemplate = new RestTemplate();
			ResponseEntity<OAIPMHtype> response = restTemplate.getForEntity(oaiEndpoint.concat(uriFactoryListContext), OAIPMHtype.class);

			if (response != null) {

				OAIPMHtype bodySpec = response.getBody();

				if (bodySpec != null) {
					if (bodySpec.getListSets() != null) {

						for (SetType set : response.getBody().getListSets().getSet()) {
							try {

								responseIds = restTemplate.getForEntity(oaiEndpoint.concat(uriFactoryIdsContext).concat(set.getSetSpec()),
										OAIPMHtype.class);

								if (responseIds != null) {
									OAIPMHtype bodyIds = response.getBody();

									if (bodyIds != null) {

										if (bodyIds.getError() != null && bodyIds.getError().size() != 0) {
											logger.debug(bodyIds.getError().get(0).getValue() + " - URL: "
													+ oaiEndpoint.concat(uriFactoryIdsContext).concat(set.getSetSpec()));
										} else if (bodyIds.getListIdentifiers() != null
												&& bodyIds.getListIdentifiers().getHeader() != null) {

											for (HeaderType setID : responseIds.getBody().getListIdentifiers()
													.getHeader()) {
												logger.info(
														"Spec: " + set.getSetSpec() + ", ID: " + setID.getIdentifier());
												try {
													responseXml = restTemplate.getForEntity(
															oaiEndpoint.concat(uriFactoryXmlContext).concat(setID.getIdentifier()),
															OAIPMHtype.class);

													if (responseXml != null) {
														OAIPMHtype bodyXML = responseXml.getBody();

														if (bodyXML != null) {
															if (bodyXML.getError() != null
																	&& bodyXML.getError().size() != 0) {
																logger.debug(bodyXML.getError().get(0).getValue()
																		+ " - URL: " + oaiEndpoint.concat(uriFactoryXmlContext)
																				.concat(setID.getIdentifier()));
															} else if (bodyXML != null) {

																if (bodyXML.getIdentify() != null && bodyXML
																		.getIdentify().getDeletedRecord() != null) {
																	// TODO DELETE
																	System.out.println("DELETEEEEEEEE");
																} else {

																	mappingObjects(list, bodyXML, set.getSetSpec());

																}
															}

														}
													}

												} catch (Exception e) {
													logger.error(e.getMessage());
												}

											}
										}

									}
								}

							} catch (Exception e) {
								logger.error(e.getMessage());
							}

						}
					}

				}
			} else {
				logger.info("nothing on response SGI");
			}

			eventNotifyWatchDog.takeTime("eventNotify");

		} catch (Exception e) {
			logger.error(e.getMessage());
		}

		dataService.write(list);

		// we print the watchdog results
		logger.warn("-----------------------------------------------------------------------");
		eventNotifyWatchDog.printnResults(logger);
		logger.warn("-----------------------------------------------------------------------");

		return RepeatStatus.FINISHED;
	}

	private void mappingObjects(List<InputData<DataSetData>> list, OAIPMHtype bodyXML, String setSpec) {

		List<InputData<DataSetData>> listObjects = null;

		switch (setSpec) {
		case Constants.ACTAS:
			listObjects = ActaMapping.mappingActas(bodyXML, jobExecutionId, this.mapper);
			if (listObjects != null && listObjects.size() != 0)
				list.addAll(listObjects);
			break;

		case Constants.ACTIVIDAD:
			listObjects = ActividadMapping.mappingActividad(bodyXML, jobExecutionId, this.mapper);
			if (listObjects != null && listObjects.size() != 0)
				list.addAll(listObjects);
			break;

		case Constants.ACTUACION:
			listObjects = ActuacionMapping.mappingActuacion(bodyXML, jobExecutionId, this.mapper);
			if (listObjects != null && listObjects.size() != 0)
				list.addAll(listObjects);
			break;

		case Constants.ARTICULO:
			listObjects = ArticuloMapping.mappingArticulo(bodyXML, jobExecutionId, this.mapper);
			if (listObjects != null && listObjects.size() != 0)
				list.addAll(listObjects);
			break;

		case Constants.ARTICULO_ACADEMICO:
			listObjects = ArticuloAcademicoMapping.mappingArticuloAcademico(bodyXML, jobExecutionId, this.mapper);
			if (listObjects != null && listObjects.size() != 0)
				list.addAll(listObjects);
			break;

		case Constants.ARTICULO_CONFERENCIA:
			listObjects = ArticuloConferenciaMapping.mappingArticuloConferencia(bodyXML, jobExecutionId, this.mapper);
			if (listObjects != null && listObjects.size() != 0)
				list.addAll(listObjects);
			break;
		}

	}

	public void setOaiEndpoint(String oaiEndpoint) {
		this.oaiEndpoint = oaiEndpoint;
	}
}
