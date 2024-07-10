package com.itheima;

import com.itheima.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot0104QuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot0104QuickstartApplication.class, args);
        /* ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot0104QuickstartApplication.class, args);
        BookController bean = applicationContext.getBean(BookController.class);
        System.out.println("bean=" + bean); */
    }

}
