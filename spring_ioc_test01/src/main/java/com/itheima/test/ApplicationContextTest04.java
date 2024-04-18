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
public class ApplicationContextTest04 {
    public static void main(String[] args) {
        //指定环境
        System.setProperty("spring.profiles.active","dev");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext04.xml");
        /*UserService userService = (UserService) applicationContext.getBean("userService");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");*/
        UserService userService01 = (UserService) applicationContext.getBean("userService01");
        //UserDao userDao01 = (UserDao) applicationContext.getBean("userDao01");

        /*System.out.println(userDao);
        System.out.println(userService);*/

        //System.out.println(userDao01);
        System.out.println(userService01);
    }



}
