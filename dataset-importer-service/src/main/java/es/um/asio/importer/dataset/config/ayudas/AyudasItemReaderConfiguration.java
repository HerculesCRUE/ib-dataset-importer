package es.um.asio.importer.dataset.config.ayudas;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.um.asio.domain.ayudas.AmortizacionFinanciacionRegistroAyudaDefinitiva;
import es.um.asio.domain.ayudas.AnualidadFinanciacionRegistroAyudaDefinitiva;
import es.um.asio.domain.ayudas.ConvocatoriaAyuda;
import es.um.asio.domain.ayudas.DesgloseGastoRegistroAyudaDefinitiva;
import es.um.asio.domain.ayudas.DesgloseGastoRegistroAyudaProvisional;
import es.um.asio.domain.ayudas.DesgloseGastoSolitudAyuda;
import es.um.asio.domain.ayudas.EntidadColaboradoraSolicitudAyuda;
import es.um.asio.domain.ayudas.EquipoSolicitudAyuda;
import es.um.asio.domain.ayudas.FinanciacionRegistroAyudaDefinitiva;
import es.um.asio.domain.ayudas.FinanciacionUnidadAyuda;
import es.um.asio.domain.ayudas.FuenteUnidadAyuda;
import es.um.asio.domain.ayudas.PartidaConvocatoria;
import es.um.asio.domain.ayudas.ReferenciaUnescoSolicitudAyuda;
import es.um.asio.domain.ayudas.RegistroAyudaDefinitiva;
import es.um.asio.domain.ayudas.RegistroAyudaProvisional;
import es.um.asio.domain.ayudas.SolicitudAyuda;
import es.um.asio.domain.ayudas.SubprogramaAyuda;
import es.um.asio.domain.ayudas.TipoAyuda;
import es.um.asio.domain.ayudas.TipoGastoUnidadAyuda;
import es.um.asio.domain.ayudas.UnidadAyuda;
import es.um.asio.domain.ayudas.UnidadGestoraUnidadAyuda;
import es.um.asio.importer.config.ImportProperties;
import es.um.asio.importer.dataset.config.DataSetItemReader;

@Configuration
public class AyudasItemReaderConfiguration {

	@Autowired
	protected ImportProperties importDataSetProperties;	
	    
    @Bean
    @StepScope
    protected  ItemReader<AmortizacionFinanciacionRegistroAyudaDefinitiva> amortizacionFinanciacionRegistroAyudaDefinitivaReader() {
		return DataSetItemReader.baseReader(AmortizacionFinanciacionRegistroAyudaDefinitiva.class, "dataset/Ayudas/Amortizaciones financiacion registros ayudas definitivas.xml", importDataSetProperties.getDataSetPath());
	}    
	    
