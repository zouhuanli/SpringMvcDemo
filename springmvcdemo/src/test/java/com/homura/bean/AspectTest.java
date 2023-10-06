package com.homura.bean;

import com.homura.controller.UserController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectTest {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springmvc-context.xml");
        UserController userController = (UserController) applicationContext.getBean("userController");
        userController.list(null, null);


    }
}
