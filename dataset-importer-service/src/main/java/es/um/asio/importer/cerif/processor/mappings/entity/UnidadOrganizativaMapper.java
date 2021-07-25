package es.um.asio.importer.cerif.processor.mappings.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import es.um.asio.domain.cerif.BaseCerif;
import es.um.asio.domain.cerif.UnidadOrganizativaCerif;
import es.um.asio.domain.cerif.UnidadOrganizativaUnidadOrganizativaCerif;
import es.um.asio.importer.cerif.model.OrgUnit;
import es.um.asio.importer.cerif.model.OrgUnit.PartOf;

public class UnidadOrganizativaMapper extends CerifBaseMapper {

	public static List<? extends BaseCerif> mapXsdToDomain(OrgUnit orgUnit) {
		List<BaseCerif> domains = new ArrayList<BaseCerif>();
		if (orgUnit == null) {
			return domains;
		}

		UnidadOrganizativaCerif unidadOrganizativaCerif = new UnidadOrganizativaCerif();
		unidadOrganizativaCerif.setShortId(orgUnit.getId());
		unidadOrganizativaCerif.setNombre(mapLangStringsToString(orgUnit.getName()));
		
		domains.add(unidadOrganizativaCerif);
		
		domains.addAll(mapCerifRelations(orgUnit.getPartOf(), UnidadOrganizativaMapper::mapPartOfToString,
				mapUnidadesOrganizaticasPartOfXsdToDomain(unidadOrganizativaCerif.getShortId())));

		return domains;
	}

	private static Function<String, UnidadOrganizativaUnidadOrganizativaCerif> mapUnidadesOrganizaticasPartOfXsdToDomain(
			String shortId) {
		return (idUnidadOrganizativaPartOf) -> {
			UnidadOrganizativaUnidadOrganizativaCerif unidadOrganizativaUnidadOrganizativaCerif = new UnidadOrganizativaUnidadOrganizativaCerif();
			unidadOrganizativaUnidadOrganizativaCerif.setIdUnidadOrganizativa(shortId);
			unidadOrganizativaUnidadOrganizativaCerif.setIdUnidadOrganizativaPartOf(idUnidadOrganizativaPartOf);
			return unidadOrganizativaUnidadOrganizativaCerif;
		};
	}

	private static String mapPartOfToString(PartOf partOf) {
		if (partOf == null || partOf.getOrgUnit() == null) {
			return null;
		}

		return partOf.getOrgUnit().getId();
	}
}
