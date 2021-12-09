package es.um.asio.importer.cerif.repository;

import java.util.List;

import es.um.asio.importer.cerif.model.xsd.oaipmh.HeaderType;
import es.um.asio.importer.cerif.model.xsd.oaipmh.RecordType;
import es.um.asio.importer.cerif.model.xsd.oaipmh.SetType;

public interface CerifRepository {

	List<SetType> getSets();
	
	List<HeaderType> getSetDetailsContent(String setType);
	
	RecordType getEntityDetailsContent(String entityId);
	
	void setEndPoint(String endPoint);
}
