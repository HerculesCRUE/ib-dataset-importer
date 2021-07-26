package es.um.asio.importer.cerif.processor.mappings;

import es.um.asio.domain.InputData;
import es.um.asio.domain.cerif.BaseCerif;
import es.um.asio.domain.cerif.BaseIdCerif;
import es.um.asio.importer.cerif.oaipmh.MetadataType;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ResponseGetRecordMapper {

	@Getter
	public enum XsdContextPaths {
		OAIPMH("es.um.asio.importer.oaipmh.model.xsd"), CERIF("es.um.asio.importer.cerif.model");

		private String path;

		XsdContextPaths(String path) {
			this.path = path;
		}
	}

	private static final Logger logger = LoggerFactory.getLogger(ResponseGetRecordMapper.class);

	public static <T> List<InputData<? extends BaseCerif>> mapOAIPHtypeToInputDatas(MetadataType metedata, String id, long jobExecutionId,
			XsdContextPaths contextPath, Class<T> type, Function<T, List<? extends BaseCerif>> mapperXmlToDataSetData) {
		return getObjectFromBody(metedata)
				.map(object -> mapObjectToInputDatas(object, id, jobExecutionId, contextPath, type, mapperXmlToDataSetData))
				.orElseGet(()->Collections.emptyList());
	}

	private static Optional<Object> getObjectFromBody(MetadataType metedata) {
		if (metedata.getAny() != null) {
			return Optional.of(metedata.getAny());
		}

		return Optional.empty();
	}

	private static <T> List<InputData<? extends BaseCerif>> mapObjectToInputDatas(Object objectBody, String id, long jobExecutionId,
			XsdContextPaths contextPath, Class<T> type, Function<T, List<? extends BaseCerif>> mapperXmlToDataSetData) {
		List<InputData<? extends BaseCerif>> listInputData = new ArrayList<>();

		try {
			JAXBContext context = JAXBContext.newInstance(contextPath.getPath(), type.getClassLoader());
			Unmarshaller um = context.createUnmarshaller();

			JAXBElement<T> jaxbElement = (JAXBElement) um.unmarshal((Node) objectBody);			
			T inputData =  jaxbElement.getValue();			
			logger.debug("response: " + inputData.toString());

			List<? extends BaseCerif> datasetDatas = mapperXmlToDataSetData.apply(inputData);
			for (BaseCerif datasetData : datasetDatas) {
				datasetData.setVersion(jobExecutionId);
				if(datasetData instanceof BaseIdCerif) {
					((BaseIdCerif) datasetData).setId(id);
				}
				InputData<BaseCerif> data = new InputData<BaseCerif>();
				data.setData(datasetData);
				logger.info("Processing DataSetData {}", datasetData.getClass());
				listInputData.add(data);
			}
		} catch (JAXBException e) {
			logger.error(e.getMessage());
		}

		return listInputData;
	}
}
