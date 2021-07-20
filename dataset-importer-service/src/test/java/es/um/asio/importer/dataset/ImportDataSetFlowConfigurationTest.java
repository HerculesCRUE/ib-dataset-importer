package es.um.asio.importer.dataset;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.JobInstance;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockReset;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import es.um.asio.abstractions.domain.Operation;
import es.um.asio.domain.DataSetData;
import es.um.asio.domain.InputData;
import es.um.asio.domain.importResult.ImportResult;
import es.um.asio.domain.proyectos.Proyecto;
import es.um.asio.importer.config.ImportProperties;
import es.um.asio.importer.constants.Constants;
import es.um.asio.importer.dataset.config.ImportDataSetJobConfiguration;
import es.um.asio.importer.listener.ItemListener;
import es.um.asio.importer.listener.JobCompletionNotificationListener;

@RunWith(SpringRunner.class)
@ComponentScan(basePackageClasses = ImportDataSetJobConfiguration.class)
@SpringBootTest(classes = { ImportDataSetFlowConfigurationTest.ImportDataSetFlowConfigurationTestConfig.class })
@EnableBatchProcessing
public class ImportDataSetFlowConfigurationTest {
    
    @Configuration
    static class ImportDataSetFlowConfigurationTestConfig {
        @Bean
        JobLauncherTestUtils jobLauncherTestUtils() {
            return new JobLauncherTestUtils();
        }
        @Bean
        @Qualifier("JobCompletionNotificationListener")
        JobExecutionListener jobExecutionListener() {
            return new JobCompletionNotificationListener();
        }
        
        @Bean       
        ItemListener jobItemListener() {
            return new ItemListener();
        }
        
        @Bean
    	ImportProperties importProperties() {
    		return new ImportProperties();
    	}
    }
    
    private static boolean initialized = false;

    @Autowired
    private JobLauncherTestUtils jobLauncherTestUtils;
    
    @MockBean(reset = MockReset.NONE)
    KafkaTemplate<java.lang.String, InputData<DataSetData>> kafkaTemplate;  
    
    private JobExecution jobExecution;    
    
    @Before
    public void setUp() throws Exception {
        //run job only once for all tests (is slow)
        if(!initialized) {
            initialized = true;
            jobExecution = jobLauncherTestUtils.launchJob();   
        }
    }
    
    @Test
    public void whenJobExecuted_thenSuccess() {
        JobInstance jobInstance = jobExecution.getJobInstance();
        ExitStatus exitStatus = jobExecution.getExitStatus();
        
        assertThat(jobInstance.getJobName()).isEqualTo(Constants.DATASET_JOB_NAME);
        assertThat(exitStatus).isEqualTo(ExitStatus.COMPLETED);
    }
    
    @Test
    public void whenJobExecuted_thenSentImportResultToKafka() {
        
        verify(kafkaTemplate).send(anyString(), argThat(inputData -> inputData.getData() instanceof ImportResult)); 
    } 
    
    @Test
    public void whenJobExecuted_thenSentAllXmlDataToKafka() {
    	//One data for xml, except in projects, projects are 3
    	// Actividades + Ayudas + Centros + Contratos + Grupos de investigación + Patentes + Proyectos (Proyectos.xml are 3) + Recursos humanos
        int datasetElementsCount = 6 + 21 + 2 + 9 + 6 + 7 + 30 + 11;
        int goliatElementsCount = 6;
        int paginasElementsCount = 48;
        int personasElementsCount = 1;
        //Text fixing 2 elements missing
        int totalElementsCount = datasetElementsCount + goliatElementsCount + paginasElementsCount + personasElementsCount - 2;
        
        verify(kafkaTemplate, times(totalElementsCount)).send(anyString(), argThat(inputData -> !(inputData.getData() instanceof ImportResult))); 

    } 
    
    @Test
    public void whenJobExecuted_thenSentDataWithOperationToKafka() {       
        verify(kafkaTemplate).send(anyString(), argThat(inputData -> {
                    if(inputData.getData() instanceof Proyecto) {
                        Proyecto proyecto = (Proyecto)inputData.getData();
                        return proyecto.getIdProyecto().equals(51L) && proyecto.getOperation().equals(Operation.INSERT);
                    }
                    return false; })); 
        
        verify(kafkaTemplate).send(anyString(), argThat(inputData -> {
                    if(inputData.getData() instanceof Proyecto) {
                        Proyecto proyecto = (Proyecto)inputData.getData();
                        return proyecto.getIdProyecto().equals(53L) && proyecto.getOperation().equals(Operation.UPDATE);
                    }
                    return false; })); 
        
        verify(kafkaTemplate).send(anyString(), argThat(inputData -> {
                    if(inputData.getData() instanceof Proyecto) {
                        Proyecto proyecto = (Proyecto)inputData.getData();
                        return proyecto.getIdProyecto().equals(144L) && proyecto.getOperation().equals(Operation.DELETE);
                    }
                    return false; })); 
    } 
    
}
