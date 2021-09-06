package es.um.asio.importer.dataset.config.proyectos;

import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import es.um.asio.domain.proyectos.AnualidadProyecto;
import es.um.asio.domain.proyectos.AreasUNESCOProyecto;
import es.um.asio.domain.proyectos.DatosAnualidadProyecto;
import es.um.asio.domain.proyectos.DependenciaProyecto;
import es.um.asio.domain.proyectos.EquipoProyecto;
import es.um.asio.domain.proyectos.FacturaEmitirProyecto;
import es.um.asio.domain.proyectos.FacturaProyecto;
import es.um.asio.domain.proyectos.FechaProyecto;
import es.um.asio.domain.proyectos.FechasEquiposProyectos;
import es.um.asio.domain.proyectos.FinanciacionProyecto;
import es.um.asio.domain.proyectos.GastoPrevistoProyecto;
import es.um.asio.domain.proyectos.GastoProyecto;
import es.um.asio.domain.proyectos.ImporteProyecto;
import es.um.asio.domain.proyectos.ImpuestoRepercutidoProyecto;
import es.um.asio.domain.proyectos.IngresoProyecto;
import es.um.asio.domain.proyectos.JustificacionPrevistaProyecto;
import es.um.asio.domain.proyectos.OrganizacionesExternas;
import es.um.asio.domain.proyectos.OrigenProyecto;
import es.um.asio.domain.proyectos.Proyecto;
import es.um.asio.domain.proyectos.ProyectoDependenciaProyecto;
import es.um.asio.domain.proyectos.RelacionOrigenProyecto;
import es.um.asio.domain.proyectos.TipoActividad;
import es.um.asio.domain.proyectos.TipoAuditoriaProyecto;
import es.um.asio.domain.proyectos.TipoFinanciacion;
import es.um.asio.domain.proyectos.TipoFuenteFinanciacion;
import es.um.asio.domain.proyectos.TipoGastoGenerico;
import es.um.asio.domain.proyectos.TipoIngresoGenerico;
import es.um.asio.domain.proyectos.TipoMotivoCambioFecha;
import es.um.asio.domain.proyectos.TipoOrigenProyecto;
import es.um.asio.domain.proyectos.TipoRechazoJustificacion;
import es.um.asio.importer.dataset.config.ImportDataSetFlowConfigurationBase;

/**
 * Class to generate Proyectos {@link Flow}
 */
@Configuration
public class ImportProyectosDataSetFlowConfiguration extends ImportDataSetFlowConfigurationBase {

	@Autowired
	private ImportProyectosItemReaderConfiguration configuration;

	/**
	 * Gets the Proyectos flow name.
	 *
	 * @return the flow name
	 */
	@Override
	protected String getFlowName() {
		return "importProyectosFlow";
	}

	/**
	 * Gets Proyectos {@link Flow}
	 *
	 * @return the flow
	 */
	@Override
	public Flow getFlow() {
		return new FlowBuilder<SimpleFlow>(getFlowName())
				.start(createStep(AnualidadProyecto.class, configuration.anualidadProyectoReader()))
				.next(createStep(DatosAnualidadProyecto.class, configuration.datosAnualidadProyecto()))
				.next(createStep(DependenciaProyecto.class, configuration.dependenciaProyectoReader()))
				.next(createStep(EquipoProyecto.class, configuration.equipoProyectoReader()))
				.next(createStep(FacturaEmitirProyecto.class, configuration.facturaEmitirProyectoReader()))
				.next(createStep(FacturaProyecto.class, configuration.facturaProyectoReader()))
				.next(createStep(FechaProyecto.class, configuration.fechaProyectoReader()))
				.next(createStep(FechasEquiposProyectos.class, configuration.fechasEquiposProyectosReader()))
				.next(createStep(FinanciacionProyecto.class, configuration.financiacionProyectoReader()))
				.next(createStep(GastoPrevistoProyecto.class, configuration.gastoPrevistoProyectoReader()))
				.next(createStep(GastoProyecto.class, configuration.gastoProyectoReader()))
				.next(createStep(ImporteProyecto.class, configuration.importeProyectoReader()))
				.next(createStep(ImpuestoRepercutidoProyecto.class, configuration.impuestoRepercutidoProyectoReader()))
				.next(createStep(IngresoProyecto.class, configuration.ingresoProyectoReader()))
				.next(createStep(JustificacionPrevistaProyecto.class,
						configuration.justificacionPrevistaProyectoReader()))
				.next(createStep(OrigenProyecto.class, configuration.origenProyectoReader()))
				.next(createStep(Proyecto.class, configuration.proyectoReader()))
				.next(createStep(ProyectoDependenciaProyecto.class, configuration.proyectoDependenciaProyectoReader()))
				.next(createStep(RelacionOrigenProyecto.class, configuration.relacionOrigenProyectoReader()))
				.next(createStep(TipoActividad.class, configuration.tipoActividadReader()))
				.next(createStep(TipoAuditoriaProyecto.class, configuration.tipoAuditoriaProyectoReader()))
				.next(createStep(TipoFinanciacion.class, configuration.tipoFinanciacionReader()))
				.next(createStep(TipoFuenteFinanciacion.class, configuration.tipoFuenteFinanciacionReader()))
				.next(createStep(TipoGastoGenerico.class, configuration.tipoGastoGenericoReader()))
				.next(createStep(TipoIngresoGenerico.class, configuration.tipoIngresoGenericoReader()))
				.next(createStep(TipoMotivoCambioFecha.class, configuration.tipoMotivoCambioFechaReader()))
				.next(createStep(TipoOrigenProyecto.class, configuration.tipoOrigenProyectoReader()))
				.next(createStep(TipoRechazoJustificacion.class, configuration.tipoRechazoJustificacionReader()))
				.next(createStep(OrganizacionesExternas.class, configuration.externasOrganizationReader()))
				.next(createStep(AreasUNESCOProyecto.class, configuration.areasUNESCOProyectosReader())).build();
	}
}
