package es.um.asio.importer.cerif.repository;

import java.util.List;

import es.um.asio.importer.oaipmh.model.HeaderType;
import es.um.asio.importer.oaipmh.model.RecordType;
import es.um.asio.importer.oaipmh.model.SetType;

public interface CerifRepository {

	List<SetType> getSets();
	
	List<HeaderType> getSetDetailsContent(String setType);
	
	RecordType getEntityDetailsContent(String entityId);
	
	void setEndPoint(String endPoint);
}
