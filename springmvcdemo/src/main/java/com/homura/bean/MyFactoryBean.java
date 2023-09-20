package com.homura.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 测试FactoryBean
 * @author zouhl
 */
@Component
public class MyFactoryBean implements FactoryBean<Alpha> {
    @Override
    public Alpha getObject() {
        return new Alpha();
    }

    @Override
    public Class<?> getObjectType() {
        return Alpha.class;
    }
}
