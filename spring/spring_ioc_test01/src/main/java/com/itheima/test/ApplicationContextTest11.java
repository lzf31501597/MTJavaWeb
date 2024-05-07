package com.itheima.test;

import com.itheima.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author
 * @version 1.0
 * @date 2024/02/16 16:53
 * @Descriptio  n
 */
public class ApplicationContextTest11 {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext11.xml");
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        userDao.show();
        //System.out.println(userDao);

    }



}
