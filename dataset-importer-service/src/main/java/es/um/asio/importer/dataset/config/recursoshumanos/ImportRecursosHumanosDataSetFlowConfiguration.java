package es.um.asio.importer.dataset.config.recursoshumanos;

import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
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
import es.um.asio.importer.dataset.config.ImportDataSetFlowConfigurationBase;

/**
 * Class to generate RecursosHumanos {@link Flow}
 */
@Configuration
public class ImportRecursosHumanosDataSetFlowConfiguration extends ImportDataSetFlowConfigurationBase {
    
	@Autowired
	private ImportRecursosHumanosItemReaderConfiguration configuration;
	
    /**
     * Gets the RecursosHumanos flow name.
     *
     * @return the flow name
     */
    @Override
    protected String getFlowName() {
        return "importRecursosHumanosFlow";
    }
    
    /**
     * Gets RecursosHumanos {@link Flow}
     *
     * @return the flow
     */
    @Override
    public Flow getFlow() {
        return new FlowBuilder<SimpleFlow>(getFlowName())
                .start(createStep(ConvocatoriaRecursosHumanos.class,configuration.convocatoriaRecursosHumanosReader()))                
                .next(createStep(IdiomaSolicitudRecursosHumanos.class,configuration.idiomaSolicitudRecursosHumanosReader()))
                .next(createStep(MeritosSolicitudRecursosHumanos.class,configuration.meritosSolicitudRecursosHumanosReader()))
                .next(createStep(RegistroRecursosHumanosConcedido.class,configuration.registroRecursosHumanosConcedidoReader()))     
                .next(createStep(RegistroRecursosHumanosProvisional.class,configuration.registroRecursosHumanosProvisionalReader()))
                .next(createStep(SolicitudRecursosHumanosConcedido.class,configuration.solicitudRecursosHumanosConcedidoReader()))
                .next(createStep(SolicitudRecursosHumanos.class,configuration.solicitudRecursosHumanosReader()))
                .next(createStep(SolicitudRegistroRecursosHumanosProvisional.class,configuration.solicitudRegistroRecursosHumanosProvisionalReader()))
                .next(createStep(SubprogramaRecursosHumanos.class,configuration.subprogramaRecursosHumanosReader()))
                .next(createStep(TipoRecursosHumanos.class,configuration.tipoRecursosHumanosReader()))
                .next(createStep(UnidadRecursosHumanos.class,configuration.unidadRecursosHumanosReader()))
                .build();         
    }
}