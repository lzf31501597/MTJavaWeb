package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/05/10 18:18
 * @Description
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ac= new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ac.getBean(BookDao.class);
        int b = bookDao.select();
        System.out.println(b);
        /*System.out.println(bookDao);
        System.out.println(bookDao.getClass());*/
    }
}
