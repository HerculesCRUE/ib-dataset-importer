package es.um.asio.importer.config.persistence;

import javax.sql.DataSource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import es.um.asio.domain.DataSetData;
import es.um.asio.importer.config.persistence.properties.DatasourceProperties;
import es.um.asio.importer.config.persistence.properties.PersistenceProperties;

/**
 * Persistence configuration.
 */
@Configuration
@EnableConfigurationProperties(PersistenceProperties.class)
@EnableJpaRepositories("es.um.asio.importer.repository")
@EnableTransactionManagement
@EntityScan("es.um.asio.domain.importer")
public class PersistenceConfig {

    /**
     * Configuration properties.
     */
    @Autowired
    private PersistenceProperties properties;

    /**
     * Configures de datasource for the application.<br>
     * If {@link DatasourceProperties#jndiName} has a value, it will be used to obtain one instead of using
     * {@link DatasourceProperties#driverClassName}, {@link DatasourceProperties#url},
     * {@link DatasourceProperties#username}, {@link DatasourceProperties#password}
     * fields to build it.<br>
     * In either case, HikariCP is used to wrap the datasource.
     *
     * @return an instance of {@link javax.sql.DataSource} to be used as the datasource
     */
    @Bean
    public DataSource dataSource() {
        final HikariConfig config = new HikariConfig();
        final DatasourceProperties datasourceProperties = this.properties.getDatasource();

        if (StringUtils.isNotBlank(datasourceProperties.getJndiName())) {
            // JNDI conection
            final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
            dsLookup.setResourceRef(true);
            final DataSource dataSource = dsLookup.getDataSource(datasourceProperties.getJndiName());
            config.setDataSource(dataSource);
        } else {
            // Paarameters connection
            config.setDriverClassName(datasourceProperties.getDriverClassName());
            config.setJdbcUrl(datasourceProperties.getUrl());
            config.setUsername(datasourceProperties.getUsername());
            config.setPassword(datasourceProperties.getPassword());
        }

        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        config.addDataSourceProperty("useServerPrepStmts", "true");

        return new HikariDataSource(config);
    }

}
