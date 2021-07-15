package es.um.asio.importer.back.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImportExecutionDTO {

	private String id;
	
	private String startTime;
	
	private String user;
	
	private String type;
	
	private String cron;	
	
}
