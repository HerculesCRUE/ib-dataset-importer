package es.um.asio.importer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class ImportProperties {
	    
    private String dataSetPath;
    
    private String cvnEndpoint;
       
    private String oaiEndpoint;
    
    @Autowired
    private Environment env;
          
    public String getDataSetPath() {
		return dataSetPath == null ? env.getProperty("app.data.path") : dataSetPath;
	}

	public void setDataSetPath(String dataSetPath) {
		this.dataSetPath = dataSetPath;
	}

	public String getCvnEndpoint() {
		return cvnEndpoint == null ? env.getProperty("app.services.cvn.endpoint") : cvnEndpoint;
	}

	public void setCvnEndpoint(String cvnEndpoint) {
		this.cvnEndpoint = cvnEndpoint;
	}

	public String getOaiEndpoint() {
		return oaiEndpoint == null ? env.getProperty("app.services.oai.endpoint") : oaiEndpoint;
	}

	public void setOaiEndpoint(String oaiEndpoint) {
		this.oaiEndpoint = oaiEndpoint;
	}
}
