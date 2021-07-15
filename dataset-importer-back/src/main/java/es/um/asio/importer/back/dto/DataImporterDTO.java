package es.um.asio.importer.back.dto;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DataImporterDTO {
	
	@NotBlank
	private String type;
	
	@NotBlank
	private String cron;
	
	private String param;
	
	@NotBlank
	private String user;
}
