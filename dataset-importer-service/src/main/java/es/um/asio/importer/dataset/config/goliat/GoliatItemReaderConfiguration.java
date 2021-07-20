package es.um.asio.importer.dataset.config.goliat;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.um.asio.domain.goliat.DedicacionInvestigador;
import es.um.asio.domain.goliat.NoLaborables;
import es.um.asio.domain.goliat.Timesheet;
import es.um.asio.domain.goliat.WorkDescription;
import es.um.asio.domain.goliat.WorkLog;
import es.um.asio.domain.goliat.WorkPackage;
import es.um.asio.importer.config.ImportProperties;
import es.um.asio.importer.dataset.config.DataSetItemReader;

@Configuration
public class GoliatItemReaderConfiguration {

	@Autowired
	protected ImportProperties importDataSetProperties;	
	   
	@Bean
	@StepScope
	protected  ItemReader<DedicacionInvestigador> dedicacionInvestigadorReader() {
		return DataSetItemReader.baseReader(DedicacionInvestigador.class, "Goliat/Dedicacion investigador.xml", importDataSetProperties.getDataSetPath());
	}
	
	@Bean
	@StepScope
	protected  ItemReader<NoLaborables> noLaborablesReader() {
		return DataSetItemReader.baseReader(NoLaborables.class, "Goliat/No laborables.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected  ItemReader<Timesheet> timesheetReader() {
		return DataSetItemReader.baseReader(Timesheet.class, "Goliat/Timesheets.xml", importDataSetProperties.getDataSetPath());
	}
	
	@Bean
	@StepScope
	protected  ItemReader<WorkDescription> workDescriptionReader() {
		return DataSetItemReader.baseReader(WorkDescription.class, "Goliat/Work descriptions.xml", importDataSetProperties.getDataSetPath());
	}
	
	@Bean
	@StepScope
	protected  ItemReader<WorkLog> workLogReader() {
		return DataSetItemReader.baseReader(WorkLog.class, "Goliat/Work logs.xml", importDataSetProperties.getDataSetPath());
	}
	
	@Bean
	@StepScope
	protected  ItemReader<WorkPackage> workPackageReader() {
		return DataSetItemReader.baseReader(WorkPackage.class, "Goliat/Work packages.xml", importDataSetProperties.getDataSetPath());
	}
}
