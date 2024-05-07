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
public class ApplicationContextTest02 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext02.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.show();
        //System.out.println(userService);
    }



}
