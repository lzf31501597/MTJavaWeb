package com.itheima;


import com.itheima.config.SpringConfig;

import com.itheima.dao.AccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author
 * @version 1.0
 * @date 2024/04/25 15:32
 * @Description ${Description}
 */

public class App {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountDao accountDao = applicationContext.getBean(AccountDao.class);
        String name = accountDao.findName(100, "itheima");
        System.out.println(name);
    }
}