package es.um.asio.importer.dataset.config.gruposinvestigacion;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.um.asio.domain.gruposInvestigacion.CodigosUnesco;
import es.um.asio.domain.gruposInvestigacion.ConceptoGrupo;
import es.um.asio.domain.gruposInvestigacion.ConceptoInvestigador;
import es.um.asio.domain.gruposInvestigacion.DatosContactoGrupo;
import es.um.asio.domain.gruposInvestigacion.DatosEquipoInvestigacion;
import es.um.asio.domain.gruposInvestigacion.GrupoInvestigacion;
import es.um.asio.domain.gruposInvestigacion.LineasInvestigacion;
import es.um.asio.domain.gruposInvestigacion.LineasInvestigador;
import es.um.asio.domain.gruposInvestigacion.LineasUnesco;
import es.um.asio.domain.gruposInvestigacion.TipoParticipacionGrupo;
import es.um.asio.importer.config.ImportProperties;
import es.um.asio.importer.dataset.config.DataSetItemReader;

@Configuration
public class GrupoInvestigacionItemReaderConfiguration {

	@Autowired
	protected ImportProperties importDataSetProperties;

	@Bean
	@StepScope
	protected ItemReader<ConceptoGrupo> conceptoGrupoReader() {
		return DataSetItemReader.baseReader(ConceptoGrupo.class, "dataset/Grupos de investigacion/Conceptos grupos.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<ConceptoInvestigador> conceptoInvestigadorReader() {
		return DataSetItemReader.baseReader(ConceptoInvestigador.class,
				"dataset/Grupos de investigacion/Conceptos investigadores.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<DatosContactoGrupo> DatosContactoGrupoReader() {
		return DataSetItemReader.baseReader(DatosContactoGrupo.class,
				"dataset/Grupos de investigacion/Datos contacto grupos.xml", importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<DatosEquipoInvestigacion> datosEquipoInvestigacionReader() {
		return DataSetItemReader.baseReader(DatosEquipoInvestigacion.class,
				"dataset/Grupos de investigacion/Datos equipo investigacion.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<GrupoInvestigacion> grupoInvestigacionReader() {
		return DataSetItemReader.baseReader(GrupoInvestigacion.class,
				"dataset/Grupos de investigacion/Grupos de investigacion.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<TipoParticipacionGrupo> tipoParticipacionGrupoReader() {
		return DataSetItemReader.baseReader(TipoParticipacionGrupo.class,
				"dataset/Grupos de investigacion/Tipo participacion grupo.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<CodigosUnesco> codigosUnescoReader() {
		return DataSetItemReader.baseReader(CodigosUnesco.class, "dataset/Grupos de investigacion/Codigos UNESCO.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<LineasInvestigacion> lineasInvestigacionReader() {
		return DataSetItemReader.baseReader(LineasInvestigacion.class,
				"dataset/Grupos de investigacion/Lineas de investigacion.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<LineasUnesco> lineasUnescoReader() {
		return DataSetItemReader.baseReader(LineasUnesco.class, "dataset/Grupos de investigacion/Lineas UNESCO.xml",
				importDataSetProperties.getDataSetPath());
	}

	@Bean
	@StepScope
	protected ItemReader<LineasInvestigador> lineasInvestigadorReader() {
		return DataSetItemReader.baseReader(LineasInvestigador.class,
				"dataset/Grupos de investigacion/Lineas investigador.xml", importDataSetProperties.getDataSetPath());
	}

}
