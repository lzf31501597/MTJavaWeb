package com.itheima.config;

import com.itheima.springmvc.UserController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author
 * @version 1.0
 * @date 2024/05/15 13:11
 * @Description
 */
@Configuration
@ComponentScan("com.itheima.springmvc")
@EnableWebMvc
public class SpringMvcConfig {

}
