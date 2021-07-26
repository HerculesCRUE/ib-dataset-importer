package es.um.asio.importer.cerif.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.um.asio.abstractions.domain.Operation;
import es.um.asio.abstractions.perfomance.WatchDog;
import es.um.asio.domain.InputData;
import es.um.asio.domain.cerif.BaseCerif;
import es.um.asio.domain.cerif.BaseIdCerif;
import es.um.asio.domain.cerif.PersonaCerif;
import es.um.asio.domain.cerif.ProductoCerif;
import es.um.asio.domain.cerif.ProyectoCerif;
import es.um.asio.domain.cerif.PublicacionCerif;
import es.um.asio.domain.cerif.UnidadOrganizativaCerif;
import es.um.asio.importer.cerif.model.OrgUnit;
import es.um.asio.importer.cerif.model.Person;
import es.um.asio.importer.cerif.model.Product;
import es.um.asio.importer.cerif.model.Project;
import es.um.asio.importer.cerif.model.Publication;
import es.um.asio.importer.cerif.oaipmh.RecordType;
import es.um.asio.importer.cerif.oaipmh.StatusType;
import es.um.asio.importer.cerif.processor.mappings.ResponseGetRecordMapper;
import es.um.asio.importer.cerif.processor.mappings.entity.PersonaMapper;
import es.um.asio.importer.cerif.processor.mappings.entity.ProductoMapper;
import es.um.asio.importer.cerif.processor.mappings.entity.ProyectoMapper;
import es.um.asio.importer.cerif.processor.mappings.entity.PublicacionMapper;
import es.um.asio.importer.cerif.processor.mappings.entity.UnidadOrganizativaMapper;
import es.um.asio.importer.cerif.repository.CerifRepository;
import es.um.asio.importer.constants.Constants;
import es.um.asio.importer.oaipmh.writer.OaipmhWriter;

@Service
public class CerifServiceImpl implements CerifService{
	
	private static final Logger logger = LoggerFactory.getLogger(CerifServiceImpl.class);
	
	@Autowired
	private OaipmhWriter dataService;

	@Autowired
	private CerifRepository cerifRepository;

	@Override
	public void importCerifData(Long executionId) {
		WatchDog eventNotifyWatchDog = new WatchDog();
		try {
			List<InputData<? extends BaseCerif>> list = cerifRepository.getSets().stream()
					.flatMap(setType -> cerifRepository.getSetDetailsContent(setType.getSetSpec()).stream())
					.map(headerType -> cerifRepository.getEntityDetailsContent(headerType.getIdentifier()))
					.flatMap(recordType -> getContentRecord(recordType, executionId).stream())
					.collect(Collectors.toList());

			dataService.write(list);
		} catch (Exception e) {
			logger.error(String.format("importCerifData - Error unknown. excecutionId: %d", executionId), e);
		}

		logger.warn("------------------------------- importCerifData -------------------------");
		eventNotifyWatchDog.printnResults(logger);
		logger.warn("------------------------------- importCerifData -------------------------");
	}

	private List<InputData<? extends BaseCerif>> getContentRecord(RecordType recordType, Long jobExecutionId) {
		if (recordType == null || recordType.getHeader()==null || recordType.getHeader().getSetSpec()== null || recordType.getHeader().getSetSpec().isEmpty()) {
			return Collections.emptyList();
		}
		String setSpec = recordType.getHeader().getSetSpec().get(0);
		
		switch (setSpec) {
		case Constants.OpenAIRE_CRIS_persons:
			return getDeletedRecord(recordType, PersonaCerif::new)
					.orElse(ResponseGetRecordMapper.mapOAIPHtypeToInputDatas(recordType.getMetadata(), recordType.getHeader().getIdentifier(), jobExecutionId,
					ResponseGetRecordMapper.XsdContextPaths.CERIF, Person.class, PersonaMapper::mapXsdToDomain));
		case Constants.OpenAIRE_CRIS_projects:
			return getDeletedRecord(recordType, ProyectoCerif::new)
					.orElse(ResponseGetRecordMapper.mapOAIPHtypeToInputDatas(recordType.getMetadata(), recordType.getHeader().getIdentifier(), jobExecutionId,
					ResponseGetRecordMapper.XsdContextPaths.CERIF, Project.class, ProyectoMapper::mapXsdToDomain));
		case Constants.OpenAIRE_CRIS_publications:
			return getDeletedRecord(recordType, PublicacionCerif::new)
					.orElse(ResponseGetRecordMapper.mapOAIPHtypeToInputDatas(recordType.getMetadata(), recordType.getHeader().getIdentifier(), jobExecutionId,
					ResponseGetRecordMapper.XsdContextPaths.CERIF, Publication.class, PublicacionMapper::mapXsdToDomain));
		case Constants.OpenAIRE_CRIS_products:
			return getDeletedRecord(recordType, ProductoCerif::new)
					.orElse(ResponseGetRecordMapper.mapOAIPHtypeToInputDatas(recordType.getMetadata(), recordType.getHeader().getIdentifier(), jobExecutionId,
					ResponseGetRecordMapper.XsdContextPaths.CERIF, Product.class, ProductoMapper::mapXsdToDomain));
		case Constants.OpenAIRE_CRIS_orgunits:
			return getDeletedRecord(recordType, UnidadOrganizativaCerif::new)
					.orElse(ResponseGetRecordMapper.mapOAIPHtypeToInputDatas(recordType.getMetadata(), recordType.getHeader().getIdentifier(), jobExecutionId,
					ResponseGetRecordMapper.XsdContextPaths.CERIF, OrgUnit.class, UnidadOrganizativaMapper::mapXsdToDomain));	
		}
		
		return Collections.emptyList();
	}
	
	private <T extends BaseIdCerif> Optional<List<InputData<? extends BaseCerif>>> getDeletedRecord(RecordType recordType, Supplier<T> supplier) {
		if (recordType.getHeader()==null) {
			return Optional.of(Collections.emptyList());
		}		
		
		if (StatusType.DELETED.equals(recordType.getHeader().getStatus())) {
			T dato = supplier.get();
			dato.setId(recordType.getHeader().getIdentifier());
			dato.setOperation(Operation.DELETE);
			InputData<BaseIdCerif> inputData = new InputData<BaseIdCerif>();
			inputData.setData(dato);
			return Optional.of(Arrays.asList(inputData));
		}
		
		return Optional.empty();
	}
}
