package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author
 * @version 1.0
 * @date 2024/04/26 14:49
 * @Description
 */
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
   //代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    @Override
    public boolean isSingleton() { //默认true为单例。false为非单例
        return false;
    }
}
