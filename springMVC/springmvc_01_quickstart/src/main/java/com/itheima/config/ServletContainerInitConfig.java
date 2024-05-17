package com.itheima.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @author
 * @version 1.0
 * @date 2024/05/15 15:22
 * @Description
 */

//定义servlet容器启动的配置类，在里面加载spring的配置
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
        return new String[]{"/"};
    }
    //加载spring容器
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
