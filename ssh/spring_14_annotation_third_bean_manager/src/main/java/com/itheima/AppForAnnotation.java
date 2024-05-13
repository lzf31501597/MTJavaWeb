package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:32
 * @Description ${Description}
 */

public class AppForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = acac.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}