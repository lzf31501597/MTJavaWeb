package com.itheima.processor;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author
 * @version 1.0
 * @date 2024/02/22 17:00
 * @Description
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof UserDaoImpl) {
            UserDaoImpl userDao = (UserDaoImpl) bean;
            userDao.setUserName("haohao");
        }

        System.out.println(beanName + ": postProcessBeforeInitialization(Object bean, String beanName)");
        return bean;//BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + ": postProcessAfterInitialization(Object bean, String beanName)");
        return bean;//BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
