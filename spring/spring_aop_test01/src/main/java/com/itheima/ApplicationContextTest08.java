package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/03/22 17:54
 * @Description
 */
public class ApplicationContextTest08 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext08.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        userService.show2();

        /*ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService bean = annotationConfigApplicationContext.getBean(UserService.class);
        bean.show2();*/
    }
}
