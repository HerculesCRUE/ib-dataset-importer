package es.um.asio.importer.cvn.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import es.um.asio.importer.cvn.model.beans.CvnRootBean;
import es.um.asio.importer.cvn.reader.CvnReader;
import es.um.asio.importer.listener.JobCompletionNotificationListener;

@Component
@Qualifier("CvnJobExecutorListener")
public class CvnJobExecutorListener extends JobCompletionNotificationListener {

	@Autowired
	@Qualifier("CvnReader")
	private ItemReader<CvnRootBean> reader;
	
    public void beforeJob(JobExecution jobExecution) {
       super.beforeJob(jobExecution);
    }
 
    public void afterJob(JobExecution jobExecution) {
        ((CvnReader)reader).resetChanges();
                
        super.afterJob(jobExecution);
    }
}
