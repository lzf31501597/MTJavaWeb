package com.itheima.controller;

import com.itheima.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @version 1.0
 * @date 2024/05/27 13:47
 * @Description
 */

@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${lesson}")
    private String lesson;
    @Value("${server.port}")
    private Integer port;
    @Value("${enterprise.subject[2]}")
    private String subject03;

    @Autowired
    private Environment environment;

    @Autowired
    private Enterprise enterprise;



    @GetMapping("/{id}")
    public String getByid(@PathVariable Integer id){

        System.out.println("------------------");
        System.out.println(lesson + " ,id = " + id);
        System.out.println(port + " ,id = " + id);
        System.out.println(subject03 + " ,id = " + id);

        System.out.println("------------------");
        System.out.println(environment.getProperty("lesson"));
        System.out.println(environment.getProperty("server.port"));
        System.out.println(environment.getProperty("enterprise.name"));
        System.out.println(environment.getProperty("enterprise.subject[2]"));

        System.out.println("------------------");
        System.out.println(enterprise);

        return "hello, srping boot !!!";
    }
}
