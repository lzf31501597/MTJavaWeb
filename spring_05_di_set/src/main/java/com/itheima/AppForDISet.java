package com.itheima;

import com.itheima.dao.BookDao;

import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:32
 * @Description ${Description}
 */

public class AppForDISet {
    public static void main(String[] args) {
        ApplicationContext cpxa = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) cpxa.getBean("bookService");
        bookService.save();
    }
}