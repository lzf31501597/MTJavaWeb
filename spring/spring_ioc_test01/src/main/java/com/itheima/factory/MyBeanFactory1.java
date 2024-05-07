package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

/**
 * @author
 * @version 1.0
 * @date 2024/02/19 13:27
 * @Description
 */
public class MyBeanFactory1 {
    public static UserDao userDao(){
        return new UserDaoImpl();
    }

    public static UserDaoImpl userDao(String name, int age) {
        return new UserDaoImpl();
    }
}
