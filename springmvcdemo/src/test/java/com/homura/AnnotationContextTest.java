package com.homura;

import com.homura.bean.importtest.*;
import com.homura.config.AnnotationContextConfig;
import com.homura.controller.UserController;
import com.homura.dao.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class AnnotationContextTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationContextConfig.class);
        System.out.println(applicationContext.getBean(DataSource.class));
        System.out.println(applicationContext.getBean("myFactoryBean"));
        applicationContext.getBean(UserController.class).hello(null, null, null);
        applicationContext.getBean(UserMapper.class).findUserList().forEach(System.out::println);
        System.out.println(applicationContext.getBean(DataSource.class));
        System.out.println(applicationContext.getBean(TestBeanA.class));

        System.out.println(applicationContext.getBean(TestConfiguration.class));
        System.out.println(applicationContext.getBean("testBeanB"));

       // System.out.println(applicationContext.getBean(TestImportSelector.class));
        System.out.println(applicationContext.getBean("com.homura.bean.importtest.TestBeanC"));

       // System.out.println(applicationContext.getBean(TestRegistrar.class));
        System.out.println(applicationContext.getBean("testBeanD"));

    }
}
