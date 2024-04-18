package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author
 * @version 1.0
 * @date 2024/02/16 11:48
 * @Description
 */

//<bean id="userDao" class="com.itheima.dao.impl.UserDaoImpl"></bean>
//@Component("userDao")
@Repository("userDao")
@Profile("test")
@Scope("singleton")
@Lazy(false)

public class UserDaoImpl implements UserDao {

    //@Value("zhangsan")
    @Value("${jdbc.driver}")
    private String username;

    //@Value("lisi")
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void show() {
        System.out.println(username);
    }
    /*public UserDaoImpl() {
        System.out.println("userDao create");
    }

    @PostConstrut
    public void init() {
        System.out.println("userDao 初始化方法。。。");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("userDao 销毁方法。。。");
    }*/


}
