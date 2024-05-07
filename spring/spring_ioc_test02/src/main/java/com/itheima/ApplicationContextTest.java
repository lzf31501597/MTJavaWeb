package com.itheima;

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
        Object userDao = applicationContext.getBean("userDao");
        UserService userService = applicationContext.getBean(UserService.class);
        System.out.println(userDao);
        System.out.println(userService);
    }



}
