package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @author
 * @version 1.0
 * @date 2024/05/09 16:38
 * @Description
 */

@Configuration //相当于xml配置文件--没有配置的
//@ComponentScan("com.itheima.config")
@ComponentScan("com.itheima.dao")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,})
public class SpringConfig {



}
