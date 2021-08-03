package es.um.asio.importer.cerif.processor.mappings.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import es.um.asio.domain.cerif.BaseCerif;
import es.um.asio.domain.cerif.PersonaCerif;
import es.um.asio.domain.cerif.PersonaUnidadOrganizacionCerif;
import es.um.asio.importer.cerif.model.xsd.Person;
import es.um.asio.importer.cerif.model.xsd.Person.Affiliation;
import es.um.asio.importer.cerif.model.xsd.Person.PersonName;

public class PersonaMapper extends CerifBaseMapper {

	public static List<? extends BaseCerif> mapXsdToDomain(Person persona) {
		List<BaseCerif> domains = new ArrayList<BaseCerif>();
		if (persona == null) {
			return domains;
		}

		PersonaCerif personaCerif = new PersonaCerif();

		personaCerif.setShortId(persona.getId());
		personaCerif.setNombre(persona.getPersonName() != null ? mapXsdNameToDomain(persona.getPersonName()) : null);
		personaCerif.setSexo(persona.getGender());

		domains.add(personaCerif);
		
		domains.addAll(mapCerifRelations(persona.getAffiliation(), PersonaMapper::mapAffiliationToIdUnidadOriganizativa,
				mapUnidadOrganizacionXsdToDomain(personaCerif.getShortId())));

		return domains;
	}

	private static String mapXsdNameToDomain(PersonName personName) {
		StringBuilder nombreBuilder = new StringBuilder();
		if (personName.getFirstNames() != null) {
			nombreBuilder.append(personName.getFirstNames().getValue());
		}
		if (personName.getFamilyNames() != null) {
			nombreBuilder.append(" ").append(personName.getFamilyNames().getValue());
		}
		return nombreBuilder.toString();
	}
	
	private static Function<String, PersonaUnidadOrganizacionCerif> mapUnidadOrganizacionXsdToDomain(String shortId) {
		return (idUnidadOrganizativa) -> {
			PersonaUnidadOrganizacionCerif personaUnidadOrganizacionCerif = new PersonaUnidadOrganizacionCerif();
			personaUnidadOrganizacionCerif.setIdPersona(shortId);
			personaUnidadOrganizacionCerif.setIdUnidadOrganizacion(idUnidadOrganizativa);
			return personaUnidadOrganizacionCerif;
		};
	}
	
	private static String mapAffiliationToIdUnidadOriganizativa(Affiliation affiliation) {
		return affiliation!=null && affiliation.getOrgUnit()!=null ? affiliation.getOrgUnit().getId():null;
	}
}
