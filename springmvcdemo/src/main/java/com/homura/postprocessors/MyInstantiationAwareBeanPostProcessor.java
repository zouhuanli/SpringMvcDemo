package com.homura.postprocessors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 会作用于所有的bean
 */
@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyInstantiationAwareBeanPostProcessor.class);

    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) {
        LOGGER.info("MyInstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation()");
        return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        LOGGER.info("MyInstantiationAwareBeanPostProcessor.postProcessAfterInstantiation()");
        return true;
    }

    public Object postProcessProperties(Object bean, String beanName) {
        LOGGER.info("MyInstantiationAwareBeanPostProcessor.postProcessProperties()");
        return bean;
    }
}
