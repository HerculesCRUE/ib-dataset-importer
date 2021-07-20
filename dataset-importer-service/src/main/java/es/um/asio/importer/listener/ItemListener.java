package es.um.asio.importer.listener;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemReadListener;
import org.springframework.stereotype.Component;

import es.um.asio.domain.DataSetData;

@Component
public class ItemListener implements ItemReadListener<DataSetData> {

	private static final Logger logger = LoggerFactory.getLogger(ItemListener.class);


   
	@Override
	public void beforeRead() {
	}

	@Override
	public void afterRead(DataSetData item) {
	}

	@Override
	public void onReadError(Exception ex) {
		// TODO Send error to kafka
		logger.error("onReadError - Unknown ", ex);
	}
}
