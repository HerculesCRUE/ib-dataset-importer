package es.um.asio.importer.service.impl;

import java.security.InvalidParameterException;
import java.util.Date;

import org.quartz.CronExpression;
import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Service;

import es.um.asio.domain.importer.ImporterSchedule;
import es.um.asio.importer.job.ImporterSchedulerJob;
import es.um.asio.importer.repository.ImporterScheduleRepository;
import es.um.asio.importer.service.ImporterSchedulerService;

@Service
public class ImporterSchedulerServiceImpl implements ImporterSchedulerService {

	public static final String IMPORTER_SCHEDULER_GROUP = "ImporterSchedulerGroup";

	private final Logger logger = LoggerFactory.getLogger(ImporterSchedulerServiceImpl.class);

	/**
	 * {@link ImporterSchedule} repository.
	 */
	@Autowired
	private ImporterScheduleRepository repository;
	

	@Autowired
	private SchedulerFactoryBean schedulerFactoryBean;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ImporterSchedule save(final ImporterSchedule importerSchedule) {
		return this.repository.save(importerSchedule);
	}

	@Override
	public void scheduleActiveImporters() {
		repository.findByDeletedDateIsNull().stream().forEach(this::scheduleImporter);
	}

	@Override
	public void createSchedule(final ImporterSchedule importerSchedule) {
		validateParameters(importerSchedule);

		ImporterSchedule previous = repository.findByDeletedDateIsNull().stream()
				.filter(importer -> importer.getType().equals(importerSchedule.getType())).findFirst().orElse(null);

		if (!hasToBeScheduled(previous, importerSchedule)) {
			logger.warn(
					String.format("createSchedule - Same previous cron expression and params. previous: %s, new: %s",
							previous.toString(), importerSchedule.toString()));
			return;
		}

		if (previous != null) {
			previous.setDeletedDate(new Date());
			repository.save(previous);
		}

		ImporterSchedule importerScheduleSaved = repository.save(importerSchedule);
		scheduleImporter(importerScheduleSaved, hasToReloadJobs(previous, importerScheduleSaved));
	}	


	private void scheduleImporter(ImporterSchedule importerSchedule) {
		scheduleImporter(importerSchedule, true);
	}

	private void scheduleImporter(ImporterSchedule importerSchedule, boolean reload) {
		if (isScheduled(importerSchedule)) {
			deleteSchedule(importerSchedule);
		}
		schedule(importerSchedule, reload);
	}

	private void deleteSchedule(ImporterSchedule importerSchedule) {
		Scheduler scheduler = schedulerFactoryBean.getScheduler();
		try {
			JobKey jobKey = new JobKey(importerSchedule.getType(), IMPORTER_SCHEDULER_GROUP);
			scheduler.deleteJob(jobKey);
		} catch (Exception e) {
			logger.error(String.format("reschedule - Unknown error. %s", importerSchedule.toString()), e);
		}
	}

	private void schedule(ImporterSchedule importerSchedule, boolean reload) {
		try {
			Scheduler scheduler = schedulerFactoryBean.getScheduler();

			JobDetail job = JobBuilder.newJob(ImporterSchedulerJob.class)
					.withIdentity(new JobKey(importerSchedule.getType(), IMPORTER_SCHEDULER_GROUP)).build();
			job.getJobDataMap().put(ImporterSchedulerJob.IMPORTER_SCHEDULEE_PARAM, importerSchedule);
			job.getJobDataMap().put(ImporterSchedulerJob.RELOAD_JOBS, reload);

			CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(new TriggerKey(importerSchedule.getType()))
					.withSchedule(CronScheduleBuilder.cronSchedule(importerSchedule.getCron()).withMisfireHandlingInstructionDoNothing()).build();

			scheduler.scheduleJob(job, trigger);
			logger.info(String.format("schedule - Scheduled quartz job. %s", importerSchedule.toString()));
		} catch (Exception e) {
			logger.error(String.format("schedule - Unknown error. %s", importerSchedule.toString()), e);
		}
	}
	
	private boolean isScheduled(ImporterSchedule importerSchedule) {
		Scheduler scheduler = schedulerFactoryBean.getScheduler();
		JobKey jobKey = new JobKey(importerSchedule.getType(), IMPORTER_SCHEDULER_GROUP);
		try {
			if (scheduler.checkExists(jobKey)) {
				return true;
			}
		} catch (SchedulerException e) {

		}

		return false;
	}

	private boolean isValidCronExpression(String cron) {
		return CronExpression.isValidExpression(cron);
	}

	private boolean hasToBeScheduled(ImporterSchedule previous, ImporterSchedule current) {
		return previous == null || !previous.getCron().equals(current.getCron()) || isDifferentParam(previous, current);
	}

	private boolean isDifferentParam(ImporterSchedule previous, ImporterSchedule current) {
		return previous == null
				|| (previous.getParams() != null && !previous.getParams().equals(current.getParams()))
				|| (current.getParams() != null && !current.getParams().equals(previous.getParams()));
	}

	private void validateParameters(final ImporterSchedule importerSchedule) {
		if (importerSchedule == null || importerSchedule.getType() == null
				|| !isValidCronExpression(importerSchedule.getCron())) {
			throw new InvalidParameterException();
		}
	}

	private boolean hasToReloadJobs(ImporterSchedule previous, ImporterSchedule current) {
		return isDifferentParam(previous, current);
	}
}
