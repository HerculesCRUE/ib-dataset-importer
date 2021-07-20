package es.um.asio.importer.oaipmh.processor.mappings;

import es.um.asio.abstractions.domain.Operation;
import es.um.asio.domain.DataSetData;
import es.um.asio.domain.InputData;
import es.um.asio.domain.sgi.model.articuloAcademico.ArticuloAcademicoSGI;
import es.um.asio.domain.sgi.model.articuloAcademico.RelArticuloAcademicoAutor;
import es.um.asio.importer.oaipmh.mapper.OaipmhBeansMapper;
import es.um.asio.importer.oaipmh.model.OAIPMHtype;
import es.um.asio.importer.oaipmh.model.xsd.ArticuloAcademico;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ArticuloAcademicoMapping implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1612917027845804016L;

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ArticuloAcademicoMapping.class);

	public static List<InputData<DataSetData>> mappingDeleted(String identifier, long jobExecutionId) {
		List<InputData<DataSetData>> deletedList = new ArrayList<>();

		InputData<DataSetData> data = new InputData<>();
		ArticuloAcademicoSGI domain = new ArticuloAcademicoSGI();
		domain.setVersion(jobExecutionId);
		domain.setId(identifier);
		domain.setOperation(Operation.DELETE);
		data.setData(domain);
		deletedList.add(data);

		return deletedList;
	}

	public static List<InputData<DataSetData>> mappingArticuloAcademico(OAIPMHtype bodyXML, long jobExecutionId,
			OaipmhBeansMapper mapper) {
		List<InputData<DataSetData>> listArticuloAcademico = new ArrayList<>();
		InputData<DataSetData> data;
		RelArticuloAcademicoAutor relArticuloAcademicoAutor = null;
		DataSetData domain = null;
		if (bodyXML != null && bodyXML.getGetRecord() != null && bodyXML.getGetRecord().getRecord() != null
				&& bodyXML.getGetRecord().getRecord().getMetadata() != null
				&& bodyXML.getGetRecord().getRecord().getMetadata().getAny() != null) {

			Object articuloAcadElement = bodyXML.getGetRecord().getRecord().getMetadata().getAny();

			JAXBContext context;
			try {
				context = JAXBContext.newInstance("es.um.asio.importer.oaipmh.model.xsd",
						ArticuloAcademico.class.getClassLoader());
				Unmarshaller um;

				um = context.createUnmarshaller();

				ArticuloAcademico articuloAcademico;

				articuloAcademico = (ArticuloAcademico) um.unmarshal((Node) articuloAcadElement);

				logger.debug("response: " + articuloAcademico.toString());

				domain = new ArticuloAcademicoSGI();
				domain.setVersion(jobExecutionId);
				data = new InputData<DataSetData>();

				ArticuloAcademicoSGI articuloAcadSgi = mapper.mapperArticuloAcademico(articuloAcademico);
				if (bodyXML.getGetRecord().getRecord().getHeader() != null
						&& bodyXML.getGetRecord().getRecord().getHeader().getIdentifier() != null) {
					articuloAcadSgi.setId(bodyXML.getGetRecord().getRecord().getHeader().getIdentifier());
				}

				domain = articuloAcadSgi;
				data.setData(domain);
				logger.info("Processing DataSetData {}", domain.getClass());
				listArticuloAcademico.add(data);

				if (articuloAcademico.getListaDeAutores() != null
						&& articuloAcademico.getListaDeAutores().getAutor() != null) {
					for (es.um.asio.importer.oaipmh.model.xsd.ArticuloAcademico.ListaDeAutores.Autor autor : articuloAcademico
							.getListaDeAutores().getAutor()) {
						domain = new RelArticuloAcademicoAutor();
						data = new InputData<DataSetData>();
						relArticuloAcademicoAutor = new RelArticuloAcademicoAutor();
						relArticuloAcademicoAutor.setIdArticuloAcademico(articuloAcadSgi.getId());
						relArticuloAcademicoAutor.setIdAutor(autor.getId());
						domain = relArticuloAcademicoAutor;
						domain.setVersion(jobExecutionId);
						data.setData(domain);
						logger.info("Processing DataSetData {}", domain.getClass());
						listArticuloAcademico.add(data);
					}
				}

			} catch (JAXBException e) {
				logger.error(e.getMessage());

			}
		}
		return listArticuloAcademico;
	}
}
