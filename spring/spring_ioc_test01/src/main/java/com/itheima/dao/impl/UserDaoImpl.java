package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author
 * @version 1.0
 * @date 2024/02/16 11:48
 * @Description
 */
public class UserDaoImpl implements UserDao, InitializingBean {

    private String userName;

    public UserDaoImpl() {
        System.out.println("userDao实例化");
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void init(){
        System.out.println("init初始化方法执行。。。");
    }

    public void setUserDao(UserDaoImpl userDao) {

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("属性设置之后执行。。。");
    }

    @Override
    public void show() {

    }
}
