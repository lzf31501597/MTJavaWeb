package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/06/25 14:58
 * @description
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${country}")
    private String country1;

    @Value("${user1.name}")
    private String name1;

    @Value("${likes[1]}")
    private String like1;

    @Value("${likes2[2]}")
    private String like2;

    /* @Value("${users3[0].name}")
    private String users3; */

    @Value("${users2[0].name}")
    private String users2;

    @Value("${baseDir}")
    private String baseDir;
    @Value("${tempDir}")
    private String tempDir;
    @Value("${tempDir2}")
    private String tempDir2;

    @GetMapping
    public String getById(){
        System.out.println("springboot is running......4");
        System.out.println("country1--->" + country1);
        System.out.println("name1--->" + name1);
        System.out.println("like1--->" + like1);
        System.out.println("like2--->" + like2);
        //System.out.println("users3--->" + users3);
        System.out.println("users2--->" + users2);

        System.out.println("baseDir--->" + baseDir);
        System.out.println("tempDir--->" + tempDir);
        System.out.println("tempDir2--->" + tempDir2);
        return "springboot is running.....4";
    }
}
