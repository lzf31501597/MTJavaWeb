package com.itheima.mapper;


import com.itheima.pojo.User;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/02/29 14:23
 * @Description
 */
public interface UserMapper{

    List<User> findAll();
}
