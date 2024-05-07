package com.itheima.test;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author
 * @version 1.0
 * @date 2024/02/16 16:53
 * @Descriptio  n
 */
public class ApplicationContextTest13 {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext13.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        //System.out.println(userService);
        userService.show();


    }



}
