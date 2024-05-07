package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/02/16 10:39
 * @Description
 */
//@Component("userService")
//@Controller("userService")
//@Service("userService01")
public class UserServiceImpl01 implements UserService {
    //@Autowired //根据类型进行注入,如果同一类型的Bean有多个，尝试根据名字进行二次匹配，匹配不成功就报错
    //@Qualifier("userDao01") //在此，结合@Autowired一起使用，作用是根据名称注入相应的Bean
    //@Resource(name="userDao01") //不指定名称参数时，根据类型注入，指定名称根据名称注入
    //private UserDao userDao;

    /*@Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao2 = userDao;
    }*/

    @Override
    public void show() {
        //System.out.println(userDao);

    }

    @Autowired
    public void xxx(UserDao userDao){
        //System.out.println("xxx():" + userDao);
    }

    @Autowired
    public void yyy(List<UserDao> userDaoList){
        //System.out.println("yyy():" + userDaoList);
    }

}
