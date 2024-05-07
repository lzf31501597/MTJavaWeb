package com.itheima.test;

import com.itheima.beans.OtherBeans;
import com.itheima.beans.XxxxBean;
import com.itheima.dao.PersonDao;
import com.itheima.service.UserService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author
 * @version 1.0
 * @date 2024/02/16 16:53
 * @Descriptio  n
 */
public class ApplicationContextTest09 {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext09.xml");
        Object userDao = applicationContext.getBean("userDao");
        System.out.println(userDao);

        //UserService userService = (UserService) applicationContext.getBean("userService");
        /*Object userService = applicationContext.getBean("userService");
        System.out.println(userService);*/

        /*PersonDao personDao = applicationContext.getBean(PersonDao.class);
        System.out.println(personDao);*/

        /*OtherBeans otherBeans = applicationContext.getBean(OtherBeans.class);
        System.out.println(otherBeans);*/

        /*XxxxBean bean = applicationContext.getBean(XxxxBean.class);
        System.out.println(bean);*/

    }



}
