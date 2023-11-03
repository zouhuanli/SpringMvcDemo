package com.homura.config;

import com.homura.bean.importtest.TestBeanA;
import com.homura.bean.importtest.TestConfiguration;
import com.homura.bean.importtest.TestImportSelector;
import com.homura.bean.importtest.TestRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@Import({TestBeanA.class, TestConfiguration.class, TestImportSelector.class, TestRegistrar.class})
public class ImportConfig {
}
