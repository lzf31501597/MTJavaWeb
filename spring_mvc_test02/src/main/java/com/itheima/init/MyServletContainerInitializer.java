package com.itheima.init;

import com.itheima.controller.QuickController;
import com.itheima.service.QuickService;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * @author
 * @version 1.0
 * @date 2024/04/19 17:58
 * @Description
 */

@HandlesTypes({QuickService.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        System.out.println("MyServletContainerInitializer onStartup()...........");
    }
}
