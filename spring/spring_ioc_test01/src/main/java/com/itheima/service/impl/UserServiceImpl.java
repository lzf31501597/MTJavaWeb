package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/02/16 10:39
 * @Description
 */
public class UserServiceImpl implements UserService, InitializingBean {

    /*public UserServiceImpl() {
        System.out.println("UserServiceImpl()实例化。。。");
    }*/
    public UserServiceImpl(String name,int age) {
        System.out.println("UserServiceImpl(String name)实例化。。。");
    }

    private UserDao userDao;

    //BeanFactory去调用该方法， 从容器中获得userDao设置到此处
    public void setUserDao(UserDao userDao){
        System.out.println("BeanFactory去调用该方法， 从容器中获得userDao设置到此处" + userDao);
        this.userDao=userDao;
    }

    private void destroy() {
        System.out.println("销毁方法。。。");
    }

    private void init() {
        System.out.println("初始化方法。。。");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet()方法。。。");
    }

    @Override
    public void show() {

    }
}
