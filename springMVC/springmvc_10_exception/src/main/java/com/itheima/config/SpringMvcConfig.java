package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author
 * @version 1.0
 * @date 2024/05/20 14:06
 * @Description
 */
@Configuration
@ComponentScan({"com.itheima.controller", "com.itheima.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
