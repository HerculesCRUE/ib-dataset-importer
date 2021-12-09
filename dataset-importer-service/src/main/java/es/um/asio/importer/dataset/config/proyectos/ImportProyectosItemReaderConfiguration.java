package es.um.asio.importer.dataset.config.proyectos;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
import es.um.asio.importer.config.ImportProperties;
import es.um.asio.importer.dataset.config.DataSetItemReader;

@Configuration
public class ImportProyectosItemReaderConfiguration {

	@Autowired
	protected ImportProperties importDataSetProperties;

	@Bean
	@StepScope
	protected ItemReader<AnualidadProyecto> anualidadProyectoReader() {
		return DataSetItemReader.baseReader(AnualidadProyecto.class, "dataset/Proyectos/Anualidades proyectos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<DatosAnualidadProyecto> datosAnualidadProyecto() {
		return DataSetItemReader.baseReader(DatosAnualidadProyecto.class,
				"dataset/Proyectos/Datos anualidades proyectos.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<DependenciaProyecto> dependenciaProyectoReader() {
		return DataSetItemReader.baseReader(DependenciaProyecto.class, "dataset/Proyectos/Dependencias proyectos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<EquipoProyecto> equipoProyectoReader() {
		return DataSetItemReader.baseReader(EquipoProyecto.class, "dataset/Proyectos/Equipos proyectos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<FacturaEmitirProyecto> facturaEmitirProyectoReader() {
		return DataSetItemReader.baseReader(FacturaEmitirProyecto.class,
				"dataset/Proyectos/Facturas emitir proyectos.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<FacturaProyecto> facturaProyectoReader() {
		return DataSetItemReader.baseReader(FacturaProyecto.class, "dataset/Proyectos/Facturas proyectos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<FechaProyecto> fechaProyectoReader() {
		return DataSetItemReader.baseReader(FechaProyecto.class, "dataset/Proyectos/Fechas proyectos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<FechasEquiposProyectos> fechasEquiposProyectosReader() {
		return DataSetItemReader.baseReader(FechasEquiposProyectos.class,
				"dataset/Proyectos/Fechas equipos proyectos.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<FinanciacionProyecto> financiacionProyectoReader() {
		return DataSetItemReader.baseReader(FinanciacionProyecto.class, "dataset/Proyectos/Financiacion proyectos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<GastoPrevistoProyecto> gastoPrevistoProyectoReader() {
		return DataSetItemReader.baseReader(GastoPrevistoProyecto.class,
				"dataset/Proyectos/Gastos previstos proyectos.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<GastoProyecto> gastoProyectoReader() {
		return DataSetItemReader.baseReader(GastoProyecto.class, "dataset/Proyectos/Gastos proyectos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<ImporteProyecto> importeProyectoReader() {
		return DataSetItemReader.baseReader(ImporteProyecto.class, "dataset/Proyectos/Importes proyectos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<ImpuestoRepercutidoProyecto> impuestoRepercutidoProyectoReader() {
		return DataSetItemReader.baseReader(ImpuestoRepercutidoProyecto.class,
				"dataset/Proyectos/Impuestos repercutidos proyectos.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<IngresoProyecto> ingresoProyectoReader() {
		return DataSetItemReader.baseReader(IngresoProyecto.class, "dataset/Proyectos/Ingresos proyectos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<JustificacionPrevistaProyecto> justificacionPrevistaProyectoReader() {
		return DataSetItemReader.baseReader(JustificacionPrevistaProyecto.class,
				"dataset/Proyectos/Justificaciones previstas proyectos.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<OrigenProyecto> origenProyectoReader() {
		return DataSetItemReader.baseReader(OrigenProyecto.class, "dataset/Proyectos/Origenes proyectos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<Proyecto> proyectoReader() {
		return DataSetItemReader.baseReader(Proyecto.class, "dataset/Proyectos/Proyectos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<ProyectoDependenciaProyecto> proyectoDependenciaProyectoReader() {
		return DataSetItemReader.baseReader(ProyectoDependenciaProyecto.class,
				"dataset/Proyectos/Proyectos dependencias proyectos.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<RelacionOrigenProyecto> relacionOrigenProyectoReader() {
		return DataSetItemReader.baseReader(RelacionOrigenProyecto.class,
				"dataset/Proyectos/Relaciones origenes proyectos.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean(name = "tipoActividadProyectos")
	@StepScope
	protected ItemReader<TipoActividad> tipoActividadReader() {
		return DataSetItemReader.baseReader(TipoActividad.class, "dataset/Proyectos/Tipos actividades.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<TipoAuditoriaProyecto> tipoAuditoriaProyectoReader() {
		return DataSetItemReader.baseReader(TipoAuditoriaProyecto.class,
				"dataset/Proyectos/Tipos auditorias proyectos.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<TipoFinanciacion> tipoFinanciacionReader() {
		return DataSetItemReader.baseReader(TipoFinanciacion.class, "dataset/Proyectos/Tipos financiacion.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<TipoFuenteFinanciacion> tipoFuenteFinanciacionReader() {
		return DataSetItemReader.baseReader(TipoFuenteFinanciacion.class,
				"dataset/Proyectos/Tipos fuentes financiacion.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<TipoGastoGenerico> tipoGastoGenericoReader() {
		return DataSetItemReader.baseReader(TipoGastoGenerico.class, "dataset/Proyectos/Tipos gastos genericos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<TipoIngresoGenerico> tipoIngresoGenericoReader() {
		return DataSetItemReader.baseReader(TipoIngresoGenerico.class, "dataset/Proyectos/Tipos ingresos genericos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<TipoMotivoCambioFecha> tipoMotivoCambioFechaReader() {
		return DataSetItemReader.baseReader(TipoMotivoCambioFecha.class,
				"dataset/Proyectos/Tipos motivos cambios fechas.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<TipoOrigenProyecto> tipoOrigenProyectoReader() {
		return DataSetItemReader.baseReader(TipoOrigenProyecto.class, "dataset/Proyectos/Tipos origenes proyectos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<TipoRechazoJustificacion> tipoRechazoJustificacionReader() {
		return DataSetItemReader.baseReader(TipoRechazoJustificacion.class,
				"dataset/Proyectos/Tipos rechazos justificacion.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<OrganizacionesExternas> externasOrganizationReader() {
		return DataSetItemReader.baseReader(OrganizacionesExternas.class,
				"dataset/Proyectos/Organizaciones externas.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<AreasUNESCOProyecto> areasUNESCOProyectosReader() {
		return DataSetItemReader.baseReader(AreasUNESCOProyecto.class, "dataset/Proyectos/Areas UNESCO Proyectos.xml",
				importDataSetProperties.getDataSetPath());
	}
}
