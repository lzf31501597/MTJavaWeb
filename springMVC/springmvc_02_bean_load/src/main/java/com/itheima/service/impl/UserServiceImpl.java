package com.itheima.service.impl;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author
 * @version 1.0
 * @date 2024/05/15 17:26
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void save(User user) {
        System.out.println("user service......");
    }
}
