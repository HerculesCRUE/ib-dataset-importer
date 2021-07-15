package es.um.asio.importer.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImportExecutionVO {
	
	private Long id;
	
	private String scheduleId;
	
	private String type;
	
	private String user;
	
	private String cron;
	
	private String params;
	
	private Date startTime;
	
	private Date endTime;
	
	private String status;	
}
