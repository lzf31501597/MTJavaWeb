package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author
 * @version 1.0
 * @date 2024/05/10 14:08
 * @Description
 */

//@Configuration
public class JdbcConfig {

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    //1.定义一个方法获得要管理的额对象
    //2.添加@Bean，表示当前方法返回值是一个Bean
    @Bean
    public DataSource dataSource(BookDao bookDao){
        System.out.println(bookDao);
        DruidDataSource druidDataSource = new DruidDataSource();
        /*druidDataSource.setDriverClassName("${jdbc.driver}");
        druidDataSource.setUrl("${jdbc.url}");
        druidDataSource.setUsername("${jdbc.username}");
        druidDataSource.setPassword("${jdbc.password}");*/
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }
}
