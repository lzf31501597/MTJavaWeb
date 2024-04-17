package com.itheima.service.impl;

import com.itheima.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author
 * @version 1.0
 * @date 2024/03/22 16:24
 * @Description
 */
//@Component
@Service("userService08")
public class UserServiceImpl implements UserService {
    @Override
    public void show1() {
        System.out.println("show1().............");
    }
    public void show1(String name) {
        System.out.println("show1(String name).............");
    }

    @Override
    public void show2() {
        System.out.println("show2().............");
        //int i = 1/0;
    }
    public void show３() {
        System.out.println("show３().............");
    }
}
