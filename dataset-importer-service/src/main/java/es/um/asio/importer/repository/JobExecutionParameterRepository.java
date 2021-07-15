package es.um.asio.importer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import es.um.asio.domain.importer.JobExecutionParameter;

public interface JobExecutionParameterRepository extends JpaRepository<JobExecutionParameter, Long>{

	Optional<JobExecutionParameter> findFirstByJobExecutionIdAndKey(Long jobExecutionId, String key);
}
