package es.um.asio.importer.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import es.um.asio.importer.dto.ImportExecutionVO;

public interface ImporterExecutionService {
	
	public Page<ImportExecutionVO> findImporterExecutions(Pageable pageable);
}
