package com.itheima.web;

import com.itheima.config.SpringConfig;
import com.itheima.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author
 * @version 1.0
 * @date 2024/04/12 18:23
 * @Description
 */

@WebServlet(urlPatterns = "/accountServlet")
public class AccountServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Web层调用service层，获得AccountService，accountService存储在applicationContext中
        //ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext01.xml");
        AccountService accountService = app.getBean(AccountService.class);
        accountService.transferMoney("lucy", "tom", 500);
    }


}
