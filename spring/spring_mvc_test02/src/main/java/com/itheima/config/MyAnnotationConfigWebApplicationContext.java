package com.itheima.config;

import com.itheima.config.SpringMVCConfig;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/04/19 16:31
 * @Description
 */
public class MyAnnotationConfigWebApplicationContext extends AnnotationConfigWebApplicationContext {
    public MyAnnotationConfigWebApplicationContext() {
        //注册核心配置类
        super.register(SpringMVCConfig.class);
    }
}
