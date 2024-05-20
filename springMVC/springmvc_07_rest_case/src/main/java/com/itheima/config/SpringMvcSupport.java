package com.itheima.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author
 * @version 1.0
 * @date 2024/05/20 10:48
 * @Description
 */
@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    //当访问/pages/？？？？时候，就访问/pages/目录下的内容
    ///pages/????にアクセスすると、/pages/ディレクトリの内容にアクセスします
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
    }
}
