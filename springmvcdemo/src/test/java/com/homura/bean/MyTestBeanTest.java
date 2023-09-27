package com.homura.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTestBeanTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springmvc-context.xml");
        applicationContext.start();
        MyTestBean myTestBean = applicationContext.getBean(MyTestBean.class);
        myTestBean.doSomething();
        applicationContext.close();
    }
}