    @Bean
    @StepScope
    protected  ItemReader<AnualidadFinanciacionRegistroAyudaDefinitiva> anualidadFinanciacionRegistroAyudaDefinitivaReader() {
		return DataSetItemReader.baseReader(AnualidadFinanciacionRegistroAyudaDefinitiva.class, "dataset/Ayudas/Anualidades financiacion registros ayudas definitivas.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<ConvocatoriaAyuda> convocatoriaAyudaReader() {
		return DataSetItemReader.baseReader(ConvocatoriaAyuda.class, "dataset/Ayudas/Convocatorias ayudas.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<DesgloseGastoRegistroAyudaDefinitiva> desgloseGastoRegistroAyudaDefinitivaReader() {
		return DataSetItemReader.baseReader(DesgloseGastoRegistroAyudaDefinitiva.class, "dataset/Ayudas/Desglose gastos registro ayudas definitivas.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<DesgloseGastoRegistroAyudaProvisional> desgloseGastoRegistroAyudaProvisionalReader() {
		return DataSetItemReader.baseReader(DesgloseGastoRegistroAyudaProvisional.class, "dataset/Ayudas/Desglose gastos registro ayudas provisionales.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<DesgloseGastoSolitudAyuda> desgloseGastoSolitudAyudaReader() {
		return DataSetItemReader.baseReader(DesgloseGastoSolitudAyuda.class, "dataset/Ayudas/Desglose gastos solicitudes ayuda.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<EntidadColaboradoraSolicitudAyuda> entidadColaboradoraSolicitudAyudaReader() {
		return DataSetItemReader.baseReader(EntidadColaboradoraSolicitudAyuda.class, "dataset/Ayudas/Entidades colaboradoras solicitudes ayudas.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<EquipoSolicitudAyuda> equipoSolicitudAyuda() {
		return DataSetItemReader.baseReader(EquipoSolicitudAyuda.class, "dataset/Ayudas/Equipos solicitudes ayuda.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<FinanciacionRegistroAyudaDefinitiva> financiacionRegistroAyudaDefinitivaReader() {
		return DataSetItemReader.baseReader(FinanciacionRegistroAyudaDefinitiva.class, "dataset/Ayudas/Financiacion registros ayudas definitivas.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<FinanciacionUnidadAyuda> financiacionUnidadAyudaReader() {
		return DataSetItemReader.baseReader(FinanciacionUnidadAyuda.class, "dataset/Ayudas/Financiacion unidades ayudas.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<FuenteUnidadAyuda> fuenteUnidadAyudaReader() {
		return DataSetItemReader.baseReader(FuenteUnidadAyuda.class, "dataset/Ayudas/Fuentes unidades ayuda.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<PartidaConvocatoria> partidaConvocatoriaReader() {
		return DataSetItemReader.baseReader(PartidaConvocatoria.class, "dataset/Ayudas/Partidas convocatorias.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<ReferenciaUnescoSolicitudAyuda> referenciaUnescoSolicitudAyudaReader() {
		return DataSetItemReader.baseReader(ReferenciaUnescoSolicitudAyuda.class, "dataset/Ayudas/Referencias unesco solicitudes ayuda.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<RegistroAyudaDefinitiva> registroAyudaDefinitivaReader() {
		return DataSetItemReader.baseReader(RegistroAyudaDefinitiva.class, "dataset/Ayudas/Registros ayudas definitivas.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<RegistroAyudaProvisional> registroAyudaProvisionalReader() {
		return DataSetItemReader.baseReader(RegistroAyudaProvisional.class, "dataset/Ayudas/Registro ayudas provisionales.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<SolicitudAyuda> solicitudAyudaReader() {
		return DataSetItemReader.baseReader(SolicitudAyuda.class, "dataset/Ayudas/Solicitudes ayudas.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<SubprogramaAyuda> subprogramaAyuda() {
		return DataSetItemReader.baseReader(SubprogramaAyuda.class, "dataset/Ayudas/Subprogramas ayudas.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<TipoAyuda> tipoAyudaReader() {
		return DataSetItemReader.baseReader(TipoAyuda.class, "dataset/Ayudas/Tipos ayudas.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<TipoGastoUnidadAyuda> tipoGastoUnidadAyudaReader() {
		return DataSetItemReader.baseReader(TipoGastoUnidadAyuda.class, "dataset/Ayudas/Tipos gastos unidades ayudas.xml", importDataSetProperties.getDataSetPath());
	}	
    
    @Bean
    @StepScope
    protected  ItemReader<UnidadAyuda> unidadAyudaReader() {
		return DataSetItemReader.baseReader(UnidadAyuda.class, "dataset/Ayudas/Unidades ayudass.xml", importDataSetProperties.getDataSetPath());
	}
    
    @Bean
    @StepScope
    protected  ItemReader<UnidadGestoraUnidadAyuda> unidadGestoraUnidadAyudaReader() {
		return DataSetItemReader.baseReader(UnidadGestoraUnidadAyuda.class, "dataset/Ayudas/Unidades gestoras unidades ayudas.xml", importDataSetProperties.getDataSetPath());
	}
}
