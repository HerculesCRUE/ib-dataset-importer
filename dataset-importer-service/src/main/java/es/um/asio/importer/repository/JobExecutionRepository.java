package es.um.asio.importer.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import es.um.asio.domain.importer.JobExecution;

public interface JobExecutionRepository extends PagingAndSortingRepository<JobExecution, Long> {

	List<JobExecution> findBy(Pageable pageable);
}
