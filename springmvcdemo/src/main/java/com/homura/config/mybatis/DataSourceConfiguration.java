package com.homura.config.mybatis;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfiguration {
    @Bean(name = "dataSource")
    public HikariDataSource dataSource(@Autowired @Qualifier("dataSourcePropertiesBean") DataSourcePropertiesBean dataSourceConfig) {
        return buildDataSource(dataSourceConfig);
    }
    private HikariDataSource buildDataSource(DataSourcePropertiesBean dataSourceConfig) {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setPoolName("HikariDataSource-Pool-1");
        dataSource.setDriverClassName(dataSourceConfig.getDriverClassName());
        dataSource.setJdbcUrl(dataSourceConfig.getJdbcUrl());
        dataSource.setUsername(dataSourceConfig.getUsername());
        dataSource.setPassword(dataSourceConfig.getPassword());
        dataSource.setConnectionTestQuery(dataSourceConfig.getConnectionTestQuery());
        dataSource.setValidationTimeout(dataSourceConfig.getValidationTimeout());
        dataSource.setReadOnly(dataSourceConfig.isReadOnly());
        dataSource.setConnectionTimeout(dataSourceConfig.getConnectionTimeout());
        dataSource.setIdleTimeout(dataSourceConfig.getIdleTimeout());
        dataSource.setMaxLifetime(dataSourceConfig.getMaxLifetime());
        dataSource.setMaximumPoolSize(dataSourceConfig.getMaximumPoolSize());

        return dataSource;
    }
}
