package es.um.asio.importer.dataset.config.contratos;

import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
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
import es.um.asio.importer.dataset.config.ImportDataSetFlowConfigurationBase;

/**
 * Class to generate Contratos {@link Flow}
 */
@Configuration
public class ImportContratosDataSetFlowConfiguration extends ImportDataSetFlowConfigurationBase {
    
	@Autowired
	private ContratosItemReaderConfiguration configuration;
	
    /**
     * Gets the Contratos flow name.
     *
     * @return the flow name
     */
    @Override
    protected String getFlowName() {
        return "importContratosFlow";
    }
    
    /**
     * Gets Contratos {@link Flow}
     *
     * @return the flow
     */
    @Override
    public Flow getFlow() {
        return new FlowBuilder<SimpleFlow>(getFlowName())
                .start(createStep(AnualidadContratoProyecto.class,configuration.anualidadContratoProyectoReader()))                
                .next(createStep(ContratoProyecto.class,configuration.contratoProyectoReader()))
                .next(createStep(DesgloseGastoContratoProyecto.class,configuration.desgloseGastoContratoProyectoReader()))
                .next(createStep(DesgloseGastoProrrogaContrato.class,configuration.desgloseGastoProrrogaContratoReader()))
                .next(createStep(EquipoContratoProyecto.class,configuration.equipoContratoProyectoReader()))
                .next(createStep(ImpuestoContratoProyecto.class,configuration.impuestoContratoProyectoReader()))
                .next(createStep(ImpuestoProrrogaContrato.class,configuration.impuestoProrrogaContratoReader()))
                .next(createStep(PatenteContratoProyecto.class,configuration.patenteContratoProyectoReader()))
                .next(createStep(ProrrogaContratoProyecto.class,configuration.prorrogaContratoProyectoReader()))
                .build();         
    }
}