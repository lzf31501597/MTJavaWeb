package com.itheima.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author
 * @version 1.0
 * @date 2024/04/15 10:06
 * @Description
 */
public class ContextLoaderListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        System.out.println("ContextLoaderListener init........");

        ServletContext servletContext = sce.getServletContext();
        //0.获取 contextConfigLocation 配置文件的名称
        String contextConfigLocation = servletContext.getInitParameter("CONTEXT_CONFIG_LOCATION");

        //解析出配置文件名称
        contextConfigLocation = contextConfigLocation.substring("classpath:".length());

        //1.create Spring container
        //ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext01.xml");
        ApplicationContext app = new ClassPathXmlApplicationContext(contextConfigLocation);

        //2.将容器存储到ServletContext域中
        servletContext.setAttribute("applicationContext", app);
    }


}
