package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.factory.UserDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:52
 * @Description
 */
public class AppForInsataceUser {
    public static void main(String[] args) {
        //创建实例工厂对象
        /*UserDaoFactory userDaoFactory = new UserDaoFactory();
        UserDao userDao = userDaoFactory.getUserDao();
        userDao.save();*/

        //3.获取Ioc容器,（加载配置文件得到上下文对象）
        ApplicationContext cpxa = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取bean
        UserDao userDao = (UserDao) cpxa.getBean("userDao");
        userDao.save();
        UserDao userDao1 = (UserDao) cpxa.getBean("userDao");
        userDao1.save();
        System.out.println(userDao);
        System.out.println(userDao1);

        /*BookService bookService = (BookService) cpxa.getBean("bookService");
        bookService.save();*/
    }
}
