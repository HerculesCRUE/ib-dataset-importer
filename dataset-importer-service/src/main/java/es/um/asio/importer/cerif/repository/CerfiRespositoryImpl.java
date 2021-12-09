package es.um.asio.importer.cerif.repository;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import es.um.asio.importer.cerif.model.xsd.oaipmh.HeaderType;
import es.um.asio.importer.cerif.model.xsd.oaipmh.OAIPMHtype;
import es.um.asio.importer.cerif.model.xsd.oaipmh.RecordType;
import es.um.asio.importer.cerif.model.xsd.oaipmh.ResumptionTokenType;
import es.um.asio.importer.cerif.model.xsd.oaipmh.SetType;
import io.micrometer.core.instrument.util.StringUtils;

@Repository
public class CerfiRespositoryImpl implements CerifRepository {

	private static final Logger logger = LoggerFactory.getLogger(CerfiRespositoryImpl.class);

	@Autowired
	@Qualifier("restTemplateHttps")
	private RestTemplate restTemplate;

	@Value("${app.services.cerif.endpoint}")
	private String endPoint;

	/** The CERIF factory endpoint. */
	@Value("${app.services.cerif.endpoint-list}")
	private String endPointGetSetsContext;

	/** The CERIF factory endpoint. */
	@Value("${app.services.cerif.endpoint-ids}")
	private String endPointGetSetDetailsContext;

	/** The CERIF factory endpoint. */
	@Value("${app.services.cerif.endpoint-token}")
	private String endPointGetNextTokenPage;

	/** The uri factory endpoint. */
	@Value("${app.services.cerif.endpoint-xml}")
	private String endPointGetEntityDetailsContext;

	/** The uri factory endpoint. */
	@Value("${app.services.cerif.tokenCount}")
	private Integer countToken;

	@Override
	public List<SetType> getSets() {
		Function<OAIPMHtype, List<SetType>> getContent = (content) -> {
			if (content.getListSets() != null && content.getListSets().getSet() != null) {
				return content.getListSets().getSet();
			}
			return null;
		};
		return getCerifRequestContent(endPoint.concat(endPointGetSetsContext), getContent);
	}

	@Override
	public List<HeaderType> getSetDetailsContent(String setType) {
		Function<OAIPMHtype, List<HeaderType>> getContent = (content) -> {
			if (content.getListIdentifiers() != null && content.getListIdentifiers().getHeader() != null) {

				List<HeaderType> listFinal = new ArrayList<>();

				listFinal.addAll(content.getListIdentifiers().getHeader());

				ResumptionTokenType token = content.getListIdentifiers().getResumptionToken();
				Integer count = 0;
				while (token != null && StringUtils.isNotEmpty(token.getValue()) && count < countToken) {
					count++;
					OAIPMHtype oaipmhtype = getNexTPageResumeToken(
							endPoint.concat(endPointGetNextTokenPage.concat(token.getValue())));

					if (oaipmhtype.getListIdentifiers() != null
							&& oaipmhtype.getListIdentifiers().getHeader() != null) {
						listFinal.addAll(oaipmhtype.getListIdentifiers().getHeader());
						if (oaipmhtype.getListIdentifiers().getResumptionToken() != null && StringUtils
								.isNotEmpty(oaipmhtype.getListIdentifiers().getResumptionToken().getValue())) {
							token = oaipmhtype.getListIdentifiers().getResumptionToken();
						} else {
							token = null;
						}
					} else {
						token = null;
					}
				}

				return listFinal;

			}
			return null;
		};
		return getCerifRequestContent(endPoint.concat(endPointGetSetDetailsContext).concat(setType), getContent);
	}

	public OAIPMHtype getNexTPageResumeToken(String token) {

		OAIPMHtype responseContent = null;
		try {
			ResponseEntity<String> response = restTemplate.exchange(token, HttpMethod.GET, new HttpEntity(null),
					String.class);

			if (response != null && response.getStatusCode() == HttpStatus.OK) {
				JAXBContext jaxbContext = JAXBContext.newInstance(OAIPMHtype.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				JAXBElement<OAIPMHtype> jabxElement = (JAXBElement) jaxbUnmarshaller
						.unmarshal(new StringReader(response.getBody()));
				OAIPMHtype type = jabxElement.getValue();
				if (type.getError() != null && !type.getError().isEmpty()) {
					logger.error(String.format("getCerifRequestContent - Unknown error. url: %s", token),
							type.getError().get(0).getValue());
				} else {
					responseContent = type;
				}
			} else {
				logger.error(String.format("getCerifRequestContent - Invalid response. Status: %s, Body: %s",
						response != null ? response.getStatusCode().name() : null,
						response != null ? response.getBody() : null));
			}
		} catch (Exception e) {
			logger.error(String.format("getCerifRequestContent - Unknown error. url: %s", token), e);
		}

		return responseContent;

	}

	@Override
	public RecordType getEntityDetailsContent(String entityId) {
		Function<OAIPMHtype, List<RecordType>> getContent = (content) -> {
			if (content.getGetRecord() != null && content.getGetRecord().getRecord() != null) {
				return Arrays.asList(content.getGetRecord().getRecord());
			}
			return null;
		};
		List<RecordType> content = getCerifRequestContent(
				endPoint.concat(endPointGetEntityDetailsContext).concat(entityId), getContent);
		if (content.isEmpty()) {
			return null;
		}
		return content.get(0);
	}

	@Override
	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	private <T> List<T> getCerifRequestContent(String endpoint, Function<OAIPMHtype, List<T>> getResponseType) {
		String error = null;
		List<T> responseContent = null;
		try {
			ResponseEntity<String> response = restTemplate.exchange(endpoint, HttpMethod.GET, new HttpEntity(null),
					String.class);

			if (response != null && response.getStatusCode() == HttpStatus.OK) {
				JAXBContext jaxbContext = JAXBContext.newInstance(OAIPMHtype.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				JAXBElement<OAIPMHtype> jabxElement = (JAXBElement) jaxbUnmarshaller
						.unmarshal(new StringReader(response.getBody()));
				OAIPMHtype type = jabxElement.getValue();
				if (type.getError() != null && !type.getError().isEmpty()) {
					error = type.getError().get(0).getValue();
				} else {
					responseContent = getResponseType.apply(type);
				}
			} else {
				logger.error(String.format("getCerifRequestContent - Invalid response. Status: %s, Body: %s",
						response != null ? response.getStatusCode().name() : null,
						response != null ? response.getBody() : null));
			}
		} catch (Exception e) {
			logger.error(String.format("getCerifRequestContent - Unknown error. url: %s", endpoint), e);
		}

		if (responseContent == null || responseContent.isEmpty()) {
			logger.error(String.format("getCerifRequestContent - Empty response or error. url: %s, error: %s", endpoint,
					error));
			return Collections.emptyList();
		}

		return responseContent;
	}
}
