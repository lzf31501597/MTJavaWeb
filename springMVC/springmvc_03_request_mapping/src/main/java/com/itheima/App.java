package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/05/15 17:47
 * @Description
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        //UserController userController = ac.getBean(UserController.class);
        System.out.println(ac.getBean(UserController.class));

    }
}
