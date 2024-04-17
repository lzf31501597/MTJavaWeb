package com.itheima;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/03/22 17:54
 * @Description
 */
public class ApplicationContextTest06 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext06.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        //userService.show1();
        //userService.show1("tom");
        userService.show1();
        userService.show2();
    }
}
