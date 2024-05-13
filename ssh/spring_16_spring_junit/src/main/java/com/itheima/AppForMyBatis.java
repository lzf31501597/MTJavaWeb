package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author
 * @version 1.0
 * @date 2024/05/10 16:58
 * @Description
 */
public class AppForMyBatis {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = applicationContext.getBean(AccountService.class);
        Account account = accountService.findById(2);
        System.out.println(account);
    }
}
