package es.um.asio.importer.service;

import es.um.asio.domain.importer.ImporterSchedule;

public interface ImporterSchedulerService extends DatasetService<ImporterSchedule> {
	
	/**
	 * Schedule all active dataset importer jobs  
	 */
	public void scheduleActiveImporters();
	
	/**
	 * Schedule a dataset importer job
	 * 
	 * @param importerSchedule {@link ImporterSchedule} dataset importer job data
	 */
	public void createSchedule(ImporterSchedule importerSchedule);

}
