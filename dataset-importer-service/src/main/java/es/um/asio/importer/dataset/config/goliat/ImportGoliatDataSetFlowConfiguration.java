package es.um.asio.importer.dataset.config.goliat;

import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


import es.um.asio.domain.goliat.DedicacionInvestigador;
import es.um.asio.domain.goliat.NoLaborables;
import es.um.asio.domain.goliat.Timesheet;
import es.um.asio.domain.goliat.WorkDescription;
import es.um.asio.domain.goliat.WorkLog;
import es.um.asio.domain.goliat.WorkPackage;
import es.um.asio.importer.dataset.config.ImportDataSetFlowConfigurationBase;

/**
 * Class to generate Goliat {@link Flow}
 */
@Configuration
public class ImportGoliatDataSetFlowConfiguration extends ImportDataSetFlowConfigurationBase {
	
	@Autowired
	private GoliatItemReaderConfiguration configuration;
    
    /**
     * Gets the Goliat flow name.
     *
     * @return the flow name
     */
    @Override
    protected String getFlowName() {
        return "importGoliatFlow";
    }
    
    /**
     * Gets Goliat {@link Flow}
     *
     * @return the flow
     */
    @Override
    public Flow getFlow() {
        return new FlowBuilder<SimpleFlow>(getFlowName())
                .start(createStep(DedicacionInvestigador.class,configuration.dedicacionInvestigadorReader()))
                .next(createStep(NoLaborables.class,configuration.noLaborablesReader()))
                .next(createStep(Timesheet.class,configuration.timesheetReader()))
                .next(createStep(WorkDescription.class,configuration.workDescriptionReader()))
                .next(createStep(WorkLog.class,configuration.workLogReader()))
                .next(createStep(WorkPackage.class,configuration.workPackageReader()))
                .build();         
    }
}