package com.homura;

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

    }
}
