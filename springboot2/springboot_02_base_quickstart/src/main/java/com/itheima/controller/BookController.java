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


    @GetMapping
    public String getById(){
        System.out.println("springboot is running......4");

        return "springboot is running.....4";
    }
}
