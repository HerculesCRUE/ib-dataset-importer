package es.um.asio.importer.job;

import java.util.ArrayList;

import java.util.List;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.configuration.support.ApplicationContextFactory;
import org.springframework.batch.core.configuration.support.DefaultJobLoader;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import es.um.asio.domain.importer.ImporterSchedule;
import es.um.asio.importer.config.ImportProperties;
import es.um.asio.importer.constants.Constants;
import es.um.asio.importer.cvn.service.CvnService;
import es.um.asio.importer.oaipmh.processor.DataOaipmhProcessor;

@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class ImporterSchedulerJob implements Job {

	public static final String IMPORTER_SCHEDULEE_PARAM = "importerScheduler";

	public static final String RELOAD_JOBS = "reloadJobs";

	private final Logger logger = LoggerFactory.getLogger(ImporterSchedulerJob.class);

	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private JobExplorer jobExplorer;

	@Autowired
	private JobRegistry jobRegistry;

	@Autowired
	private List<org.springframework.batch.core.Job> batchJobs;

	@Autowired
	@Qualifier("ImportDataSetJobContextFactory")
	private ApplicationContextFactory importDataSetJobContextFactory;

	@Autowired
	private CvnService cvnService;
	
	@Autowired
	private DataOaipmhProcessor dataOaipmhProcessor;

	@Autowired
	private ImportProperties importProperties;

	public void execute(JobExecutionContext context) throws JobExecutionException {
		ImporterSchedule importerSchedule = getImporterSchedule(context);

		if (importerSchedule == null) {
			logger.error("execute - No importerSchedule information");
			return;
		}

		List<org.springframework.batch.core.Job> batchJobs = reloadJobs(context, importerSchedule);
		org.springframework.batch.core.Job batchJob = getBatchJob(importerSchedule, batchJobs);

		if (batchJob == null) {
			logger.error(String.format("execute - Non existing batch job. jobName: %s", importerSchedule.getType()));
			return;
		}

		try {
			jobLauncher.run(batchJob,
					new JobParametersBuilder(jobExplorer).getNextJobParameters(batchJob)
							.addString("cron", importerSchedule.getCron())
							.addString("scheduleId", importerSchedule.getEntityId()).toJobParameters());
			logger.info(String.format("execute - Run batch job correctly. %s", importerSchedule.toString()));
		} catch (Exception e) {
			logger.error(String.format("execute - Unknown error. %s", importerSchedule.toString()), e);
		}
	}

	private ImporterSchedule getImporterSchedule(JobExecutionContext context) {
		JobDataMap dataMap = context.getJobDetail().getJobDataMap();

		if (dataMap.get(IMPORTER_SCHEDULEE_PARAM) != null) {
			return (ImporterSchedule) dataMap.get(IMPORTER_SCHEDULEE_PARAM);
		}

		return null;
	}

	private org.springframework.batch.core.Job getBatchJob(ImporterSchedule importerSchedule,
			List<org.springframework.batch.core.Job> batchJobs) {
		if (batchJobs == null) {
			return null;
		}

		return batchJobs.stream().filter(batchJob -> batchJob.getName().equals(importerSchedule.getType())).findFirst()
				.orElse(null);
	}

	private List<org.springframework.batch.core.Job> reloadJobs(JobExecutionContext context,
			ImporterSchedule importerSchedule) {
		if (!hasJobsToBeRealoaded(context)) {
			return batchJobs;
		}

		DefaultJobLoader defaultJobLoader = new DefaultJobLoader(jobRegistry);
		switch (importerSchedule.getType()) {
		case Constants.DATASET_JOB_NAME:
			importProperties.setDataSetPath(importerSchedule.getParams());
			return new ArrayList<org.springframework.batch.core.Job>(
					defaultJobLoader.reload(importDataSetJobContextFactory));
		case Constants.CVN_JOB_NAME:
			importProperties.setCvnEndpoint(importerSchedule.getParams());
			cvnService.setUrl(importProperties.getCvnEndpoint());
			return batchJobs;
		case Constants.OAIPMH_JOB_NAME:
			importProperties.setOaiEndpoint(importerSchedule.getParams());
			dataOaipmhProcessor.setOaiEndpoint(importProperties.getOaiEndpoint());
			return batchJobs;
		default:
			return batchJobs;
		}
	}

	private boolean hasJobsToBeRealoaded(JobExecutionContext context) {
		JobDataMap dataMap = context.getJobDetail().getJobDataMap();

		if (dataMap.get(RELOAD_JOBS) != null && (Boolean) dataMap.get(RELOAD_JOBS)) {
			dataMap.put(RELOAD_JOBS, false);
			return true;
		}

		return false;
	}
}
