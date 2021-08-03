package es.um.asio.importer.dataset.config.paginas;

import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import es.um.asio.domain.paginas.Alegacion;
import es.um.asio.domain.paginas.Articulo;
import es.um.asio.domain.paginas.AutorArticulo;
import es.um.asio.domain.paginas.AutorCapituloLibro;
import es.um.asio.domain.paginas.AutorCongreso;
import es.um.asio.domain.paginas.AutorDiseno;
import es.um.asio.domain.paginas.AutorExposicion;
import es.um.asio.domain.paginas.AutorLibro;
import es.um.asio.domain.paginas.AutorPrologoLibro;
import es.um.asio.domain.paginas.AyudaIniciacion;
import es.um.asio.domain.paginas.AyudaPostdoctoral;
import es.um.asio.domain.paginas.CapituloLibro;
import es.um.asio.domain.paginas.ComiteCongreso;
import es.um.asio.domain.paginas.ComiteEditorial;
import es.um.asio.domain.paginas.Congreso;
import es.um.asio.domain.paginas.ContratoPostdoctoral;
import es.um.asio.domain.paginas.Convocatoria;
import es.um.asio.domain.paginas.DiplomaEstudiosAvanzados;
import es.um.asio.domain.paginas.DiplomaEstudiosAvanzadosExterno;
import es.um.asio.domain.paginas.DirectorContratoPostdoctoral;
import es.um.asio.domain.paginas.DirectorDiplomaEstudiosAvanzados;
import es.um.asio.domain.paginas.DirectorDiplomaEstudiosAvanzadosExterno;
import es.um.asio.domain.paginas.DirectorTesinaExterna;
import es.um.asio.domain.paginas.DirectorTesisExterna;
import es.um.asio.domain.paginas.DirectoresTesis;
import es.um.asio.domain.paginas.Diseno;
import es.um.asio.domain.paginas.EditorLibro;
import es.um.asio.domain.paginas.EmpresaExplotacionPatente;
import es.um.asio.domain.paginas.Estancia;
import es.um.asio.domain.paginas.EstanciaBreve;
import es.um.asio.domain.paginas.Exposicion;
import es.um.asio.domain.paginas.InventorPatente;
import es.um.asio.domain.paginas.InvestigadorProyectoCooperacionInternacional;
import es.um.asio.domain.paginas.Libro;
import es.um.asio.domain.paginas.MiembroComiteCongreso;
import es.um.asio.domain.paginas.PaisPatente;
import es.um.asio.domain.paginas.PalabraClaveArticulo;
import es.um.asio.domain.paginas.PalabraClaveComiteCongreso;
import es.um.asio.domain.paginas.PalabraClaveCongreso;
import es.um.asio.domain.paginas.PalabraClaveLibro;
import es.um.asio.domain.paginas.PalabraClavePrologoLibro;
import es.um.asio.domain.paginas.Patente;
import es.um.asio.domain.paginas.PrologoLibro;
import es.um.asio.domain.paginas.ProyectoCooperacionInternacional;
import es.um.asio.domain.paginas.RequisitoContratoPostdoctoral;
import es.um.asio.domain.paginas.SolicitudCambioGrupoInvestigacion;
import es.um.asio.domain.paginas.TesinaExterna;
import es.um.asio.domain.paginas.TesisDirigidaUMUNoRegistrada;
import es.um.asio.domain.paginas.TesisExterna;
import es.um.asio.domain.paginas.TiposEventos;
import es.um.asio.importer.dataset.config.ImportDataSetFlowConfigurationBase;

/**
 * Class to generate Paginas {@link Flow}
 */
@Configuration
public class ImportPaginasDataSetFlowConfiguration extends ImportDataSetFlowConfigurationBase {

	@Autowired
	private PaginasItemReaderConfiguration configuration;

	/**
	 * Gets the Paginas flow name.
	 *
	 * @return the flow name
	 */
	@Override
	protected String getFlowName() {
		return "importPaginasFlow";
	}

