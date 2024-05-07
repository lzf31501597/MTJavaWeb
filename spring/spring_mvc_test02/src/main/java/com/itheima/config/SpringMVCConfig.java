package com.itheima.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

/**
 * @author
 * @version 1.0
 * @date 2024/04/19 15:55
 * @Description
 */

@Configuration
@ComponentScan({"com.itheima.controller", "com.itheima.ex"})
@EnableWebMvc
public class SpringMVCConfig {

    /*@Bean  //简单的异常处理器
    public SimpleMappingExceptionResolver simpleMappingExceptionResolver(){
        SimpleMappingExceptionResolver simpleMappingExceptionResolver = new SimpleMappingExceptionResolver();
        //不管是什么异常，统一的响应一个友好的页面
        simpleMappingExceptionResolver.setDefaultErrorView("/error1.html");
        //区分异常的类型，更具不同异常类型，可以跳转不同的视图
        //键值对，key：异常对象全限定名，value：跳转页面
        Properties properties = new Properties();
        properties.setProperty("java.lang.RuntimeException", "/error1.html");
        properties.setProperty("java.io.FileNotFoundException", "/error2.html");
        simpleMappingExceptionResolver.setExceptionMappings(properties);
        return simpleMappingExceptionResolver;
    }*/

    @Bean
    public CommonsMultipartResolver multipartResolver(){
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        commonsMultipartResolver.setDefaultEncoding("UTF=8");
        commonsMultipartResolver.setMaxInMemorySize(5000000);
        commonsMultipartResolver.setMaxUploadSize(5000000);
        commonsMultipartResolver.setMaxUploadSizePerFile(5000000);
        return commonsMultipartResolver;
    }
}
