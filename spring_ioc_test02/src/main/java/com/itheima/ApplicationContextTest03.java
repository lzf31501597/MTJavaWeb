package com.itheima;

import com.itheima.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/02/16 16:53
 * @Description
 */
public class ApplicationContextTest03 {
    public static void main(String[] args) {
        //xml方式的Spring容器
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext01.xml");
        //注解的方式去加载Spring的核心配置类
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Object userDao = applicationContext.getBean("userDao");
        System.out.println(userDao);
        Object dataSource = applicationContext.getBean("dataSource");
        System.out.println(dataSource);


    }



}
