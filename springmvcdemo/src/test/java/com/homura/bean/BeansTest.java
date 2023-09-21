package com.homura.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springmvc-context.xml");
        //按类型已经无法获取了，因为有两个Beta类型的bean。Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.homura.bean.Beta' available: expected single matching bean but found 2: beta,beta1
        // Beta beta = applicationContext.getBean(Beta.class);
        //  beta.invokeSigmaMethod();

        Beta beta = (Beta) applicationContext.getBean("beta");
        Beta beta1 = (Beta) applicationContext.getBean("beta1");
        Beta beta2 = (Beta) applicationContext.getBean("beta2");
        System.out.println(beta);
        System.out.println(beta1);
        System.out.println(beta2);

    }
}
