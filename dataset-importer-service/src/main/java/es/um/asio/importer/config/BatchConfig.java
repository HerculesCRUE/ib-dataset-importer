package es.um.asio.importer.config;

import org.springframework.batch.core.configuration.annotation.DefaultBatchConfigurer;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.support.ApplicationContextFactory;
import org.springframework.batch.core.configuration.support.GenericApplicationContextFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import es.um.asio.importer.cvn.config.ImportCvnJobConfiguration;
import es.um.asio.importer.dataset.config.ImportDataSetJobConfiguration;
import es.um.asio.importer.oaipmh.config.ImportOaipmhJobConfiguration;

/**
 * Configuracion general de los job. En esta clase se definiría:
 * <ul>
 * <li>Datasource a utilizar para la base de datos de control de jobs (si no hay ninguna otra definicion de datasource
 * en otro modulo)</li>
 * <li>Otros bean necesarios</li>
 * </ul>
 *
 * En caso de que hubiese mas de un datasource, se debera desambiguar utilizando la anotacion {@link Primary} si es
 * posible. Si no, se debera
 * extender la clase {@link DefaultBatchConfigurer} como aparece en la documentacion de Spring Batch
 */
@EnableBatchProcessing(modular = true)
@Configuration
public class BatchConfig {

    @Bean
    @Qualifier("ImportDataSetJobContextFactory")
    public ApplicationContextFactory importDataSetJobContextFactory() {
        return new GenericApplicationContextFactory(ImportDataSetJobConfiguration.class);
    }

    @Bean
    @Qualifier("ImportCvnSetJobContextFactory")
    public ApplicationContextFactory importCvnSetJobContextFactory() {
        return new GenericApplicationContextFactory(ImportCvnJobConfiguration.class);
    }
    
    @Bean
    @Qualifier("ImportOaipmhJobContextFactory")
    public ApplicationContextFactory importOaipmhJobContextFactory() {
        return new GenericApplicationContextFactory(ImportOaipmhJobConfiguration.class);
    }	
}
