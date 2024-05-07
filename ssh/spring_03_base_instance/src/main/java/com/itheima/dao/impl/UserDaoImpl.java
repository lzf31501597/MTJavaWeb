package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:41
 * @Description
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("User dao save()");
    }
}
