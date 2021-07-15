package es.um.asio.importer.oaipmh.processor.mappings;

import es.um.asio.abstractions.domain.Operation;
import es.um.asio.domain.DataSetData;
import es.um.asio.domain.InputData;
import es.um.asio.domain.sgi.model.articuloConferencia.ArticuloConferenciaSGI;
import es.um.asio.domain.sgi.model.articuloConferencia.RelArticuloConferenciaAutores;
import es.um.asio.importer.oaipmh.mapper.OaipmhBeansMapper;
import es.um.asio.importer.oaipmh.model.OAIPMHtype;
import es.um.asio.importer.oaipmh.model.xsd.ArticuloConferencia;
import es.um.asio.importer.oaipmh.model.xsd.ArticuloConferencia.ListaDeAutores.Autor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ArticuloConferenciaMapping implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 701443433028941983L;

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ArticuloMapping.class);

	public static List<InputData<DataSetData>> mappingDeleted(String identifier, long jobExecutionId) {
		List<InputData<DataSetData>> deletedList = new ArrayList<>();

		InputData<DataSetData> data = new InputData<>();
		ArticuloConferenciaSGI domain = new ArticuloConferenciaSGI();
		domain.setVersion(jobExecutionId);
		domain.setId(identifier);
		domain.setOperation(Operation.DELETE);
		data.setData(domain);
		deletedList.add(data);

		return deletedList;
	}

	public static List<InputData<DataSetData>> mappingArticuloConferencia(OAIPMHtype bodyXML, long jobExecutionId,
			OaipmhBeansMapper mapper) {
		List<InputData<DataSetData>> listArticuloConf = new ArrayList<>();
		InputData<DataSetData> data;
		RelArticuloConferenciaAutores relArticuloConfAutor = null;
		DataSetData domain = null;
		if (bodyXML != null && bodyXML.getGetRecord() != null && bodyXML.getGetRecord().getRecord() != null
				&& bodyXML.getGetRecord().getRecord().getMetadata() != null
				&& bodyXML.getGetRecord().getRecord().getMetadata().getAny() != null) {

			Object articuloConfElement = bodyXML.getGetRecord().getRecord().getMetadata().getAny();

			JAXBContext context;
			try {
				context = JAXBContext.newInstance("es.um.asio.importer.oaipmh.model.xsd",
						ArticuloConferencia.class.getClassLoader());
				Unmarshaller um;

				um = context.createUnmarshaller();

				ArticuloConferencia articuloConf;

				articuloConf = (ArticuloConferencia) um.unmarshal((Node) articuloConfElement);

				logger.debug("response: " + articuloConf.toString());

				domain = new ArticuloConferenciaSGI();
				domain.setVersion(jobExecutionId);
				data = new InputData<DataSetData>();

				ArticuloConferenciaSGI articuloConfSgi = mapper.mapperArticuloConferencia(articuloConf);
				if (bodyXML.getGetRecord().getRecord().getHeader() != null
						&& bodyXML.getGetRecord().getRecord().getHeader().getIdentifier() != null) {
					articuloConfSgi.setId(bodyXML.getGetRecord().getRecord().getHeader().getIdentifier());
				}

				domain = articuloConfSgi;
				data.setData(domain);
				logger.info("Processing DataSetData {}", domain.getClass());
				listArticuloConf.add(data);

				if (articuloConf.getListaDeAutores() != null && articuloConf.getListaDeAutores().getAutor() != null) {
					for (Autor autor : articuloConf.getListaDeAutores().getAutor()) {
						domain = new RelArticuloConferenciaAutores();
						data = new InputData<DataSetData>();
						relArticuloConfAutor = new RelArticuloConferenciaAutores();
						relArticuloConfAutor.setIdArticuloConferencia(articuloConfSgi.getId());
						relArticuloConfAutor.setIdAutor(autor.getId());
						domain = relArticuloConfAutor;
						domain.setVersion(jobExecutionId);
						data.setData(domain);
						logger.info("Processing DataSetData {}", domain.getClass());
						listArticuloConf.add(data);
					}
				}

			} catch (JAXBException e) {
				logger.error(e.getMessage());

			}
		}
		return listArticuloConf;
	}

}
