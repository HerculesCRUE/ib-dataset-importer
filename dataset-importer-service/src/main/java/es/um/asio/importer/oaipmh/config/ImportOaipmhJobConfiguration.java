package es.um.asio.importer.oaipmh.config;

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

import es.um.asio.importer.constants.Constants;
import es.um.asio.importer.oaipmh.processor.DataOaipmhProcessor;

/**
 * Job that processes XML files and sends them to Kafka topic
 */
@Configuration
public class ImportOaipmhJobConfiguration {

	// Configure job step
	@Bean(name = Constants.OAIPMH_JOB_NAME)
	public Job importOaipmhJob(@Autowired JobBuilderFactory jobBuilderFactory, @Qualifier("JobCompletionNotificationListener") final JobExecutionListener listener,
			@Autowired StepBuilderFactory stepBuilderFactory) {

		Job job = jobBuilderFactory.get(Constants.OAIPMH_JOB_NAME).incrementer(new RunIdIncrementer())
				.listener(listener).start(processSgi(stepBuilderFactory)).build();

		return job;
	}

	@Bean(name = "sgiStep")
	protected Step processSgi(StepBuilderFactory stepBuilderFactory) {
		return stepBuilderFactory.get("sgiStep").tasklet(getitemProcessor()).build();
	}

	// (Processor)
	@Bean(name = "OaipmhProcessor")
	public DataOaipmhProcessor getitemProcessor() {
		return new DataOaipmhProcessor();
	}
}
