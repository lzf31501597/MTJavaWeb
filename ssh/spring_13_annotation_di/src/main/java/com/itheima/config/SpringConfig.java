package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author
 * @version 1.0
 * @date 2024/05/09 16:38
 * @Description
 */

@Configuration //相当于xml配置文件--没有配置的
@ComponentScan("com.itheima")
//@ComponentScan({"com.itheima.service","com.itheima.dao"})
@PropertySource("classpath:jdbc.properties")
//@PropertySource("jdbc.properties")
//@PropertySource({"jdbc.properties", "jdbc.properties", "jdbc.properties"})
public class SpringConfig {
}
