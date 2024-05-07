package com.itheima.test;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/02/16 16:53
 * @Description
 */
public class ApplicationContextTest03 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext03.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        UserService userService01 = (UserService) applicationContext.getBean("userService01");
        userService.show();
        userService01.show();
        //System.out.println(userService);
    }



}
