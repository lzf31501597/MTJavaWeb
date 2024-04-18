package com.itheima.beans;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author
 * @version 1.0
 * @date 2024/03/14 16:07
 * @Description
 */

//@Component
public class OtherBean {

    //@Bean("dataSource")
    public DataSource dataSource(@Value("${jdbc.driver}") String driverClassName, //@Autowired UserDao userDao,
                                 @Qualifier("userDao") UserDao userDao, UserService userService,
                                 @Value("${jdbc.url}") String url,
                                 @Value("${jdbc.username}") String userName, @Value("${jdbc.password}") String password){

        /*System.out.println(driverClassName);
        System.out.println(url);
        System.out.println(userName);
        System.out.println(password);
        System.out.println(userDao);
        System.out.println(userService);*/

        DruidDataSource dataSource = new DruidDataSource();
        //设置4个基本参数
        dataSource.setDriverClassName(driverClassName);
        /*dataSource.setUrl(url);
        dataSource.setPassword(password);
        dataSource.setUsername(userName);*/
        return dataSource;

    }
}
