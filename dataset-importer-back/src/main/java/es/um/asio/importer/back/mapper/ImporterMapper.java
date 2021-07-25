package es.um.asio.importer.back.mapper;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import es.um.asio.domain.importer.ImporterSchedule;
import es.um.asio.importer.back.dto.DataImporterDTO;
import es.um.asio.importer.back.dto.ImportExecutionDTO;
import es.um.asio.importer.constants.Constants;
import es.um.asio.importer.dto.ImportExecutionVO;

@Component
public class ImporterMapper {
	
	public ImporterSchedule mapDataImporterDTOToImporterSchedule (DataImporterDTO dataImporterDTO) {
		if (dataImporterDTO == null) {
			return null;
		}
		
		ImporterSchedule importerSchedule = new ImporterSchedule();

		importerSchedule.setType(mapTypeToJobName(dataImporterDTO.getType()));
		importerSchedule.setCron(dataImporterDTO.getCron());
		importerSchedule.setUser(dataImporterDTO.getUser());
		importerSchedule.setVersion(1L);
		importerSchedule.setCreatedDate(new Date());
		importerSchedule.setParams(dataImporterDTO.getParam());
		
		return importerSchedule;
	}
	
	public ImportExecutionDTO mapImportExecutionVOToImportExecutionDTO (ImportExecutionVO importExecutionVO) {
		if (importExecutionVO == null) {
			return null;
		}
		
		ImportExecutionDTO importExecutionDTO = new ImportExecutionDTO();

		importExecutionDTO.setCron(importExecutionVO.getCron());
		importExecutionDTO.setId(importExecutionVO.getId().toString());
		importExecutionDTO.setUser(importExecutionVO.getUser());
		importExecutionDTO.setStartTime(importExecutionVO.getEndTime() != null ? new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(importExecutionVO.getEndTime()):null);
		importExecutionDTO.setType(mapJobNameToType(importExecutionVO.getType()));
				
		return importExecutionDTO;
	}
	
	private String mapTypeToJobName(String type) {		
		if (type == null) {
			return null;			
		}
		
		if (type.equals("cvn")) {
			return Constants.CVN_JOB_NAME;
		}
		
		if (type.equals("dataset")) {
			return Constants.DATASET_JOB_NAME;
		}
		
		if (type.equals("oaipmh")) {
			return Constants.OAIPMH_JOB_NAME;
		}
		
		if (type.equals("cerif")) {
			return Constants.CERIF_JOB_NAME;
		}
		
		return null;
	}
	
	private String mapJobNameToType(String jobName) {		
		if (jobName == null) {
			return null;			
		}		
		
		if (jobName.equals(Constants.CVN_JOB_NAME)) {
			return "cvn";
		}
		
		if (jobName.equals(Constants.DATASET_JOB_NAME)) {
			return "dataset";
		}
		
		if (jobName.equals(Constants.OAIPMH_JOB_NAME)) {
			return "oaipmh";
		}
		
		if (jobName.equals(Constants.CERIF_JOB_NAME)) {
			return "cerif";
		}
		
		return null;
	}
}
