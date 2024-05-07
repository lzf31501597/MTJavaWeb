package com.itheima;

import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:52
 * @Description
 */
public class AppForName {
    public static void main(String[] args) {
        //3.获取Ioc容器,（加载配置文件得到上下文对象）
        ApplicationContext cpxa = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取bean
        /*BookDao bookDao = (BookDao) cpxa.getBean("bookDao");
        bookDao.save();*/

        BookService bookService = (BookService) cpxa.getBean("bookService");
        bookService.save();
    }
}
