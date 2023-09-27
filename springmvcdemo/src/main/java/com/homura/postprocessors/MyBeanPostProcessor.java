package com.homura.postprocessors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 会作用于所有的bean
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    private static final Logger LOGGER= LoggerFactory.getLogger(MyBeanPostProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        LOGGER.info("MyBeanPostProcessor.postProcessBeforeInitialization()");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        LOGGER.info("MyBeanPostProcessor.postProcessAfterInitialization()");
        return bean;
    }
}
