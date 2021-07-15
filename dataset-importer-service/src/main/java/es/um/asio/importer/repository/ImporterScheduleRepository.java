package es.um.asio.importer.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.um.asio.domain.importer.ImporterSchedule;

public interface ImporterScheduleRepository extends JpaRepository<ImporterSchedule, String> {

	List<ImporterSchedule> findByDeletedDateIsNull();
		
	@Query(value = "SELECT bse.JOB_EXECUTION_ID, type, user, cron, params, START_TIME , END_TIME , STATUS "
			+ "FROM BATCH_JOB_EXECUTION bse INNER JOIN BATCH_JOB_EXECUTION_PARAMS bjep ON bse.JOB_EXECUTION_ID = bjep.JOB_EXECUTION_ID AND bjep.KEY_NAME = 'scheduleId' "
			+ " INNER JOIN importer_schedule is2 on is2.ENTITY_ID = STRING_VAL ORDER BY ?#{#pageable}",
		   countQuery = "SELECT count(*) FROM BATCH_JOB_EXECUTION",
		   nativeQuery = true)
	List<Object[]> findImporterExecutions(Pageable pageable);
}
