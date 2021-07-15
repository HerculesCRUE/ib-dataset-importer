package es.um.asio.importer.cvn.processor;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import es.um.asio.domain.DataSetData;
import es.um.asio.domain.InputData;
import es.um.asio.domain.cvn.CvnAuthorBean;
import es.um.asio.domain.cvn.CvnItemBean;
import es.um.asio.importer.cvn.mapper.CvnRootBeanMapper;
import es.um.asio.importer.cvn.model.beans.CvnRootBean;

/**
 * Processor in charge of converts {@link CvnRootBean} to into
 * {@link InputData<DataSetData>} and add version number
 */
public class CvnItemProcessor implements ItemProcessor<CvnRootBean, InputData<DataSetData>> {

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(CvnItemProcessor.class);

	/**
	 * The mapper.
	 */
	@Autowired
	CvnRootBeanMapper mapper;

	/**
	 * The job execution id.
	 */
	private long jobExecutionId;

	/**
	 * @inheritDoc
	 */
	@BeforeStep
	public void beforeStep(StepExecution stepExecution) {
		jobExecutionId = stepExecution.getJobExecutionId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InputData<DataSetData> process(CvnRootBean cvnRootBean) throws Exception {
		
		es.um.asio.domain.cvn.CvnRootBean domainCvn = mapper.map(cvnRootBean);
		setVersion(domainCvn.getCvnItemBean());

		domainCvn.setVersion(jobExecutionId);

		logger.info(String.format("Processing CVN data cvn. "));
		return new InputData<>(domainCvn);
	}

	private <K extends DataSetData> void setVersion(List<K> list) {
		if (list != null) {
			for (DataSetData data : list) {
				data.setVersion(jobExecutionId);

				if (data.getClass().isAssignableFrom(CvnItemBean.class)) {
					setVersion(((CvnItemBean) data).getCvnAuthorBean());
					setVersion(((CvnItemBean) data).getCvnBoolean());
					setVersion(((CvnItemBean) data).getCvnCodeGroup());
					setVersion(((CvnItemBean) data).getCvnDateDayMonthYear());
					setVersion(((CvnItemBean) data).getCvnDateMonthYear());
					setVersion(((CvnItemBean) data).getCvnDateYear());
					setVersion(((CvnItemBean) data).getCvnDouble());
					setVersion(((CvnItemBean) data).getCvnDuration());
					setVersion(((CvnItemBean) data).getCvnEntityBean());
					setVersion(((CvnItemBean) data).getCvnExternalPKBean());
					setVersion(((CvnItemBean) data).getCvnFamilyNameBean());
					setVersion(((CvnItemBean) data).getCvnPageBean());
					setVersion(((CvnItemBean) data).getCvnPhoneBean());
					setVersion(((CvnItemBean) data).getCvnPhotoBean());
					setVersion(((CvnItemBean) data).getCvnRichText());
					setVersion(((CvnItemBean) data).getCvnString());
					setVersion(((CvnItemBean) data).getCvnTitleBean());
					setVersion(((CvnItemBean) data).getCvnVolumeBean());

				} else if (data instanceof CvnAuthorBean) {
					((CvnAuthorBean) data).getCvnFamilyNameBean().setVersion(jobExecutionId);
				}
			}
		}

	}

}
