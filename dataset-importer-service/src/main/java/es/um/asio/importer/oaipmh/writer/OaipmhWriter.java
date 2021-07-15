package es.um.asio.importer.oaipmh.writer;

import java.util.List;

import org.springframework.stereotype.Component;

import es.um.asio.domain.DataSetData;
import es.um.asio.domain.InputData;

@Component
public interface OaipmhWriter {

	/**
	 * {@inheritDoc}
	 */
	void write(List<? extends InputData<DataSetData>> datas) throws Exception;

}
