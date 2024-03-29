package es.um.asio.importer.dataset.config.centros;

import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import es.um.asio.domain.centros.Centro;
import es.um.asio.domain.centros.Departamento;
import es.um.asio.importer.dataset.config.ImportDataSetFlowConfigurationBase;

/**
 * Class to generate Centros {@link Flow}
 */
@Configuration
public class ImportCentrosDataSetFlowConfiguration extends ImportDataSetFlowConfigurationBase {

	@Autowired
	private CentrosItemReaderConfiguration configuration;

	/**
	 * Gets the Centros flow name.
	 *
	 * @return the flow name
	 */
	@Override
	protected String getFlowName() {
		return "importCentrosFlow";
	}

	/**
	 * Gets Actividades {@link Flow}
	 *
	 * @return the flow
	 */
	@Override
	public Flow getFlow() {
		return new FlowBuilder<SimpleFlow>(getFlowName()).start(createStep(Centro.class, configuration.centroReader()))
				.next(createStep(Departamento.class, configuration.departamentoReader())).build();
	}
}