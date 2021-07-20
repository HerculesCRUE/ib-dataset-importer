package es.um.asio.importer.dataset.config.recursoshumanos;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.um.asio.domain.recursosHumanos.ConvocatoriaRecursosHumanos;
import es.um.asio.domain.recursosHumanos.IdiomaSolicitudRecursosHumanos;
import es.um.asio.domain.recursosHumanos.MeritosSolicitudRecursosHumanos;
import es.um.asio.domain.recursosHumanos.RegistroRecursosHumanosConcedido;
import es.um.asio.domain.recursosHumanos.RegistroRecursosHumanosProvisional;
import es.um.asio.domain.recursosHumanos.SolicitudRecursosHumanos;
import es.um.asio.domain.recursosHumanos.SolicitudRecursosHumanosConcedido;
import es.um.asio.domain.recursosHumanos.SolicitudRegistroRecursosHumanosProvisional;
import es.um.asio.domain.recursosHumanos.SubprogramaRecursosHumanos;
import es.um.asio.domain.recursosHumanos.TipoRecursosHumanos;
import es.um.asio.domain.recursosHumanos.UnidadRecursosHumanos;
import es.um.asio.importer.config.ImportProperties;
import es.um.asio.importer.dataset.config.DataSetItemReader;

@Configuration
public class ImportRecursosHumanosItemReaderConfiguration {

	@Autowired
	protected ImportProperties importDataSetProperties;
	
	@Bean
	@StepScope
	protected  ItemReader<ConvocatoriaRecursosHumanos> convocatoriaRecursosHumanosReader() {
		return DataSetItemReader.baseReader(ConvocatoriaRecursosHumanos.class, "dataset/Recursos Humanos/Convocatorias recursos humanos.xml", importDataSetProperties.getDataSetPath());
	}
	
	@Bean
	@StepScope
	protected  ItemReader<IdiomaSolicitudRecursosHumanos> idiomaSolicitudRecursosHumanosReader() {
		return DataSetItemReader.baseReader(IdiomaSolicitudRecursosHumanos.class, "dataset/Recursos Humanos/Idiomas solicitudes recursos humanos.xml", importDataSetProperties.getDataSetPath());
	}
	
	@Bean
	@StepScope
	protected  ItemReader<MeritosSolicitudRecursosHumanos> meritosSolicitudRecursosHumanosReader() {
		return DataSetItemReader.baseReader(MeritosSolicitudRecursosHumanos.class, "dataset/Recursos Humanos/Meritos solicitudes recursos humanos.xml", importDataSetProperties.getDataSetPath());
	}
	
	@Bean
	@StepScope
	protected  ItemReader<RegistroRecursosHumanosConcedido> registroRecursosHumanosConcedidoReader() {
		return DataSetItemReader.baseReader(RegistroRecursosHumanosConcedido.class, "dataset/Recursos Humanos/Registro recurso humano concedido.xml", importDataSetProperties.getDataSetPath());
	}
	
	@Bean
	@StepScope
	protected  ItemReader<RegistroRecursosHumanosProvisional> registroRecursosHumanosProvisionalReader() {
		return DataSetItemReader.baseReader(RegistroRecursosHumanosProvisional.class, "dataset/Recursos Humanos/Registro recurso humano provisional.xml", importDataSetProperties.getDataSetPath());
	}
	
	@Bean
	@StepScope
	protected  ItemReader<SolicitudRecursosHumanosConcedido> solicitudRecursosHumanosConcedidoReader() {
		return DataSetItemReader.baseReader(SolicitudRecursosHumanosConcedido.class, "dataset/Recursos Humanos/Solicitudes recurso humano concendido.xml", importDataSetProperties.getDataSetPath());
	}
	
	@Bean
	@StepScope
	protected  ItemReader<SolicitudRecursosHumanos> solicitudRecursosHumanosReader() {
		return DataSetItemReader.baseReader(SolicitudRecursosHumanos.class, "dataset/Recursos Humanos/Solicitudes recursos humanos.xml", importDataSetProperties.getDataSetPath());
	}
	
	@Bean
	@StepScope
	protected  ItemReader<SolicitudRegistroRecursosHumanosProvisional> solicitudRegistroRecursosHumanosProvisionalReader() {
		return DataSetItemReader.baseReader(SolicitudRegistroRecursosHumanosProvisional.class, "dataset/Recursos Humanos/Solicitudes registro recurso humano provisional.xml", importDataSetProperties.getDataSetPath());
	}
	
	@Bean
	@StepScope
	protected  ItemReader<SubprogramaRecursosHumanos> subprogramaRecursosHumanosReader() {
		return DataSetItemReader.baseReader(SubprogramaRecursosHumanos.class, "dataset/Recursos Humanos/Subprogramas recursos humanos.xml", importDataSetProperties.getDataSetPath());
	}
	
	@Bean
	@StepScope
	protected  ItemReader<TipoRecursosHumanos> tipoRecursosHumanosReader() {
		return DataSetItemReader.baseReader(TipoRecursosHumanos.class, "dataset/Recursos Humanos/Tipos recursos humanos.xml", importDataSetProperties.getDataSetPath());
	}
	
	@Bean
	@StepScope
	protected  ItemReader<UnidadRecursosHumanos> unidadRecursosHumanosReader() {
		return DataSetItemReader.baseReader(UnidadRecursosHumanos.class, "dataset/Recursos Humanos/Unidades recursos humanos.xml", importDataSetProperties.getDataSetPath());
	}
}
