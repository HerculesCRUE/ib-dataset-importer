package es.um.asio.importer.dataset.config.actividades;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.um.asio.domain.actividades.Actividad;
import es.um.asio.domain.actividades.FacturaEmitidaActividad;
import es.um.asio.domain.actividades.GrupoActividades;
import es.um.asio.domain.actividades.GrupoActividadesProyecto;
import es.um.asio.domain.actividades.ImpuestoRepercutidoActividad;
import es.um.asio.domain.actividades.TipoActividad;
import es.um.asio.importer.config.ImportProperties;
import es.um.asio.importer.dataset.config.DataSetItemReader;

@Configuration
public class ActividadesItemReaderConfiguration {

	
	@Autowired
	protected ImportProperties importDataSetProperties;	
    
    @Bean
    @StepScope
    protected  ItemReader<Actividad> actividadReader() {
		return DataSetItemReader.baseReader(Actividad.class, "dataset/Actividades/Actividades.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<FacturaEmitidaActividad> facturaEmitidaActividadReader() {
		return DataSetItemReader.baseReader(FacturaEmitidaActividad.class, "dataset/Actividades/Facturas emitidas actividades.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<GrupoActividadesProyecto> grupoActividadesProyectoReader() {
		return DataSetItemReader.baseReader(GrupoActividadesProyecto.class, "dataset/Actividades/Grupos actividades proyectos.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<GrupoActividades> grupoActividadesReader() {
		return DataSetItemReader.baseReader(GrupoActividades.class, "dataset/Actividades/Grupos actividades.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<ImpuestoRepercutidoActividad> impuestoRepercutidoActividadReader() {
		return DataSetItemReader.baseReader(ImpuestoRepercutidoActividad.class, "dataset/Actividades/Impuestos repercutidos actividades.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean(name = "tipoActividadActividad")
    @StepScope
    protected  ItemReader<TipoActividad> tipoActividadReader() {
		return DataSetItemReader.baseReader(TipoActividad.class, "dataset/Actividades/Tipos actividades.xml", importDataSetProperties.getDataSetPath());
	}
}
