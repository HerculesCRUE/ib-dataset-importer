package es.um.asio.importer.dataset.config.contratos;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.um.asio.domain.contratos.AnualidadContratoProyecto;
import es.um.asio.domain.contratos.ContratoProyecto;
import es.um.asio.domain.contratos.DesgloseGastoContratoProyecto;
import es.um.asio.domain.contratos.DesgloseGastoProrrogaContrato;
import es.um.asio.domain.contratos.EquipoContratoProyecto;
import es.um.asio.domain.contratos.ImpuestoContratoProyecto;
import es.um.asio.domain.contratos.ImpuestoProrrogaContrato;
import es.um.asio.domain.contratos.PatenteContratoProyecto;
import es.um.asio.domain.contratos.ProrrogaContratoProyecto;
import es.um.asio.importer.config.ImportProperties;
import es.um.asio.importer.dataset.config.DataSetItemReader;

@Configuration
public class ContratosItemReaderConfiguration {

	@Autowired
	protected ImportProperties importDataSetProperties;	
	   
	@Bean
	@StepScope
	protected  ItemReader<AnualidadContratoProyecto> anualidadContratoProyectoReader() {
		return DataSetItemReader.baseReader(AnualidadContratoProyecto.class, "dataset/Contratos/Anualidades contratos proyectos.xml", importDataSetProperties.getDataSetPath());
	}	
	   
	@Bean
	@StepScope
	protected  ItemReader<ContratoProyecto> contratoProyectoReader() {
		return DataSetItemReader.baseReader(ContratoProyecto.class, "dataset/Contratos/Contratos proyectos.xml", importDataSetProperties.getDataSetPath());
	}	
	   
	@Bean
	@StepScope
	protected  ItemReader<DesgloseGastoContratoProyecto> desgloseGastoContratoProyectoReader() {
		return DataSetItemReader.baseReader(DesgloseGastoContratoProyecto.class, "dataset/Contratos/Desglose gastos contratos proyectos.xml", importDataSetProperties.getDataSetPath());
	}	
	   
	@Bean
	@StepScope
	protected  ItemReader<DesgloseGastoProrrogaContrato> desgloseGastoProrrogaContratoReader() {
		return DataSetItemReader.baseReader(DesgloseGastoProrrogaContrato.class, "dataset/Contratos/Desglose gastos prorrogas contratos.xml", importDataSetProperties.getDataSetPath());
	}	
	   
	@Bean
	@StepScope
	protected  ItemReader<EquipoContratoProyecto> equipoContratoProyectoReader() {
		return DataSetItemReader.baseReader(EquipoContratoProyecto.class, "dataset/Contratos/Equipos contratos proyectos.xml", importDataSetProperties.getDataSetPath());
	}	
	   
	@Bean
	@StepScope
	protected  ItemReader<ImpuestoContratoProyecto> impuestoContratoProyectoReader() {
		return DataSetItemReader.baseReader(ImpuestoContratoProyecto.class, "dataset/Contratos/Impuestos contratos proyectos.xml", importDataSetProperties.getDataSetPath());
	}	
	   
	@Bean
	@StepScope
	protected  ItemReader<ImpuestoProrrogaContrato> impuestoProrrogaContratoReader() {
		return DataSetItemReader.baseReader(ImpuestoProrrogaContrato.class, "dataset/Contratos/Impuestos prorrogas contratos.xml", importDataSetProperties.getDataSetPath());
	}	
	   
	@Bean
	@StepScope
	protected  ItemReader<PatenteContratoProyecto> patenteContratoProyectoReader() {
		return DataSetItemReader.baseReader(PatenteContratoProyecto.class, "dataset/Contratos/Patentes contratos proyectos.xml", importDataSetProperties.getDataSetPath());
	}	
	   
	@Bean
	@StepScope
	protected  ItemReader<ProrrogaContratoProyecto> prorrogaContratoProyectoReader() {
		return DataSetItemReader.baseReader(ProrrogaContratoProyecto.class, "dataset/Contratos/Prorrogas contratos proyectos.xml", importDataSetProperties.getDataSetPath());
	}
	
}
