package com.homura.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void  main(String[]  args){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("springmvc-context.xml");
        applicationContext.start();
    }
}
