package com.itheima.controller;

import org.springframework.web.bind.annotation.*;


/**
 * @author
 * @version 1.0
 * @date 2024/06/27 18:01
 * @description
 */
@RestController
@RequestMapping("/books")
public class BookController2 {

    @GetMapping("{id}")
    public String getById(){
        System.out.println("Springboot is running...");
        return "Springboot is running...";
    }




}
