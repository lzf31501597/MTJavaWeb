package com.itheima;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * @author
 * @version 1.0
 * @date 2024/04/15 15:59
 * @Description
 */
public class WebApplicationContextUtils {

    public static ApplicationContext getWebApplicationContextUtils(ServletContext servletContext){
        ApplicationContext applicationContext = (ApplicationContext) servletContext.getAttribute("applicationContext");
        return applicationContext;
    }
}
