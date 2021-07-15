package es.um.asio.importer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import es.um.asio.domain.importer.ImporterSchedule;
import es.um.asio.domain.importer.JobExecution;
import es.um.asio.domain.importer.JobExecutionParameter;
import es.um.asio.importer.dto.ImportExecutionVO;
import es.um.asio.importer.repository.ImporterScheduleRepository;
import es.um.asio.importer.repository.JobExecutionParameterRepository;
import es.um.asio.importer.repository.JobExecutionRepository;
import es.um.asio.importer.service.ImporterExecutionService;

@Service
public class ImporterExecutionServiceImpl implements ImporterExecutionService{

	@Autowired
	private ImporterScheduleRepository repository;
	
	@Autowired
	private JobExecutionRepository jobExecutionRepository;
	
	@Autowired
	private JobExecutionParameterRepository jobExecutionParameterRepository;
	
	@Override
	public Page<ImportExecutionVO> findImporterExecutions(Pageable pageable) {		
		return jobExecutionRepository.findAll(pageable)
			.map(this::mapJobExecutionToImportExecutionVO)
			.map(this::fillJobExecutionParameters)			
			.map(this::fillImportScheduleDatta);					
	}
	
	private ImportExecutionVO mapJobExecutionToImportExecutionVO(JobExecution jobExecution) {
		ImportExecutionVO executionVO = new ImportExecutionVO();
		
		executionVO.setId(jobExecution.getId());
		executionVO.setStartTime(jobExecution.getStartTime());
		executionVO.setEndTime(jobExecution.getEndTime());		
		executionVO.setStatus(jobExecution.getStatus());
		
		return executionVO;
	}
	
	private ImportExecutionVO fillJobExecutionParameters(ImportExecutionVO importExecutionVO) {
		String scheduleId = jobExecutionParameterRepository.findFirstByJobExecutionIdAndKey(importExecutionVO.getId(), "scheduleId")
				.map(JobExecutionParameter::getValue).orElse(null);
		importExecutionVO.setScheduleId(scheduleId);
		return importExecutionVO;
	}
	
	private ImportExecutionVO fillImportScheduleDatta(ImportExecutionVO importExecutionVO) {
		if (importExecutionVO.getScheduleId() == null) {
			return importExecutionVO;
		}
		
		ImporterSchedule importerSchedule = repository.findById(importExecutionVO.getScheduleId()).orElse(null);
		
		if (importerSchedule != null) {
			importExecutionVO.setCron(importerSchedule.getCron());
			importExecutionVO.setType(importerSchedule.getType());
			importExecutionVO.setUser(importerSchedule.getUser());
		}
		
		return importExecutionVO;
	}	
}
