package es.um.asio.importer.dataset.config.actividades;

import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import es.um.asio.domain.actividades.Actividad;
import es.um.asio.domain.actividades.FacturaEmitidaActividad;
import es.um.asio.domain.actividades.GrupoActividades;
import es.um.asio.domain.actividades.GrupoActividadesProyecto;
import es.um.asio.domain.actividades.ImpuestoRepercutidoActividad;
import es.um.asio.domain.actividades.TipoActividad;
import es.um.asio.importer.dataset.config.ImportDataSetFlowConfigurationBase;

/**
 * Class to generate Actividades {@link Flow}
 */
@Configuration
public class ImportActividadesDataSetFlowConfiguration extends ImportDataSetFlowConfigurationBase {

	@Autowired
	private ActividadesItemReaderConfiguration configuration;
	
    /**
     * Gets the Actividades flow name.
     *
     * @return the flow name
     */
    @Override
    protected String getFlowName() {
        return "importActividadesFlow";
    }
  
    /**
     * Gets Actividades {@link Flow}
     *
     * @return the flow
     */
    @Override
    public Flow getFlow() {
        return new FlowBuilder<SimpleFlow>(getFlowName())
                .start(createStep(Actividad.class,configuration.actividadReader()))                
                .next(createStep(FacturaEmitidaActividad.class, configuration.facturaEmitidaActividadReader()))
                .next(createStep(GrupoActividadesProyecto.class, configuration.grupoActividadesProyectoReader()))
                .next(createStep(GrupoActividades.class, configuration.grupoActividadesReader()))
                .next(createStep(ImpuestoRepercutidoActividad.class, configuration.impuestoRepercutidoActividadReader()))
                .next(createStep(TipoActividad.class, configuration.tipoActividadReader()))                
                .build();         
    }
}