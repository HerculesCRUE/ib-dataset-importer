package es.um.asio.importer.cerif.repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import es.um.asio.importer.oaipmh.model.HeaderType;
import es.um.asio.importer.oaipmh.model.OAIPMHtype;
import es.um.asio.importer.oaipmh.model.RecordType;
import es.um.asio.importer.oaipmh.model.SetType;

@Repository
public class CerfiRespositoryImpl implements CerifRepository{
	
	private static final Logger logger = LoggerFactory.getLogger(CerfiRespositoryImpl.class);
	
	@Autowired
	@Qualifier("restTemplateHttps")
	private RestTemplate restTemplate;

	@Value("${app.services.oai.endpoint}")
	private String endPoint;
	
	/** The CERIF factory endpoint. */
	@Value("${app.services.cerif.endpoint-list}")
	private String endPointGetSetsContext;

	/** The CERIF factory endpoint. */
	@Value("${app.services.cerif.endpoint-ids}")
	private String endPointGetSetDetailsContext;

	/** The uri factory endpoint. */
	@Value("${app.services.cerif.endpoint-xml}")
	private String endPointGetEntityDetailsContext;

	@Override
	public List<SetType> getSets() {
		Function<OAIPMHtype, List<SetType>> getContent = (content) -> {
			if(content.getListSets() != null && content.getListSets().getSet()!=null) {
				return content.getListSets().getSet();
			}
			return null;
		};
		return getCerifRequestContent(endPoint.concat(endPointGetSetsContext), getContent);
	}

	@Override
	public List<HeaderType> getSetDetailsContent(String setType) {
		Function<OAIPMHtype, List<HeaderType>> getContent = (content) -> {
			if(content.getListIdentifiers()!=null && content.getListIdentifiers().getHeader()!=null) {
				return content.getListIdentifiers().getHeader();
			}
			return null;
		};
		return getCerifRequestContent(endPoint.concat(endPointGetSetDetailsContext).concat(setType), getContent);
	}

	@Override
	public RecordType getEntityDetailsContent(String entityId) {
		Function<OAIPMHtype, List<RecordType>> getContent = (content) -> {
			if(content.getGetRecord() != null && content.getGetRecord().getRecord()!=null) {
				return Arrays.asList(content.getGetRecord().getRecord());
			}
			return null;
		};
		List<RecordType> content = getCerifRequestContent(endPoint.concat(endPointGetEntityDetailsContext).concat(entityId), getContent);
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
		List<T> responseContent= null;
		try {			
			
			ResponseEntity<OAIPMHtype> response = restTemplate.getForEntity(endpoint, OAIPMHtype.class);
			
			if (response != null && response.getBody()!=null) {
				if (response.getBody().getError() != null && !response.getBody().getError().isEmpty()) {
					error = response.getBody().getError().get(0).getValue();
				} else {
					responseContent = getResponseType.apply(response.getBody());
				}
			}
		} catch (Exception e) {
			logger.error(String.format("getCerifRequestContent - Unknown error. url: %s", endpoint ) , e);
		}
		
		if (responseContent==null || responseContent.isEmpty()) {
			logger.error(String.format("getCerifRequestContent - Empty response or error. url: %s, error: %s", endpoint, error));
			return Collections.emptyList();
		}
		
		return responseContent;
	}
}
