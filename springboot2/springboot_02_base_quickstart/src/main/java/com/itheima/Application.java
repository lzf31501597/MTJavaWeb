package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        /* ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot0104QuickstartApplication.class, args);
        BookController bean = applicationContext.getBean(BookController.class);
        System.out.println("bean=" + bean); */
    }

}
