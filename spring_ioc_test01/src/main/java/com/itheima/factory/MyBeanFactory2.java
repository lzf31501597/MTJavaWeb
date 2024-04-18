package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

/**
 * @author
 * @version 1.0
 * @date 2024/02/19 13:27
 * @Description
 */
public class MyBeanFactory2 {
    public UserDao userDao(){
        return new UserDaoImpl();
    }

    public UserDaoImpl userDao(String username) {
        return new UserDaoImpl();
    }
}
