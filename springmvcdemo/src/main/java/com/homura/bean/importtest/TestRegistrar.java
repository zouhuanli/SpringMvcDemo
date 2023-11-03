package com.homura.bean.importtest;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class TestRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        System.out.println("TestRegistrar.registerBeanDefinitions");
        registry.registerBeanDefinition("testBeanD", new RootBeanDefinition(TestBeanD.class));

    }
}

class TestBeanD {
}