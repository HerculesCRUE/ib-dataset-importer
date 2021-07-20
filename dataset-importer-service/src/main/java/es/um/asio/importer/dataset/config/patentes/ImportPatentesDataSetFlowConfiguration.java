package es.um.asio.importer.dataset.config.patentes;

import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import es.um.asio.domain.patentes.CostePatente;
import es.um.asio.domain.patentes.EmpresaExplotacionPatente;
import es.um.asio.domain.patentes.EmpresaTitularPatente;
import es.um.asio.domain.patentes.InventorPatente;
import es.um.asio.domain.patentes.Patente;
import es.um.asio.domain.patentes.ProteccionPatente;
import es.um.asio.domain.patentes.SectorIndustrialPatente;
import es.um.asio.importer.dataset.config.ImportDataSetFlowConfigurationBase;

/**
 * Class to generate Patentes {@link Flow}
 */
@Configuration
public class ImportPatentesDataSetFlowConfiguration extends ImportDataSetFlowConfigurationBase {
	
	@Autowired
	private ImportPatentesItemReaderConfiguration configuration;
    
    /**
     * Gets the Patentes flow name.
     *
     * @return the flow name
     */
    @Override
    protected String getFlowName() {
        return "importPatentesFlow";
    }
    
    /**
     * Gets Patentes {@link Flow}
     *
     * @return the flow
     */
    @Override
    public Flow getFlow() {
        return new FlowBuilder<SimpleFlow>(getFlowName())
                .start(createStep(CostePatente.class,configuration.costePatenteReader()))               
                .next(createStep(EmpresaExplotacionPatente.class,configuration.empresaExplotacionPatenteReader()))
                .next(createStep(EmpresaTitularPatente.class,configuration.empresaTitularPatenteReader()))
                .next(createStep(InventorPatente.class,configuration.inventorPatenteReader()))     
                .next(createStep(Patente.class,configuration.patenteReader()))
                .next(createStep(ProteccionPatente.class,configuration.proteccionPatenteReader()))
                .next(createStep(SectorIndustrialPatente.class,configuration.sectorIndustrialPatenteReader()))
                .build();         
    }
}