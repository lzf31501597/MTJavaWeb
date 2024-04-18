package com.itheima.test;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/02/16 16:53
 * @Descriptio  n
 */
public class ApplicationContextTest05 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext05.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        System.out.println(userDao);
        System.out.println(userService);

    }



}
