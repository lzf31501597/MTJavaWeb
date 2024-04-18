package com.itheima;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/02/16 16:53
 * @Description
 */
public class ApplicationContextTest01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext01.xml");
        /*UserDao bean = applicationContext.getBean(UserDao.class);
        bean.show();*/
        UserService bean1 = (UserService) applicationContext.getBean("userService");
        bean1.show();
    }



}
