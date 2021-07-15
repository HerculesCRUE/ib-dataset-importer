package es.um.asio.importer.config.persistence.properties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DatasourcePoolProperties {
	
	private Integer maxPool;
	
	private Integer minIdle;
}
