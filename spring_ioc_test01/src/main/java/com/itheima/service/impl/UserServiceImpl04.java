package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * @author
 * @version 1.0
 * @date 2024/02/16 10:39
 * @Description
 */
public class UserServiceImpl04 implements UserService, BeanFactoryAware,
        ServletContextAware, ApplicationContextAware, BeanNameAware {

    private UserDao userDao;

    public UserServiceImpl04() {
        System.out.println("UserServiceImpl04实例化");
    }

    //BeanFactory去调用该方法， 从容器中获得userDao设置到此处
    public void setUserDao(UserDao userDao){
        //System.out.println("BeanFactory去调用该方法， 从容器中获得userDao设置到此处" + userDao);
        this.userDao=userDao;
    }
    public void show(){
        System.out.println(userDao);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        System.out.println(servletContext);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(s);
    }
}
