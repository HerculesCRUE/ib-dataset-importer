package es.um.asio.importer.cerif.processor.mappings.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import es.um.asio.domain.cerif.BaseCerif;
import es.um.asio.domain.cerif.ProyectoCerif;
import es.um.asio.domain.cerif.ProyectoCoordinadorCerif;
import es.um.asio.domain.cerif.ProyectoMiembroCerif;
import es.um.asio.importer.cerif.model.Project;

public class ProyectoMapper extends CerifBaseMapper {

	public static List<? extends BaseCerif> mapXsdToDomain(Project project) {
		List<BaseCerif> domains = new ArrayList<BaseCerif>();
		if (project == null) {
			return domains;
		}

		ProyectoCerif proyectoCerif = new ProyectoCerif();
		proyectoCerif.setShortId(project.getId());
		proyectoCerif.setTitulo(mapLangStringsToString(project.getTitle()));
		proyectoCerif.setDescripcion((String) mapLangAnyToObject(project.getAbstract()));
		proyectoCerif.setStatus(mapGenericURIClassificationToString(project.getStatus()));
		proyectoCerif.setFecInicio(mapCfDateTypeToString(project.getStartDate()));
		proyectoCerif.setFecFin(mapCfDateTypeToString(project.getEndDate()));

		domains.add(proyectoCerif);

		if (project.getTeam() != null) {
			domains.addAll(mapCerifRelations(project.getTeam().getMember(),
					CerifBaseMapper::mapCfLinkWithDisplayNameToPersonWithAffiliationsTypeToPersonId,
					mapTeamXsdToDomain(proyectoCerif.getShortId())));
		}

		if (project.getConsortium() != null && project.getConsortium().getCoordinator() != null) {
			domains.addAll(mapCerifRelations(project.getConsortium().getCoordinator(),
					CerifBaseMapper::mapCfLinkWithDisplayNameToPersonOrOrgUnitTypeToUnidadId,
					mapCoordinadorXsdToDomain(proyectoCerif.getShortId())));
		}

		return domains;
	}

	private static Function<String, ProyectoMiembroCerif> mapTeamXsdToDomain(String shortId) {
		return (idPersona) -> {
			ProyectoMiembroCerif proyectoMiembroCerif = new ProyectoMiembroCerif();
			proyectoMiembroCerif.setIdProyecto(shortId);
			proyectoMiembroCerif.setIdPersona(idPersona);
			return proyectoMiembroCerif;
		};
	}

	private static Function<String, ProyectoCoordinadorCerif> mapCoordinadorXsdToDomain(String shortId) {
		return (idUnidadOrganizacion) -> {
			ProyectoCoordinadorCerif proyectoCoordinadorCerif = new ProyectoCoordinadorCerif();
			proyectoCoordinadorCerif.setIdProyecto(shortId);
			proyectoCoordinadorCerif.setIdUnidadOrganizacion(idUnidadOrganizacion);
			return proyectoCoordinadorCerif;
		};
	}
}
