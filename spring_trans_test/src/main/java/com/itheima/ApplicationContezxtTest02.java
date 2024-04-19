package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/04/11 11:50
 * @Description
 */
public class ApplicationContezxtTest02 {

    public static void main(String[] args) {
        //ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext01.xml");
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = app.getBean(AccountService.class);
        accountService.transferMoney("lucy", "tom", 500);
    }

}

