package com.itheima.factory;

import com.itheima.dao.OrderDao;
import com.itheima.dao.UserDao;
import com.itheima.dao.impl.OrderDaoImpl;
import com.itheima.dao.impl.UserDaoImpl;

/**
 * @author
 * @version 1.0
 * @date 2024/04/26 14:49
 * @Description
 */
public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }

}
