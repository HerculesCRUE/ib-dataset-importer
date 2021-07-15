package es.um.asio.importer.util;

import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.batch.core.JobExecution;

import es.um.asio.abstractions.domain.ExitStatusCode;
import es.um.asio.abstractions.domain.JobType;
import es.um.asio.domain.importResult.ImportResult;
import es.um.asio.importer.constants.Constants;

/**
 * Utils for ImportResult class.
 */
public class ImportResultUtil {

	private ImportResultUtil() {
		throw new IllegalStateException("Utility class");
	}

	/**
	 * Creates an {@link ImportResult} from {@link JobExecution}.
	 *
	 * @param jobExecution the job execution
	 * @return the import result
	 */
	public static ImportResult createFrom(JobExecution jobExecution) {
		JobType jobType = JobType.UNKNOWN;
		if (jobExecution.getJobInstance().getJobName().equals(Constants.DATASET_JOB_NAME)) {
			jobType = JobType.DATASET;
		} else if (jobExecution.getJobInstance().getJobName().equals(Constants.CVN_JOB_NAME)) {
			jobType = JobType.CVN;
		} else if (jobExecution.getJobInstance().getJobName().equals(Constants.OAIPMH_JOB_NAME)) {
			jobType = JobType.OAIPMH;
		} else if (jobExecution.getJobInstance().getJobName().equals(Constants.CERIF_JOB_NAME)) {
			jobType = JobType.CERIF;
		}

		ImportResult importResult = ImportResult.builder().startTime(jobExecution.getStartTime())
				.endTime(jobExecution.getEndTime())
				.exitStatusCode(ExitStatusCode.valueOf(jobExecution.getExitStatus().getExitCode())).jobType(jobType)
				.build();
		importResult.setVersion(jobExecution.getId());

		return importResult;
	}

	public static Date xmlGregorianCalendarToDate(XMLGregorianCalendar xcal) {
		if (xcal == null) {
			return null;
		}

		return xcal.toGregorianCalendar().getTime();
	}
}
