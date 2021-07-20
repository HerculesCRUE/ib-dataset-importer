package es.um.asio.importer.dataset.config;

import java.util.UUID;

import org.springframework.batch.core.ItemReadListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import es.um.asio.domain.DataSetData;
import es.um.asio.domain.InputData;
import es.um.asio.importer.dataset.processor.DataItemProcessor;
import es.um.asio.importer.writer.DataItemWriter;

/**
 * Base class to generate a {@link Flow} that converts and send XML to Kafka
 * topic
 */
public abstract class ImportDataSetFlowConfigurationBase {

	/**
	 * The step builder factory.
	 */
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	private ItemReadListener<DataSetData> itemListener;

	/**
	 * Generates the import {@link Flow}
	 *
	 * @return
	 */
	public abstract Flow getFlow();

	/**
	 * Gets the {@link Flow} name
	 *
	 * @return the flow name
	 */
	protected abstract String getFlowName();

	/**
	 * Creates an instance of {@link Step} for {@link type}
	 *
	 * @param <T>      the generic type
	 * @param type     the type
	 * @param filePath the XML file path
	 * @return the step
	 */
	protected <T extends DataSetData> Step createStep(Class<T> type, ItemReader<T> reader) {
		return this.stepBuilderFactory.get(type.getClass().getSimpleName().concat("-").concat(UUID.randomUUID().toString()))
				.<DataSetData, InputData<DataSetData>>chunk(1000)
				.reader(reader)
				.processor(getProcessor())
				.writer(getWriter())				
				.listener(itemListener)
				.build();
	}

	/**
	 * Gets an instance of {@link DataItemProcessor}
	 *
	 * @return the processor
	 */
	@Bean
	protected ItemProcessor<DataSetData, InputData<DataSetData>> getProcessor() {
		return new DataItemProcessor();
	}

	/**
	 * Gets an instance of {@link DataItemWriter}
	 *
	 * @return the processor
	 */
	@Bean
	protected ItemWriter<InputData<DataSetData>> getWriter() {
		return new DataItemWriter();
	}
}
