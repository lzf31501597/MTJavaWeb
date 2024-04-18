package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author
 * @version 1.0
 * @date 2024/02/16 10:39
 * @Description
 */
public class UserServiceImpl03 implements UserService {

    private UserDao userDao;
    /*private List<String> stringList;
    private List<UserDao> userDaoList;
    private Set<String> stringSet;
    private Set<UserDao> userDaoSet;
    private Map<String, UserDao> map;
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setMap(Map<String, UserDao> map) {
        this.map = map;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public void setUserDaoSet(Set<UserDao> userDaoSet) {
        this.userDaoSet = userDaoSet;
    }

    public void setUserDaoList(List<UserDao> userDaoList) {
        this.userDaoList = userDaoList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }*/

    //BeanFactory去调用该方法， 从容器中获得userDao设置到此处
    public void setUserDao(UserDao userDao){
        //System.out.println("BeanFactory去调用该方法， 从容器中获得userDao设置到此处" + userDao);
        this.userDao=userDao;
    }
    public void show(){
        System.out.println(userDao);
    }



}
