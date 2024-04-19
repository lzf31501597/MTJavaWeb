package com.itheima.config;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/04/16 15:19
 * @Description
 */
public class MyAnnotationConfigWebApplicationContext extends AnnotationConfigWebApplicationContext {
    public MyAnnotationConfigWebApplicationContext() {
        super();
        this.register(SpringConfig.class);
    }
}
