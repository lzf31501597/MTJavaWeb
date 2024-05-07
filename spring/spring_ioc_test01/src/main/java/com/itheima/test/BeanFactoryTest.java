package com.itheima.test;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author
 * @version 1.0
 * @date 2024/02/16 11:28
 * @Description
 */
public class BeanFactoryTest {
    public static void main(String[] args) {
        // create BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // create xml reader
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        // load beans.xml
        reader.loadBeanDefinitions("beans.xml");

        //get Bean instance userService
        UserService userService = (UserService) beanFactory.getBean("userService");
        //System.out.println(userService);

        //get Bean instance userDao
        //UserDao userDao = (UserDao) defaultListableBeanFactory.getBean("userDao");
        //System.out.println(userDao);
    }
}
