package es.um.asio.importer.dataset.config.paginas;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
import es.um.asio.importer.config.ImportProperties;
import es.um.asio.importer.dataset.config.DataSetItemReader;

@Configuration
public class PaginasItemReaderConfiguration {

	@Autowired
	protected ImportProperties importDataSetProperties;

	@Bean
	@StepScope
	protected ItemReader<Alegacion> alegacionesReader() {
		return DataSetItemReader.baseReader(Alegacion.class, "Paginas/Alegaciones.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<Articulo> articuloReader() {
		return DataSetItemReader.baseReader(Articulo.class, "Paginas/Articulos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<AutorArticulo> autorArticuloReader() {
		return DataSetItemReader.baseReader(AutorArticulo.class, "Paginas/Autores articulos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<AutorCapituloLibro> autorCapituloLibroReader() {
		return DataSetItemReader.baseReader(AutorCapituloLibro.class, "Paginas/Autores captitulos libros.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<AutorCongreso> autorCongresoReader() {
		return DataSetItemReader.baseReader(AutorCongreso.class, "Paginas/Autores congresos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<AutorDiseno> autorDisenoReader() {
		return DataSetItemReader.baseReader(AutorDiseno.class, "Paginas/Autores diseños.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<AutorExposicion> autorExposicionReader() {
		return DataSetItemReader.baseReader(AutorExposicion.class, "Paginas/Autores exposiciones.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<AutorLibro> autorLibroReader() {
		return DataSetItemReader.baseReader(AutorLibro.class, "Paginas/Autores libros.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<AutorPrologoLibro> autorPrologoLibroReader() {
		return DataSetItemReader.baseReader(AutorPrologoLibro.class, "Paginas/Autores prologo libros.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<AyudaIniciacion> ayudaIniciacionReader() {
		return DataSetItemReader.baseReader(AyudaIniciacion.class, "Paginas/Ayudas iniciacion.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<AyudaPostdoctoral> ayudaPostdoctoralReader() {
		return DataSetItemReader.baseReader(AyudaPostdoctoral.class, "Paginas/Ayudas postdoctorales.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<CapituloLibro> capituloLibroReader() {
		return DataSetItemReader.baseReader(CapituloLibro.class, "Paginas/Capitulos libros.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<ComiteCongreso> comiteCongresoReader() {
		return DataSetItemReader.baseReader(ComiteCongreso.class, "Paginas/Comite congresos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<ComiteEditorial> comiteEditorialReader() {
		return DataSetItemReader.baseReader(ComiteEditorial.class, "Paginas/Comite editorial.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<Congreso> congresoReader() {
		return DataSetItemReader.baseReader(Congreso.class, "Paginas/Congresos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<ContratoPostdoctoral> contratoPostdoctoralReader() {
		return DataSetItemReader.baseReader(ContratoPostdoctoral.class, "Paginas/Contratos postdoctorales.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<Convocatoria> convocatoriaReader() {
		return DataSetItemReader.baseReader(Convocatoria.class, "Paginas/Convocatorias.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<DiplomaEstudiosAvanzados> diplomaEstudiosAvanzadosReader() {
		return DataSetItemReader.baseReader(DiplomaEstudiosAvanzados.class, "Paginas/Diploma estudios avanzados.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<DiplomaEstudiosAvanzadosExterno> diplomaEstudiosAvanzadosExternoReader() {
		return DataSetItemReader.baseReader(DiplomaEstudiosAvanzadosExterno.class,
				"Paginas/Diploma estudios avanzados externo.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<DirectorContratoPostdoctoral> directorContratoPostdoctoralReader() {
		return DataSetItemReader.baseReader(DirectorContratoPostdoctoral.class,
				"Paginas/Directores contratos postdoctorales.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<DirectorDiplomaEstudiosAvanzados> directorDiplomaEstudiosAvanzadosReader() {
		return DataSetItemReader.baseReader(DirectorDiplomaEstudiosAvanzados.class,
				"Paginas/Directores diploma estudios avanzados.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<DirectorDiplomaEstudiosAvanzadosExterno> directorDiplomaEstudiosAvanzadosExternoReader() {
		return DataSetItemReader.baseReader(DirectorDiplomaEstudiosAvanzadosExterno.class,
				"Paginas/Directores diploma estudios avanzados externo.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<DirectorTesinaExterna> directorTesinaExternaReader() {
		return DataSetItemReader.baseReader(DirectorTesinaExterna.class, "Paginas/Directores tesinas externas.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<DirectorTesisExterna> directorTesisExternaReader() {
		return DataSetItemReader.baseReader(DirectorTesisExterna.class, "Paginas/Directores tesis externas.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<Diseno> disenoReader() {
		return DataSetItemReader.baseReader(Diseno.class, "Paginas/Diseños.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<EditorLibro> editorLibroReader() {
		return DataSetItemReader.baseReader(EditorLibro.class, "Paginas/Editores libros.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean(name = "empresaExplotacionPatentePaginas")
	@StepScope
	protected ItemReader<EmpresaExplotacionPatente> empresaExplotacionPatenteReader() {
		return DataSetItemReader.baseReader(EmpresaExplotacionPatente.class, "Paginas/Empresas explota patentes.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<Estancia> estanciaReader() {
		return DataSetItemReader.baseReader(Estancia.class, "Paginas/Estancias.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<EstanciaBreve> estanciaBreveReader() {
		return DataSetItemReader.baseReader(EstanciaBreve.class, "Paginas/Estancias breves.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<Exposicion> exposicionReader() {
		return DataSetItemReader.baseReader(Exposicion.class, "Paginas/Exposiciones.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean(name = "inventorPatentePaginas")
	@StepScope
	protected ItemReader<InventorPatente> inventorPatenteReader() {
		return DataSetItemReader.baseReader(InventorPatente.class, "Paginas/Inventores patentes.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<InvestigadorProyectoCooperacionInternacional> investigadorProyectoCooperacionInternacionalReader() {
		return DataSetItemReader.baseReader(InvestigadorProyectoCooperacionInternacional.class,
				"Paginas/Investigadores proyectos cooperacion internacional.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<Libro> libroReader() {
		return DataSetItemReader.baseReader(Libro.class, "Paginas/Libros.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<MiembroComiteCongreso> miembroComiteCongresoReader() {
		return DataSetItemReader.baseReader(MiembroComiteCongreso.class, "Paginas/Miembros comite congresos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<PaisPatente> paisPatenteReader() {
		return DataSetItemReader.baseReader(PaisPatente.class, "Paginas/Paises patentes.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<PalabraClaveArticulo> palabraClaveArticuloReader() {
		return DataSetItemReader.baseReader(PalabraClaveArticulo.class, "Paginas/Palabras clave articulos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<PalabraClaveComiteCongreso> palabraClaveComiteCongresoReader() {
		return DataSetItemReader.baseReader(PalabraClaveComiteCongreso.class,
				"Paginas/Palabras clave comite congresos.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<PalabraClaveCongreso> palabraClaveCongresoReader() {
		return DataSetItemReader.baseReader(PalabraClaveCongreso.class, "Paginas/Palabras clave congresos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<PalabraClaveLibro> palabraClaveLibroReader() {
		return DataSetItemReader.baseReader(PalabraClaveLibro.class, "Paginas/Palabras clave libros.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean(name = "patentePaginas")
	@StepScope
	protected ItemReader<Patente> patenteReader() {
		return DataSetItemReader.baseReader(Patente.class, "Paginas/Patentes.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<PalabraClavePrologoLibro> palabraClavePrologoLibroReader() {
		return DataSetItemReader.baseReader(PalabraClavePrologoLibro.class, "Paginas/Palabras clave prologo libros.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<PrologoLibro> prologoLibroReader() {
		return DataSetItemReader.baseReader(PrologoLibro.class, "Paginas/Prologo libros.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<ProyectoCooperacionInternacional> proyectoCooperacionInternacionalReader() {
		return DataSetItemReader.baseReader(ProyectoCooperacionInternacional.class,
				"Paginas/Proyectos cooperacion internacional.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<RequisitoContratoPostdoctoral> requisitoContratoPostdoctoralReader() {
		return DataSetItemReader.baseReader(RequisitoContratoPostdoctoral.class,
				"Paginas/Requisitos contratos postdoctorales.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<SolicitudCambioGrupoInvestigacion> solicitudCambioGrupoInvestigacionReader() {
		return DataSetItemReader.baseReader(SolicitudCambioGrupoInvestigacion.class,
				"Paginas/Solicitudes cambios grupos investigacion.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<TesisDirigidaUMUNoRegistrada> tesisDirigidaUMUNoRegistradaReader() {
		return DataSetItemReader.baseReader(TesisDirigidaUMUNoRegistrada.class,
				"Paginas/Tesis dirigidas UMU no registradas.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<TesinaExterna> tesinaExternaReader() {
		return DataSetItemReader.baseReader(TesinaExterna.class, "Paginas/Tesinas externas.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<TesisExterna> tesisExternaReader() {
		return DataSetItemReader.baseReader(TesisExterna.class, "Paginas/Tesis externas.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<DirectoresTesis> directoresTesisReader() {
		return DataSetItemReader.baseReader(DirectoresTesis.class, "Paginas/Directores Tesis.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<TiposEventos> tiposEventosReader() {
		return DataSetItemReader.baseReader(TiposEventos.class, "Paginas/Tipos eventos.xml",
				importDataSetProperties.getDataSetPath());
	}
}
