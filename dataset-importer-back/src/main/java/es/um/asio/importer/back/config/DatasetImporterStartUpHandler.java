package es.um.asio.importer.back.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import es.um.asio.importer.service.ImporterSchedulerService;

/**
 * DatasetImporterStartUpHandler
 *
 */
@Component
public class DatasetImporterStartUpHandler implements ApplicationRunner {

	@Autowired
	private ImporterSchedulerService importerSchedulerService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		importerSchedulerService.scheduleActiveImporters();
	}

}
