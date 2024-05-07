package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * @author
 * @version 1.0
 * @date 2024/02/16 11:48
 * @Description
 */

@Repository("userDao01")
@Primary

public class UserDaoImpl01 implements UserDao {

    @Override
    public void show() {

    }

}
