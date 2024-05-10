package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:32
 * @Description ${Description}
 */

public class AppForAnnotation {
    public static void main(String[] args) {
        ApplicationContext acac = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao1 = (BookDao) acac.getBean(BookDao.class);
        System.out.println(bookDao1);

        BookService bookService = acac.getBean(BookService.class);
        System.out.println(bookService);
    }
}