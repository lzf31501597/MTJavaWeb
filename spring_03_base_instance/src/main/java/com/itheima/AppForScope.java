package com.itheima;

import com.itheima.dao.BookDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:32
 * @Description ${Description}
 */

public class AppForScope {
    public static void main(String[] args) {
        ApplicationContext cpxa = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao1 = (BookDao) cpxa.getBean("bookDao");
        BookDao bookDao2 = (BookDao) cpxa.getBean("bookDao");
        System.out.println(bookDao1);
        System.out.println(bookDao2);
    }
}