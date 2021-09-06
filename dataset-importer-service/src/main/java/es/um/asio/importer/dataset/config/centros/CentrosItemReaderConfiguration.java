package es.um.asio.importer.dataset.config.centros;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.um.asio.domain.centros.Centro;
import es.um.asio.domain.centros.Departamento;
import es.um.asio.importer.config.ImportProperties;
import es.um.asio.importer.dataset.config.DataSetItemReader;

/**
 * @class CentrosItemReaderConfiguration
 *
 */
@Configuration
public class CentrosItemReaderConfiguration {

	@Autowired
	protected ImportProperties importDataSetProperties;

	@Bean
	@StepScope
	protected ItemReader<Centro> centroReader() {
		return DataSetItemReader.baseReader(Centro.class, "dataset/Centros/Centros.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<Departamento> departamentoReader() {
		return DataSetItemReader.baseReader(Departamento.class, "dataset/Centros/Departamentos.xml",
				importDataSetProperties.getDataSetPath());
	}

}
