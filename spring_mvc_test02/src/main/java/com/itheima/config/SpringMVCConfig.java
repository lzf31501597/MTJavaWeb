package com.itheima.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author
 * @version 1.0
 * @date 2024/04/19 15:55
 * @Description
 */

@Configuration
@ComponentScan("com.itheima.controller")
@EnableWebMvc
public class SpringMVCConfig {

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
