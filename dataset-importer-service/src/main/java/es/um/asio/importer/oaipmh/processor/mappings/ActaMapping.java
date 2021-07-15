package es.um.asio.importer.oaipmh.processor.mappings;

import es.um.asio.abstractions.domain.Operation;
import es.um.asio.domain.DataSetData;
import es.um.asio.domain.InputData;
import es.um.asio.domain.sgi.model.actas.ActasSGI;
import es.um.asio.domain.sgi.model.actas.RelActasAutores;
import es.um.asio.importer.oaipmh.mapper.OaipmhBeansMapper;
import es.um.asio.importer.oaipmh.model.OAIPMHtype;
import es.um.asio.importer.oaipmh.model.xsd.Actas;
import es.um.asio.importer.oaipmh.model.xsd.Actas.ListaDeAutores.Autor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ActaMapping implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1612917027845804016L;

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ActaMapping.class);

	public static List<InputData<DataSetData>> mappingDeleted(String identifier, long jobExecutionId) {
		List<InputData<DataSetData>> deletedList = new ArrayList<>();

		InputData<DataSetData> data = new InputData<>();
		ActasSGI domain = new ActasSGI();
		domain.setVersion(jobExecutionId);
		domain.setId(identifier);
		domain.setOperation(Operation.DELETE);
		data.setData(domain);
		deletedList.add(data);

		return deletedList;
	}

	public static List<InputData<DataSetData>> mappingActas(OAIPMHtype bodyXML, long jobExecutionId,
			OaipmhBeansMapper mapper) {
		List<InputData<DataSetData>> listActas = new ArrayList<>();
		InputData<DataSetData> data;
		RelActasAutores relActaAutor = null;
		DataSetData domain = null;
		if (bodyXML != null && bodyXML.getGetRecord() != null && bodyXML.getGetRecord().getRecord() != null
				&& bodyXML.getGetRecord().getRecord().getMetadata() != null
				&& bodyXML.getGetRecord().getRecord().getMetadata().getAny() != null) {
			Object actaElement = bodyXML.getGetRecord().getRecord().getMetadata().getAny();

			JAXBContext context;
			try {
				context = JAXBContext.newInstance("es.um.asio.importer.oaipmh.model.xsd", Actas.class.getClassLoader());
				Unmarshaller um;

				um = context.createUnmarshaller();

				Actas acta;

				acta = (Actas) um.unmarshal((Node) actaElement);

				logger.debug("response: " + acta.toString());

				domain = new ActasSGI();
				domain.setVersion(jobExecutionId);
				data = new InputData<DataSetData>();

				ActasSGI actaSgi = mapper.mapperActas(acta);
				if (bodyXML.getGetRecord().getRecord().getHeader() != null
						&& bodyXML.getGetRecord().getRecord().getHeader().getIdentifier() != null) {
					actaSgi.setId(bodyXML.getGetRecord().getRecord().getHeader().getIdentifier());
				}

				domain = actaSgi;
				data.setData(domain);
				logger.info("Processing DataSetData {}", domain.getClass());
				listActas.add(data);

				if (acta.getListaDeAutores() != null && acta.getListaDeAutores().getAutor() != null) {
					for (Autor autor : acta.getListaDeAutores().getAutor()) {
						domain = new RelActasAutores();
						data = new InputData<DataSetData>();
						relActaAutor = new RelActasAutores();
						relActaAutor.setIdActas(actaSgi.getId());
						relActaAutor.setIdAutor(autor.getId());
						domain = relActaAutor;
						domain.setVersion(jobExecutionId);
						data.setData(domain);
						logger.info("Processing DataSetData {}", domain.getClass());
						listActas.add(data);
					}
				}

			} catch (JAXBException e) {
				logger.error(e.getMessage());

			}
		}
		return listActas;
	}
}
