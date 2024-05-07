package com.itheima;

import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/02/16 16:53
 * @Description
 */
public class ApplicationContextTest04 {
    public static void main(String[] args) {

        //System.setProperty("spring.profiles.active", "test");

        //xml方式的Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext01.xml");
        //注解的方式去加载Spring的核心配置类
        //ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.show();

        /*Object userDao = applicationContext.getBean("userDao");
        System.out.println(userDao);*/

        /*OtherBean02 bean = applicationContext.getBean(OtherBean02.class);
        System.out.println(bean);*/


    }



}
