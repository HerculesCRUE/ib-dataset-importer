package es.um.asio.importer.dataset.config.patentes;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.um.asio.domain.patentes.CostePatente;
import es.um.asio.domain.patentes.EmpresaExplotacionPatente;
import es.um.asio.domain.patentes.EmpresaTitularPatente;
import es.um.asio.domain.patentes.InventorPatente;
import es.um.asio.domain.patentes.Patente;
import es.um.asio.domain.patentes.ProteccionPatente;
import es.um.asio.domain.patentes.SectorIndustrialPatente;
import es.um.asio.importer.config.ImportProperties;
import es.um.asio.importer.dataset.config.DataSetItemReader;

@Configuration
public class ImportPatentesItemReaderConfiguration {

	@Autowired
	protected ImportProperties importDataSetProperties;
		
	@Bean
	@StepScope
	protected  ItemReader<CostePatente> costePatenteReader() {
		return DataSetItemReader.baseReader(CostePatente.class, "dataset/Patentes/Costes patentes.xml", importDataSetProperties.getDataSetPath());
	}
		
	@Bean
	@StepScope
	protected  ItemReader<EmpresaExplotacionPatente> empresaExplotacionPatenteReader() {
		return DataSetItemReader.baseReader(EmpresaExplotacionPatente.class, "dataset/Patentes/Empresas explotan patentes.xml", importDataSetProperties.getDataSetPath());
	}
		
	@Bean
	@StepScope
	protected  ItemReader<EmpresaTitularPatente> empresaTitularPatenteReader() {
		return DataSetItemReader.baseReader(EmpresaTitularPatente.class, "dataset/Patentes/Empresas titulares patentes.xml", importDataSetProperties.getDataSetPath());
	}
	
	@Bean
	@StepScope
	protected  ItemReader<InventorPatente> inventorPatenteReader() {
		return DataSetItemReader.baseReader(InventorPatente.class, "dataset/Patentes/Inventores patentes.xml", importDataSetProperties.getDataSetPath());
	}
	
	@Bean
	@StepScope
	protected ItemReader<Patente> patenteReader() {
		return DataSetItemReader.baseReader(Patente.class, "dataset/Patentes/Patentes.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<ProteccionPatente> proteccionPatenteReader() {
		return DataSetItemReader.baseReader(ProteccionPatente.class, "dataset/Patentes/Protecciones patentes.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<SectorIndustrialPatente> sectorIndustrialPatenteReader() {
		return DataSetItemReader.baseReader(SectorIndustrialPatente.class, "dataset/Patentes/Sectores industriales patentes.xml",
				importDataSetProperties.getDataSetPath());
	}
}
