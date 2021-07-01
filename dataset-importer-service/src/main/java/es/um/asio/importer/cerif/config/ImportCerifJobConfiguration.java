package es.um.asio.importer.cerif.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.um.asio.importer.cerif.processor.DataCerifProcessor;
import es.um.asio.importer.constants.Constants;

/**
 * Job that processes XML files and sends them to Kafka topic
 */
@Configuration
public class ImportCerifJobConfiguration {

	// Configure job step
	@Bean(name = Constants.CERIF_JOB_NAME)
	public Job importCerifJob(@Autowired JobBuilderFactory jobBuilderFactory,
			@Qualifier("JobCompletionNotificationListener") final JobExecutionListener listener,
			@Autowired StepBuilderFactory stepBuilderFactory) {

		Job job = jobBuilderFactory.get(Constants.CERIF_JOB_NAME).incrementer(new RunIdIncrementer()).listener(listener)
				.start(processCerif(stepBuilderFactory)).build();

		return job;
	}

	@Bean(name = "cerifStep")
	protected Step processCerif(StepBuilderFactory stepBuilderFactory) {
		return stepBuilderFactory.get("cerifStep").tasklet(getitemProcessor()).build();
	}

	// (Processor)
	@Bean(name = "CerifProcessor")
	public DataCerifProcessor getitemProcessor() {
		return new DataCerifProcessor();
	}
}
