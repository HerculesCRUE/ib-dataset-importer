package es.um.asio.importer.cerif.processor;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;

import es.um.asio.importer.cerif.service.CerifService;

public class DataCerifProcessor implements Tasklet {

	@Autowired
	private CerifService cerifService;

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {		
		cerifService.importCerifData(contribution.getStepExecution().getJobExecution().getId());
		return RepeatStatus.FINISHED;
	}
}
