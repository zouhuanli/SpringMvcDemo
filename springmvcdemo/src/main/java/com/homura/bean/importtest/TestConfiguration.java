package com.homura.bean.importtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {
    @Bean(name = "testBeanB")
    public TestBeanB testBeanB() {
        return new TestBeanB();
    }
}

class TestBeanB {
}