	/**
	 * Gets Paginas {@link Flow}
	 *
	 * @return the flow
	 */
	@Override
	public Flow getFlow() {
		return new FlowBuilder<SimpleFlow>(getFlowName())
				.start(createStep(Alegacion.class, configuration.alegacionesReader()))
				.next(createStep(Articulo.class, configuration.articuloReader()))
				.next(createStep(AutorArticulo.class, configuration.autorArticuloReader()))
				.next(createStep(AutorCapituloLibro.class, configuration.autorCapituloLibroReader()))
				.next(createStep(AutorCongreso.class, configuration.autorCongresoReader()))
				.next(createStep(AutorDiseno.class, configuration.autorDisenoReader()))
				.next(createStep(AutorExposicion.class, configuration.autorExposicionReader()))
				.next(createStep(AutorLibro.class, configuration.autorLibroReader()))
				.next(createStep(AutorPrologoLibro.class, configuration.autorPrologoLibroReader()))
				.next(createStep(AyudaIniciacion.class, configuration.ayudaIniciacionReader()))
				.next(createStep(AyudaPostdoctoral.class, configuration.ayudaPostdoctoralReader()))
				.next(createStep(CapituloLibro.class, configuration.capituloLibroReader()))
				.next(createStep(ComiteCongreso.class, configuration.comiteCongresoReader()))
				.next(createStep(ComiteEditorial.class, configuration.comiteEditorialReader()))
				.next(createStep(Congreso.class, configuration.congresoReader()))
				.next(createStep(ContratoPostdoctoral.class, configuration.contratoPostdoctoralReader()))
				.next(createStep(Convocatoria.class, configuration.convocatoriaReader()))
				.next(createStep(DiplomaEstudiosAvanzados.class, configuration.diplomaEstudiosAvanzadosReader()))
				.next(createStep(DiplomaEstudiosAvanzadosExterno.class,
						configuration.diplomaEstudiosAvanzadosExternoReader()))
				.next(createStep(DirectorContratoPostdoctoral.class,
						configuration.directorContratoPostdoctoralReader()))
				.next(createStep(DirectorDiplomaEstudiosAvanzados.class,
						configuration.directorDiplomaEstudiosAvanzadosReader()))
				.next(createStep(DirectorDiplomaEstudiosAvanzadosExterno.class,
						configuration.directorDiplomaEstudiosAvanzadosExternoReader()))
				.next(createStep(DirectorTesinaExterna.class, configuration.directorTesinaExternaReader()))
				.next(createStep(DirectorTesisExterna.class, configuration.directorTesisExternaReader()))
				.next(createStep(Diseno.class, configuration.disenoReader()))
				.next(createStep(EditorLibro.class, configuration.editorLibroReader()))
				.next(createStep(EmpresaExplotacionPatente.class, configuration.empresaExplotacionPatenteReader()))
				.next(createStep(Estancia.class, configuration.estanciaReader()))
				.next(createStep(EstanciaBreve.class, configuration.estanciaBreveReader()))
				.next(createStep(Exposicion.class, configuration.exposicionReader()))
				.next(createStep(InventorPatente.class, configuration.inventorPatenteReader()))
				.next(createStep(InvestigadorProyectoCooperacionInternacional.class,
						configuration.investigadorProyectoCooperacionInternacionalReader()))
				.next(createStep(Libro.class, configuration.libroReader()))
				.next(createStep(MiembroComiteCongreso.class, configuration.miembroComiteCongresoReader()))
				.next(createStep(PaisPatente.class, configuration.paisPatenteReader()))
				.next(createStep(PalabraClaveArticulo.class, configuration.palabraClaveArticuloReader()))
				.next(createStep(PalabraClaveComiteCongreso.class, configuration.palabraClaveComiteCongresoReader()))
				.next(createStep(PalabraClaveCongreso.class, configuration.palabraClaveCongresoReader()))
				.next(createStep(PalabraClaveLibro.class, configuration.palabraClaveLibroReader()))
				.next(createStep(PalabraClavePrologoLibro.class, configuration.palabraClavePrologoLibroReader()))
				.next(createStep(Patente.class, configuration.patenteReader()))
				.next(createStep(PrologoLibro.class, configuration.prologoLibroReader()))
				.next(createStep(ProyectoCooperacionInternacional.class,
						configuration.proyectoCooperacionInternacionalReader()))
				.next(createStep(RequisitoContratoPostdoctoral.class,
						configuration.requisitoContratoPostdoctoralReader()))
				.next(createStep(SolicitudCambioGrupoInvestigacion.class,
						configuration.solicitudCambioGrupoInvestigacionReader()))
				.next(createStep(TesisDirigidaUMUNoRegistrada.class,
						configuration.tesisDirigidaUMUNoRegistradaReader()))
				.next(createStep(TesinaExterna.class, configuration.tesinaExternaReader()))
				.next(createStep(TesisExterna.class, configuration.tesisExternaReader()))
				.next(createStep(DirectoresTesis.class, configuration.directoresTesisReader()))
				.next(createStep(TiposEventos.class, configuration.tiposEventosReader())).build();
	}
}