package es.um.asio.importer.dataset.config;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.xml.StaxEventItemReader;
import org.springframework.core.io.Resource;

import es.um.asio.domain.DataSetData;
import es.um.asio.importer.dataset.reader.XmlEventItemReader;
import es.um.asio.importer.marshaller.DataConverter;
import es.um.asio.importer.marshaller.DataSetFieldSetMapper;
import es.um.asio.importer.marshaller.DataSetMarshaller;
import es.um.asio.importer.util.ResourceUtil;

public class DataSetItemReader {
	
	public static <T extends DataSetData>  ItemReader<T> baseReader(Class<T> type, String filePath, String basePath) {
		final Map<String, String> propertiesBinding = new HashMap<>();
		for (Field field : type.getDeclaredFields()) {
			String fieldName = field.getName();
			propertiesBinding.put(fieldName, fieldName);
		}
		propertiesBinding.put(DataSetMarshaller.ACCION_ENTIDAD, "operation");

		final DataConverter<T> converter = new DataConverter<>();
		converter.setFieldSetMapper(new DataSetFieldSetMapper<T>(type));
		converter.setPropertiesBinding(propertiesBinding);
		converter.getFieldSetMapper().setDistanceLimit(3);
		final DataSetMarshaller<T> ummarshaller = new DataSetMarshaller<>(type);
		ummarshaller.setConverters(converter);

		final StaxEventItemReader<T> reader = new XmlEventItemReader<>();
		reader.setUnmarshaller(ummarshaller);
		reader.setFragmentRootElementName(DataSetMarshaller.DATA_RECORD);

		CustomMultiResourceItemReader<T> multiReader = new CustomMultiResourceItemReader<>();
		multiReader.setResources(getRelatedResources(filePath, basePath));
		multiReader.setDelegate(reader);

		return multiReader;
	}

	/**
	 * Returns the Resource that represents {@link filePath}, and all Resources
	 * related with {@link filePath}. Typically, related resources contains same
	 * file name as {@link filePath} but end with number. Example: test/filename.xml
	 * Related files: test/filename2.xml test/filename3.xml
	 * 
	 * @param path the path
	 * @return the related resources
	 */
	private static Resource[] getRelatedResources(final String path, final String basePath) {
		boolean isClassPathResource = StringUtils.isBlank(basePath);
		String filePath = isClassPathResource ? path
				: new File(basePath, path).getPath();	
		try {
			return ResourceUtil.getRelatedResources(filePath, isClassPathResource);
		} catch (IOException e) {
			return new Resource[] { ResourceUtil.getFile(filePath, isClassPathResource) };
		}
	}

}
