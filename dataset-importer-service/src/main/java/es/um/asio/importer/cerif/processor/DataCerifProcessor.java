package es.um.asio.importer.cerif.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;

import es.um.asio.importer.cerif.service.CerifService;

public class DataCerifProcessor implements Tasklet {
	/**
	 * The job execution id.
	 */
	private long jobExecutionId;

	@Autowired
	private CerifService cerifService;

	/**
	 * @inheritDoc
	 */
	@BeforeStep
	public void beforeStep(StepExecution stepExecution) {
		jobExecutionId = stepExecution.getJobExecutionId();
	}

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		cerifService.importCerifData(jobExecutionId);
		return RepeatStatus.FINISHED;
	}
}
