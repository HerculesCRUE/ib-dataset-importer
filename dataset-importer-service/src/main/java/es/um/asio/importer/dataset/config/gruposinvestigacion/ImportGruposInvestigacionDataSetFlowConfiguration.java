package es.um.asio.importer.dataset.config.gruposinvestigacion;

import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import es.um.asio.domain.gruposInvestigacion.ConceptoGrupo;
import es.um.asio.domain.gruposInvestigacion.ConceptoInvestigador;
import es.um.asio.domain.gruposInvestigacion.DatosContactoGrupo;
import es.um.asio.domain.gruposInvestigacion.DatosEquipoInvestigacion;
import es.um.asio.domain.gruposInvestigacion.GrupoInvestigacion;
import es.um.asio.domain.gruposInvestigacion.TipoParticipacionGrupo;
import es.um.asio.importer.dataset.config.ImportDataSetFlowConfigurationBase;

/**
 * Class to generate GruposInvestigacion {@link Flow}
 */
@Configuration
public class ImportGruposInvestigacionDataSetFlowConfiguration  extends ImportDataSetFlowConfigurationBase {
    
	@Autowired
	private GrupoInvestigacionItemReaderConfiguration configuration;
	
    /**
     * Gets the GruposInvestigacion flow name.
     *
     * @return the flow name
     */
    @Override
    protected String getFlowName() {
        return "importGruposInvestigacionFlow";
    }
    
    /**
     * Gets GruposInvestigacion {@link Flow}
     *
     * @return the flow
     */
    @Override
    public Flow getFlow() {
        return new FlowBuilder<SimpleFlow>(getFlowName())
                .start(createStep(ConceptoGrupo.class,configuration.conceptoGrupoReader()))
                .next(createStep(ConceptoInvestigador.class,configuration.conceptoInvestigadorReader()))
                .next(createStep(DatosContactoGrupo.class,configuration.DatosContactoGrupoReader()))
                .next(createStep(DatosEquipoInvestigacion.class,configuration.datosEquipoInvestigacionReader()))
                .next(createStep(GrupoInvestigacion.class,configuration.grupoInvestigacionReader()))
                .next(createStep(TipoParticipacionGrupo.class,configuration.tipoParticipacionGrupoReader()))   
                .build();         
    }
}