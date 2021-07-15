package es.um.asio.importer.oaipmh.processor.mappings;

import es.um.asio.abstractions.domain.Operation;
import es.um.asio.domain.DataSetData;
import es.um.asio.domain.InputData;
import es.um.asio.domain.sgi.model.actuacion.ActuacionSGI;
import es.um.asio.domain.sgi.model.actuacion.RelActuacionTemas;
import es.um.asio.domain.sgi.model.comun.LocalizadoEnSGI;
import es.um.asio.domain.sgi.model.comun.SeRelacionaGastoSGI;
import es.um.asio.domain.sgi.model.comun.SeRelacionaRolSGI;
import es.um.asio.importer.oaipmh.mapper.OaipmhBeansMapper;
import es.um.asio.importer.oaipmh.model.OAIPMHtype;
import es.um.asio.importer.oaipmh.model.xsd.Actuacion;
import es.um.asio.importer.oaipmh.model.xsd.Actuacion.PresentaDocumento.Tema;
import es.um.asio.importer.util.ImportResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ActuacionMapping implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1773107160449470033L;

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ActuacionMapping.class);

	public static List<InputData<DataSetData>> mappingDeleted(String identifier, long jobExecutionId) {
		List<InputData<DataSetData>> deletedList = new ArrayList<>();

		InputData<DataSetData> data = new InputData<>();
		ActuacionSGI domain = new ActuacionSGI();
		domain.setVersion(jobExecutionId);
		domain.setId(identifier);
		domain.setOperation(Operation.DELETE);
		data.setData(domain);
		deletedList.add(data);

		return deletedList;
	}

	public static List<InputData<DataSetData>> mappingActuacion(OAIPMHtype bodyXML, long jobExecutionId,
			OaipmhBeansMapper mapper) {
		List<InputData<DataSetData>> listActuacion = new ArrayList<>();
		InputData<DataSetData> data;
		RelActuacionTemas relActuacionTemas = null;
		DataSetData domain = null;
		if (bodyXML != null && bodyXML.getGetRecord() != null && bodyXML.getGetRecord().getRecord() != null
				&& bodyXML.getGetRecord().getRecord().getMetadata() != null
				&& bodyXML.getGetRecord().getRecord().getMetadata().getAny() != null) {

			Object actividadElement = bodyXML.getGetRecord().getRecord().getMetadata().getAny();

			JAXBContext context;
			try {
				context = JAXBContext.newInstance("es.um.asio.importer.oaipmh.model.xsd",
						Actuacion.class.getClassLoader());
				Unmarshaller um;

				um = context.createUnmarshaller();

				Actuacion actuacion;

				actuacion = (Actuacion) um.unmarshal((Node) actividadElement);

				logger.debug("response: " + actuacion.toString());

				ActuacionSGI actuacionSGI = mapper.mapperActuacion(actuacion);
				if (bodyXML.getGetRecord().getRecord().getHeader() != null
						&& bodyXML.getGetRecord().getRecord().getHeader().getIdentifier() != null) {
					actuacionSGI.setId(bodyXML.getGetRecord().getRecord().getHeader().getIdentifier());
				}

				domain = new ActuacionSGI();
				domain.setVersion(jobExecutionId);
				data = new InputData<DataSetData>();

				domain = actuacionSGI;
				data.setData(domain);
				logger.info("Processing DataSetData {}", domain.getClass());
				listActuacion.add(data);

				if (actuacion.getPresentaDocumento() != null && actuacion.getPresentaDocumento().getTema() != null) {
					for (Tema tema : actuacion.getPresentaDocumento().getTema()) {
						domain = new RelActuacionTemas();
						data = new InputData<DataSetData>();
						relActuacionTemas = new RelActuacionTemas();
						relActuacionTemas.setIdTema(tema.getId());
						relActuacionTemas.setIdActuacion(actuacionSGI.getId());
						domain = relActuacionTemas;
						domain.setVersion(jobExecutionId);
						data.setData(domain);
						logger.info("Processing DataSetData {}", domain.getClass());
						listActuacion.add(data);
					}
				}

				if (actuacion.getLocalizadoEn() != null) {
					LocalizadoEnSGI localizado = new LocalizadoEnSGI();
					domain = new LocalizadoEnSGI();
					data = new InputData<DataSetData>();

					localizado.setId(actuacion.getLocalizadoEn().getId());
					localizado.setIdRel(actuacionSGI.getId());
					localizado.setNombre(actuacion.getLocalizadoEn().getNombre());

					domain = localizado;
					domain.setVersion(jobExecutionId);
					data.setData(domain);
					logger.info("Processing DataSetData {}", domain.getClass());
					listActuacion.add(data);

				}

				if (actuacion.getSeRelacionaGasto() != null) {
					SeRelacionaGastoSGI relacionaGasto = new SeRelacionaGastoSGI();
					domain = new SeRelacionaGastoSGI();
					data = new InputData<DataSetData>();

					relacionaGasto.setCantidadMonetaria(actuacion.getSeRelacionaGasto().getCantidadMonetaria());

					relacionaGasto.setDescripcion(actuacion.getSeRelacionaGasto().getDescripcion());

					relacionaGasto.setFecha(
							ImportResultUtil.xmlGregorianCalendarToDate(actuacion.getSeRelacionaGasto().getFecha()));

					relacionaGasto.setId(actuacion.getSeRelacionaGasto().getId());

					relacionaGasto.setModalidadGasto(actuacion.getSeRelacionaGasto().getModalidadGasto());

					relacionaGasto.setMoneda(actuacion.getSeRelacionaGasto().getMoneda());

					relacionaGasto.setTitulo(actuacion.getSeRelacionaGasto().getTitulo());

					if (actuacion.getSeRelacionaGasto().getTieneClassificacion() != null) {
						relacionaGasto.setIdtieneClassificacion(
								actuacion.getSeRelacionaGasto().getTieneClassificacion().getId());
					}

					relacionaGasto.setIdRel(actuacionSGI.getId());

					domain = relacionaGasto;
					domain.setVersion(jobExecutionId);
					data.setData(domain);
					logger.info("Processing DataSetData {}", domain.getClass());
					listActuacion.add(data);

				}

				if (actuacion.getSeRelacionaRol() != null) {
					SeRelacionaRolSGI relacionaRol = new SeRelacionaRolSGI();
					domain = new SeRelacionaRolSGI();
					data = new InputData<DataSetData>();

					relacionaRol.setDedicacion(actuacion.getSeRelacionaRol().getDedicacion());
					relacionaRol.setDescripcion(actuacion.getSeRelacionaRol().getDescripcion());

					if (actuacion.getSeRelacionaRol().getHeredaEnPersona() != null) {
						relacionaRol.setIdheredaEnPersona(actuacion.getSeRelacionaRol().getHeredaEnPersona().getId());
					}

					relacionaRol.setId(actuacion.getSeRelacionaRol().getId());
					relacionaRol.setFechaFin(ImportResultUtil.xmlGregorianCalendarToDate(
							actuacion.getSeRelacionaRol().getIntervaloDeTiempo().getFechaFin()));
					relacionaRol.setFechaInicio(ImportResultUtil.xmlGregorianCalendarToDate(
							actuacion.getSeRelacionaRol().getIntervaloDeTiempo().getFechaInicio()));
					relacionaRol.setPorcentajeDeDedicacion(actuacion.getSeRelacionaRol().getPorcentajeDeDedicacion());

					if (actuacion.getSeRelacionaRol().getRelacionadoConPatentAplication() != null) {
						relacionaRol.setIdrelacionadoConPatentAplication(
								actuacion.getSeRelacionaRol().getRelacionadoConPatentAplication().getId());
					}

					if (actuacion.getSeRelacionaRol().getRelacionadoConProyecto() != null) {
						relacionaRol.setIdrelacionadoConProyecto(
								actuacion.getSeRelacionaRol().getRelacionadoConProyecto().getId());
					}

					if (actuacion.getSeRelacionaRol().getRelacionadoConRelacion() != null) {
						relacionaRol.setIdrelacionadoConRelacion(
								actuacion.getSeRelacionaRol().getRelacionadoConRelacion().getId());
					}

					relacionaRol.setTieneAreaConocimiento(actuacion.getSeRelacionaRol().getTieneAreaConocimiento());

					domain = relacionaRol;
					domain.setVersion(jobExecutionId);
					data.setData(domain);
					logger.info("Processing DataSetData {}", domain.getClass());
					listActuacion.add(data);

					relacionaRol.setIdRel(actuacionSGI.getId());

				}

			} catch (JAXBException e) {
				logger.error(e.getMessage());

			}
		}
		return listActuacion;
	}

}
