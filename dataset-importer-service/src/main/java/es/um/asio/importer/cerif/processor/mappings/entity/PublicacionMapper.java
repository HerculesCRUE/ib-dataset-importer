package es.um.asio.importer.cerif.processor.mappings.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import es.um.asio.domain.cerif.BaseCerif;
import es.um.asio.domain.cerif.PublicacionAutorCerif;
import es.um.asio.domain.cerif.PublicacionCerif;
import es.um.asio.domain.cerif.PublicacionProyectoCerif;
import es.um.asio.domain.cerif.PublicacionPublicacionCerif;
import es.um.asio.importer.cerif.model.Publication;
import es.um.asio.importer.cerif.model.Publication.OriginatesFrom;
import es.um.asio.importer.cerif.model.Publication.PublishedIn;

public class PublicacionMapper extends CerifBaseMapper {

	public static List<? extends BaseCerif> mapXsdToDomain(Publication publication) {
		List<BaseCerif> domains = new ArrayList<BaseCerif>();
		if (publication == null) {
			return domains;
		}

		PublicacionCerif publicacionCerif = new PublicacionCerif();
		publicacionCerif.setShortId(publication.getId());
		publicacionCerif.setTipo(publication.getType().getValue());
		publicacionCerif.setTitulo(mapLangStringsToString(publication.getTitle()));
		publicacionCerif
				.setPaginaInicio(publication.getStartPage() != null ? publication.getStartPage().getValue() : null);
		publicacionCerif.setPaginaFin(publication.getEndPage() != null ? publication.getEndPage().getValue() : null);
		publicacionCerif.setFechaPublicacion(mapCfGenericDateTimeTypeToString(publication.getPublicationDate()));
		publicacionCerif.setDOI(publication.getDOI() != null ? publication.getDOI().getValue() : null);

		domains.add(publicacionCerif);

		if (publication.getAuthors() != null) {
			domains.addAll(mapCerifRelations(publication.getAuthors().getAuthor(),
					CerifBaseMapper::mapCfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitTypeToPersonId,
					mapAutoresXsdToDomain(publicacionCerif.getShortId())));
		}

		domains.addAll(
				mapCerifRelations(publication.getOriginatesFrom(), PublicacionMapper::mapOriginatesFromToIdProyecto,
						mapProyectosXsdToDomain(publicacionCerif.getShortId())));

		PublicacionPublicacionCerif publicacionPublicacionCerif = mapPublicacionesXsdToDomain(publicacionCerif.getShortId(), publication.getPublishedIn());
		if (publicacionPublicacionCerif != null) {
			domains.add(publicacionPublicacionCerif);
		}

		return domains;
	}

	private static PublicacionPublicacionCerif mapPublicacionesXsdToDomain(String shorId, PublishedIn publishedIn) {
		if (publishedIn == null || publishedIn.getPublication() == null
				|| publishedIn.getPublication().getId() == null) {
			return null;
		}

		PublicacionPublicacionCerif publicacionPublicacionCerif = new PublicacionPublicacionCerif();
		publicacionPublicacionCerif.setIdPublicacion(shorId);
		publicacionPublicacionCerif.setIdPublicacionIn(publishedIn.getPublication().getId());

		return publicacionPublicacionCerif;
	}

	private static Function<String, PublicacionAutorCerif> mapAutoresXsdToDomain(String shortId) {
		return (personId) -> {
			PublicacionAutorCerif publicacionAutorCerif = new PublicacionAutorCerif();
			publicacionAutorCerif.setIdPublicacion(shortId);
			publicacionAutorCerif.setIdPersona(personId);
			return publicacionAutorCerif;
		};
	}

	private static Function<String, PublicacionProyectoCerif> mapProyectosXsdToDomain(String shortId) {
		return (idProyecto) -> {
			PublicacionProyectoCerif publicacionProyectoCerif = new PublicacionProyectoCerif();
			publicacionProyectoCerif.setIdPublicacion(shortId);
			publicacionProyectoCerif.setIdProyecto(idProyecto);
			return publicacionProyectoCerif;
		};
	}

	private static String mapOriginatesFromToIdProyecto(OriginatesFrom originatesFrom) {
		if (originatesFrom == null || originatesFrom.getProjectFundingSubstitutionGroupHead() == null
				|| originatesFrom.getProjectFundingSubstitutionGroupHead().getValue() == null) {
			return null;
		}

		return originatesFrom.getProjectFundingSubstitutionGroupHead().getValue().getId();
	}
}
