package com.homura.config.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
public class PropertySourcesPlaceholderConfigurerConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        PropertySourcesPlaceholderConfigurer propertyConfigurer = new PropertySourcesPlaceholderConfigurer();
        propertyConfigurer.setIgnoreUnresolvablePlaceholders(true);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource classPathResource = resolver.getResource("classpath:springmvc-db.properties");
        propertyConfigurer.setLocation(classPathResource);
        return propertyConfigurer;
    }
}
