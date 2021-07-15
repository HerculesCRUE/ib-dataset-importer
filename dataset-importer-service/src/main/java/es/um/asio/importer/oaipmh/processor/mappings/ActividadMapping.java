package es.um.asio.importer.oaipmh.processor.mappings;

import es.um.asio.abstractions.domain.Operation;
import es.um.asio.domain.DataSetData;
import es.um.asio.domain.InputData;
import es.um.asio.domain.sgi.model.actividad.ActividadSGI;
import es.um.asio.domain.sgi.model.actividad.RelActividadTemas;
import es.um.asio.domain.sgi.model.comun.LocalizadoEnSGI;
import es.um.asio.domain.sgi.model.comun.SeRelacionaGastoSGI;
import es.um.asio.domain.sgi.model.comun.SeRelacionaRolSGI;
import es.um.asio.importer.oaipmh.mapper.OaipmhBeansMapper;
import es.um.asio.importer.oaipmh.model.OAIPMHtype;
import es.um.asio.importer.oaipmh.model.xsd.Actividad;
import es.um.asio.importer.oaipmh.model.xsd.Actividad.PresentaDocumento.Tema;
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

public class ActividadMapping implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 3351155634890270195L;
    /**
     * Logger
     */
    private static final Logger logger = LoggerFactory.getLogger(ActividadMapping.class);

    public static List<InputData<DataSetData>> mappingDeleted(String identifier, long jobExecutionId) {
        List<InputData<DataSetData>> deletedList = new ArrayList<>();

        InputData<DataSetData> data = new InputData<>();
        ActividadSGI domain = new ActividadSGI();
        domain.setVersion(jobExecutionId);
        domain.setId(identifier);
        domain.setOperation(Operation.DELETE);
        data.setData(domain);
        deletedList.add(data);

        return deletedList;
    }

    public static List<InputData<DataSetData>> mappingActividad(OAIPMHtype bodyXML, long jobExecutionId,
                                                                OaipmhBeansMapper mapper) {
        List<InputData<DataSetData>> listActividad = new ArrayList<>();
        InputData<DataSetData> data;
        RelActividadTemas relActividadTemas = null;
        DataSetData domain = null;
        if (bodyXML != null && bodyXML.getGetRecord() != null && bodyXML.getGetRecord().getRecord() != null
                && bodyXML.getGetRecord().getRecord().getMetadata() != null
                && bodyXML.getGetRecord().getRecord().getMetadata().getAny() != null) {

            Object actividadElement = bodyXML.getGetRecord().getRecord().getMetadata().getAny();

            JAXBContext context;
            try {
                context = JAXBContext.newInstance("es.um.asio.importer.oaipmh.model.xsd",
                        Actividad.class.getClassLoader());
                Unmarshaller um;

                um = context.createUnmarshaller();

                Actividad actividad;

                actividad = (Actividad) um.unmarshal((Node) actividadElement);

                logger.debug("response: " + actividad.toString());

                ActividadSGI actividadSGI = mapper.mapperActividad(actividad);
                if (bodyXML.getGetRecord().getRecord().getHeader() != null
                        && bodyXML.getGetRecord().getRecord().getHeader().getIdentifier() != null) {
                    actividadSGI.setId(bodyXML.getGetRecord().getRecord().getHeader().getIdentifier());
                }

                domain = new ActividadSGI();
                domain.setVersion(jobExecutionId);
                data = new InputData<DataSetData>();

                domain = actividadSGI;
                data.setData(domain);
                logger.info("Processing DataSetData {}", domain.getClass());
                listActividad.add(data);

                if (actividad.getPresentaDocumento() != null && actividad.getPresentaDocumento().getTema() != null) {
                    for (Tema tema : actividad.getPresentaDocumento().getTema()) {
                        domain = new RelActividadTemas();
                        data = new InputData<DataSetData>();
                        relActividadTemas = new RelActividadTemas();
                        relActividadTemas.setIdTema(tema.getId());
                        relActividadTemas.setIdActividad(actividadSGI.getId());
                        domain = relActividadTemas;
                        domain.setVersion(jobExecutionId);
                        data.setData(domain);
                        logger.info("Processing DataSetData {}", domain.getClass());
                        listActividad.add(data);
                    }
                }

                if (actividad.getLocalizadoEn() != null) {
                    LocalizadoEnSGI localizado = new LocalizadoEnSGI();
                    domain = new LocalizadoEnSGI();
                    data = new InputData<DataSetData>();

                    localizado.setId(actividad.getLocalizadoEn().getId());
                    localizado.setIdRel(actividadSGI.getId());
                    localizado.setNombre(actividad.getLocalizadoEn().getNombre());

                    domain = localizado;
                    domain.setVersion(jobExecutionId);
                    data.setData(domain);
                    logger.info("Processing DataSetData {}", domain.getClass());
                    listActividad.add(data);

                }

                if (actividad.getSeRelacionaGasto() != null) {
                    SeRelacionaGastoSGI relacionaGasto = new SeRelacionaGastoSGI();
                    domain = new SeRelacionaGastoSGI();
                    data = new InputData<DataSetData>();

                    relacionaGasto.setCantidadMonetaria(actividad.getSeRelacionaGasto().getCantidadMonetaria());

                    relacionaGasto.setDescripcion(actividad.getSeRelacionaGasto().getDescripcion());

                    relacionaGasto.setFecha(
                            ImportResultUtil.xmlGregorianCalendarToDate(actividad.getSeRelacionaGasto().getFecha()));

                    relacionaGasto.setId(actividad.getSeRelacionaGasto().getId());

                    relacionaGasto.setModalidadGasto(actividad.getSeRelacionaGasto().getModalidadGasto());

                    relacionaGasto.setMoneda(actividad.getSeRelacionaGasto().getMoneda());

                    relacionaGasto.setTitulo(actividad.getSeRelacionaGasto().getTitulo());

                    if (actividad.getSeRelacionaGasto().getTieneClassificacion() != null) {
                        relacionaGasto.setIdtieneClassificacion(
                                actividad.getSeRelacionaGasto().getTieneClassificacion().getId());
                    }

                    relacionaGasto.setIdRel(actividadSGI.getId());

                    domain = relacionaGasto;
                    domain.setVersion(jobExecutionId);
                    data.setData(domain);
                    logger.info("Processing DataSetData {}", domain.getClass());
                    listActividad.add(data);

                }

                if (actividad.getSeRelacionaRol() != null) {
                    SeRelacionaRolSGI relacionaRol = new SeRelacionaRolSGI();
                    domain = new SeRelacionaRolSGI();
                    data = new InputData<DataSetData>();

                    relacionaRol.setDedicacion(actividad.getSeRelacionaRol().getDedicacion());
                    relacionaRol.setDescripcion(actividad.getSeRelacionaRol().getDescripcion());

                    if (actividad.getSeRelacionaRol().getHeredaEnPersona() != null) {
                        relacionaRol.setIdheredaEnPersona(actividad.getSeRelacionaRol().getHeredaEnPersona().getId());
                    }

                    relacionaRol.setId(actividad.getSeRelacionaRol().getId());
                    relacionaRol.setFechaFin(ImportResultUtil.xmlGregorianCalendarToDate(
                            actividad.getSeRelacionaRol().getIntervaloDeTiempo().getFechaFin()));
                    relacionaRol.setFechaInicio(ImportResultUtil.xmlGregorianCalendarToDate(
                            actividad.getSeRelacionaRol().getIntervaloDeTiempo().getFechaInicio()));
                    relacionaRol.setPorcentajeDeDedicacion(actividad.getSeRelacionaRol().getPorcentajeDeDedicacion());

                    if (actividad.getSeRelacionaRol().getRelacionadoConPatentAplication() != null) {
                        relacionaRol.setIdrelacionadoConPatentAplication(
                                actividad.getSeRelacionaRol().getRelacionadoConPatentAplication().getId());
                    }

                    if (actividad.getSeRelacionaRol().getRelacionadoConProyecto() != null) {
                        relacionaRol.setIdrelacionadoConProyecto(
                                actividad.getSeRelacionaRol().getRelacionadoConProyecto().getId());
                    }

                    if (actividad.getSeRelacionaRol().getRelacionadoConRelacion() != null) {
                        relacionaRol.setIdrelacionadoConRelacion(
                                actividad.getSeRelacionaRol().getRelacionadoConRelacion().getId());
                    }

                    relacionaRol.setTieneAreaConocimiento(actividad.getSeRelacionaRol().getTieneAreaConocimiento());

                    domain = relacionaRol;
                    domain.setVersion(jobExecutionId);
                    data.setData(domain);
                    logger.info("Processing DataSetData {}", domain.getClass());
                    listActividad.add(data);

                    relacionaRol.setIdRel(actividadSGI.getId());

                }

            } catch (JAXBException e) {
                logger.error(e.getMessage());

            }
        }
        return listActividad;
    }

}
