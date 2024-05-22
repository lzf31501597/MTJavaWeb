package com.itheima.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @author
 * @version 1.0
 * @date 2024/05/15 15:22
 * @Description
 */

//定义servlet容器启动的配置类，在里面加载spring的配置
public class ServletContainerInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{//SpringConfig.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    //乱码处理
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        return new Filter[]{characterEncodingFilter};
    }
}

/*//定义servlet容器启动的配置类，在里面加载spring的配置
public class ServletContainerInitConfig extends AbstractDispatcherServletInitializer {

    //加载springmvc容器配置
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext acwc = new AnnotationConfigWebApplicationContext();
        acwc.register(SpringMvcConfig.class);
        return acwc;
    }
    //设置哪些请求归属springmvc处理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/  "};
    }
    //加载spring容器
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext acwc = new AnnotationConfigWebApplicationContext();
        acwc.register(SpringConfig.class);
        return acwc;
    }
}*/