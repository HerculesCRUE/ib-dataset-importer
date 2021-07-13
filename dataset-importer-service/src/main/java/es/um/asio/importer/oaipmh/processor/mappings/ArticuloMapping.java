package es.um.asio.importer.oaipmh.processor.mappings;

import es.um.asio.abstractions.domain.Operation;
import es.um.asio.domain.DataSetData;
import es.um.asio.domain.InputData;
import es.um.asio.domain.sgi.model.articulo.ArticuloSGI;
import es.um.asio.domain.sgi.model.articulo.RelArticuloAutores;
import es.um.asio.domain.sgi.model.articuloAcademico.RelArticuloAcademicoAutor;
import es.um.asio.importer.oaipmh.mapper.OaipmhBeansMapper;
import es.um.asio.importer.oaipmh.model.OAIPMHtype;
import es.um.asio.importer.oaipmh.model.xsd.Articulo;
import es.um.asio.importer.oaipmh.model.xsd.Articulo.ListaDeAutores.Autor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ArticuloMapping implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4668225217028389794L;

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ArticuloMapping.class);

	public static List<InputData<DataSetData>> mappingDeleted(String identifier, long jobExecutionId) {
		List<InputData<DataSetData>> deletedList = new ArrayList<>();

		InputData<DataSetData> data = new InputData<>();
		ArticuloSGI domain = new ArticuloSGI();
		domain.setVersion(jobExecutionId);
		domain.setId(identifier);
		domain.setOperation(Operation.DELETE);
		data.setData(domain);
		deletedList.add(data);

		return deletedList;
	}

	public static List<InputData<DataSetData>> mappingArticulo(OAIPMHtype bodyXML, long jobExecutionId,
			OaipmhBeansMapper mapper) {
		List<InputData<DataSetData>> listArticulo = new ArrayList<>();
		InputData<DataSetData> data;
		RelArticuloAutores relArticuloAutor = null;
		DataSetData domain = null;
		if (bodyXML != null && bodyXML.getGetRecord() != null && bodyXML.getGetRecord().getRecord() != null
				&& bodyXML.getGetRecord().getRecord().getMetadata() != null
				&& bodyXML.getGetRecord().getRecord().getMetadata().getAny() != null) {

			Object articuloElement = bodyXML.getGetRecord().getRecord().getMetadata().getAny();

			JAXBContext context;
			try {
				context = JAXBContext.newInstance("es.um.asio.importer.oaipmh.model.xsd",
						Articulo.class.getClassLoader());
				Unmarshaller um;

				um = context.createUnmarshaller();

				Articulo articulo;

				articulo = (Articulo) um.unmarshal((Node) articuloElement);

				logger.debug("response: " + articulo.toString());

				domain = new ArticuloSGI();
				domain.setVersion(jobExecutionId);
				data = new InputData<DataSetData>();

				ArticuloSGI articuloSgi = mapper.mapperArticulo(articulo);
				if (bodyXML.getGetRecord().getRecord().getHeader() != null
						&& bodyXML.getGetRecord().getRecord().getHeader().getIdentifier() != null) {
					articuloSgi.setId(bodyXML.getGetRecord().getRecord().getHeader().getIdentifier());
				}

				domain = articuloSgi;
				data.setData(domain);
				logger.info("Processing DataSetData {}", domain.getClass());
				listArticulo.add(data);

				if (articulo.getListaDeAutores() != null && articulo.getListaDeAutores().getAutor() != null) {
					for (Autor autor : articulo.getListaDeAutores().getAutor()) {
						domain = new RelArticuloAcademicoAutor();
						data = new InputData<DataSetData>();
						relArticuloAutor = new RelArticuloAutores();
						relArticuloAutor.setIdArticulo(articuloSgi.getId());
						relArticuloAutor.setIdAutor(autor.getId());
						domain = relArticuloAutor;
						domain.setVersion(jobExecutionId);
						data.setData(domain);
						logger.info("Processing DataSetData {}", domain.getClass());
						listArticulo.add(data);
					}
				}

			} catch (JAXBException e) {
				logger.error(e.getMessage());

			}
		}
		return listArticulo;
	}

}
