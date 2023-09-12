package com.homura.test;

import com.homura.bean.Alpha;
import com.homura.bean.MyFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springmvc-context.xml");
        applicationContext.start();
        //   Alpha alpha = applicationContext.getBean(Alpha.class);
        MyFactoryBean factoryBeanSelf = applicationContext.getBean(MyFactoryBean.class);
        System.out.println(factoryBeanSelf);
        MyFactoryBean factoryBeanSelfAlso = (MyFactoryBean) applicationContext.getBean("&myFactoryBean");
        System.out.println(factoryBeanSelfAlso);
        Alpha exposeBean = (Alpha) applicationContext.getBean("myFactoryBean");
        System.out.println(exposeBean);
        Alpha alpha = (Alpha) applicationContext.getBean("alpha");
        System.out.println(alpha);
      //  Alpha alpha1 = (Alpha) applicationContext.getBean(Alpha.class);报错
    }
}
