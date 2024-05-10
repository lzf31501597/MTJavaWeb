package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import com.itheima.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:32
 * @Description ${Description}
 */

public class App {
    public static void main(String[] args) {
        ApplicationContext cpxa = new ClassPathXmlApplicationContext("applicationContext.xml");
        //BookDao bookDao1 = (BookDao) cpxa.getBean("bookDao");
        BookDao bookDao1 = (BookDao) cpxa.getBean(BookDao.class);
        System.out.println(bookDao1);

        BookService bookService = cpxa.getBean(BookService.class);
        System.out.println(bookService);
    }
}