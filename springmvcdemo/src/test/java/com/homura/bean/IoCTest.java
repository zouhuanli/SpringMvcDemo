package com.homura.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCTest {
    public static void main(String[] args) {
            ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springmvc-context.xml");
            Beta beta = applicationContext.getBean(Beta.class);
            beta.invokeSigmaMethod();
    }
}
