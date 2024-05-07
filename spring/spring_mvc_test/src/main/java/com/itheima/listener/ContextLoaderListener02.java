package com.itheima.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author
 * @version 1.0
 * @date 2024/04/15 10:06
 * @Description
 */
public class ContextLoaderListener02 implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {

        System.out.println("ContextLoaderListener init........");
        //1.create Spring container
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext01.xml");
        //2.将容器存储到ServletContext域中
        sce.getServletContext().setAttribute("applicationContext", app);
    }


}
