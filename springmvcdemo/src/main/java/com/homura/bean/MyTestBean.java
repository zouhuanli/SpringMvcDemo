package com.homura.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyTestBean implements ApplicationContextAware, BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {



    private static final Logger LOGGER = LoggerFactory.getLogger(MyTestBean.class);

    private ApplicationContext applicationContext;
    private BeanFactory beanFactory;
    private String beanName;

    public MyTestBean() {
        LOGGER.info("MyTestBean.MyTestBean()");
    }

    @PostConstruct
    public void postConstruct() {
        LOGGER.info("MyTestBean.postConstruct()");
    }

    @PreDestroy
    public void preDestroy() {
        LOGGER.info("MyTestBean.preDestroy()");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        LOGGER.info("MyTestBean.setApplicationContext()");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        LOGGER.info("MyTestBean.setBeanFactory()");
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        LOGGER.info("MyTestBean.setBeanName()");
    }

    @Override
    public void destroy() throws Exception {
        LOGGER.info("MyTestBean.destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.info("MyTestBean.afterPropertiesSet()");
    }

    /**
     * init-method
     */
    public void initMethod() {
        LOGGER.info("MyTestBean.initMethod()");
    }

    /**
     * destroy-method
     */
    public void destroyMethod() {
        LOGGER.info("MyTestBean.destroyMethod()");
    }

    public void doSomething() {
        LOGGER.info("MyTestBean.doSomething()");
    }
}
