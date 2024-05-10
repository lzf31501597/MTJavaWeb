package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:52
 * @Description
 */
public class ApplicationContext01 {
    public static void main(String[] args) {
        //1.加载类路径下的配置文件
        ApplicationContext cpxa = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从文件系统下，加载配置文件
        // ApplicationContext cpxa = new FileSystemXmlApplicationContext("./src/main/resources/applicationContext.xml");

        /*DataSource dataSource = (DataSource) cpxa.getBean("dataSource");
        System.out.println(dataSource);*/
        //BookDao bookDao = (BookDao) cpxa.getBean("bookDao");
        //BookDao bookDao = cpxa.getBean("bookDao", BookDao.class);
        /*BookDao bookDao = cpxa.getBean(BookDao.class);
        bookDao.save();*/
    }
}
