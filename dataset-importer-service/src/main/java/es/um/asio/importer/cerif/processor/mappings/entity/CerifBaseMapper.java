package es.um.asio.importer.cerif.processor.mappings.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.function.Function;
import java.util.stream.Collectors;

import es.um.asio.importer.cerif.model.include.commons.CfDateType;
import es.um.asio.importer.cerif.model.include.commons.CfGenericDateTimeType;
import es.um.asio.importer.cerif.model.include.commons.CfGenericURIClassificationType;
import es.um.asio.importer.cerif.model.include.commons.CfLinkWithDisplayNameToPersonOrOrgUnitType;
import es.um.asio.importer.cerif.model.include.commons.CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType;
import es.um.asio.importer.cerif.model.include.commons.CfLinkWithDisplayNameToPersonWithAffiliationsType;
import es.um.asio.importer.cerif.model.include.commons.CfMLangAnyMixedType;
import es.um.asio.importer.cerif.model.include.commons.CfMLangStringType;

public class CerifBaseMapper {

	protected static String mapLangStringsToString(List<CfMLangStringType> langStrings) {
		if (langStrings == null || langStrings.isEmpty()) {
			return null;
		}

		return langStrings.get(0).getValue();
	}

	protected static Object mapLangAnyToObject(List<CfMLangAnyMixedType> langAny) {
		if (langAny == null || langAny.isEmpty() || langAny.get(0).getContent().isEmpty()) {
			return null;
		}

		return langAny.get(0).getContent().get(0);
	}

	protected static String mapGenericURIClassificationToString(
			List<CfGenericURIClassificationType> genericURIClassification) {
		if (genericURIClassification == null || genericURIClassification.isEmpty()) {
			return null;
		}

		return genericURIClassification.get(0).getValue();
	}

	protected static String mapCfDateTypeToString(CfDateType date) {

		if (date == null || date.getValue() == null) {
			return null;
		}

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		return sdf.format(date.getValue().toGregorianCalendar().getTime());
	}

	protected static String mapCfGenericDateTimeTypeToString(CfGenericDateTimeType date) {
		if (date == null || date.getValue() == null || date.getValue().isEmpty()) {
			return null;
		}

		SimpleDateFormat finalPattern = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

		List<SimpleDateFormat> supportedPatterns = new ArrayList<SimpleDateFormat>();
		supportedPatterns.add(new SimpleDateFormat("YYYY"));
		supportedPatterns.add(new SimpleDateFormat("YYYY-MM"));
		supportedPatterns.add(new SimpleDateFormat("YYYY-MM-DD"));
		supportedPatterns.add(new SimpleDateFormat("YYYY-MM-DD'T'hh:mm:ss(.SSS)"));

		return supportedPatterns.stream().map(format -> {
			try {
				Date supportedDate = new Date(format.parse(date.getValue().get(0)).getTime());
				return finalPattern.format(supportedDate);
			} catch (ParseException pe) {
				return null;
			}
		}).filter(Objects::nonNull).findFirst().orElse(null);
	}

	protected static String mapCfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitTypeToPersonId(
			CfLinkWithDisplayNameToPersonWithAffiliationsOrOrgUnitType data) {
		if (data == null || data.getPersonSubstitutionGroupHead() == null
				|| data.getPersonSubstitutionGroupHead().getValue() == null
				|| data.getPersonSubstitutionGroupHead().getValue().getId() == null) {
			return null;
		}

		return data.getPersonSubstitutionGroupHead().getValue().getId();
	}

	protected static String mapCfLinkWithDisplayNameToPersonWithAffiliationsTypeToPersonId(
			CfLinkWithDisplayNameToPersonWithAffiliationsType data) {
		if (data == null || data.getPersonSubstitutionGroupHead() == null
				|| data.getPersonSubstitutionGroupHead().getValue() == null
				|| data.getPersonSubstitutionGroupHead().getValue().getId() == null) {
			return null;
		}

		return data.getPersonSubstitutionGroupHead().getValue().getId();
	}

	protected static String mapCfLinkWithDisplayNameToPersonOrOrgUnitTypeToUnidadId(
			CfLinkWithDisplayNameToPersonOrOrgUnitType data) {
		if (data == null || data.getPersonOrOrgUnitSubstitutionGroupHead() == null
				|| data.getPersonOrOrgUnitSubstitutionGroupHead().getValue() == null) {
			return null;
		}

		return data.getPersonOrOrgUnitSubstitutionGroupHead().getValue().getId();
	}

	protected static <S,T> List<T> mapCerifRelations(List<S> data, Function<S, String> idMapper, Function<String, T> relationEntityMapper) {
		List<T> relationEntities = new ArrayList<T>();
		if (data == null) {
			return relationEntities;
		}

		relationEntities.addAll(data.stream()
				.map(idMapper)
				.filter(Objects::nonNull)
				.map(relationEntityMapper)
				.collect(Collectors.toList()));

		return relationEntities;
	}
}
