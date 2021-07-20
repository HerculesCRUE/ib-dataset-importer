package es.um.asio.importer.dataset.config.personas;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.um.asio.domain.personas.Persona;
import es.um.asio.importer.config.ImportProperties;
import es.um.asio.importer.dataset.config.DataSetItemReader;

@Configuration
public class ImportPersonasItemReaderConfiguration {

	
	@Autowired
	protected ImportProperties importDataSetProperties;
	
	@Bean
	@StepScope
	protected  ItemReader<Persona> personaReader() {
		return DataSetItemReader.baseReader(Persona.class, "Personas/Personas.xml", importDataSetProperties.getDataSetPath());
	}
}
