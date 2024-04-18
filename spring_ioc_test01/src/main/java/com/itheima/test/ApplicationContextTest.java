package com.itheima.test;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.DriverManager;

/**
 * @author
 * @version 1.0
 * @date 2024/02/16 16:53
 * @Description
 */
public class ApplicationContextTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*UserService userService1 = (UserService) applicationContext.getBean("userService");
        UserService userService2 = (UserService) applicationContext.getBean("userService");
        UserService userService3 = (UserService) applicationContext.getBean("userService");
        //UserService userService = (UserService) applicationContext.getBean("com.itheima.service.impl.UserServiceImpl");
        System.out.println(userService1);
        System.out.println(userService2);
        System.out.println(userService3);*/

        /*Object userDao1 = applicationContext.getBean("userDao1");
        System.out.println(userDao1);*/

        /*Object userDao2 = applicationContext.getBean("userDao2");
        System.out.println(userDao2);*/

        Object userDao3 = applicationContext.getBean("userDao3");
        Object userDao4 = applicationContext.getBean("userDao3");
        System.out.println(userDao3);
        System.out.println(userDao4);
    }



}
