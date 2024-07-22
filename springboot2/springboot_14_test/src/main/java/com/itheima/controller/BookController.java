package com.itheima.controller;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @version 1.0
 * @date 2024/07/11 17:58
 * @description
 */

@RestController
@RequestMapping("/books")
public class BookController {

    /* @GetMapping
    public String getById(){
        //http://localhost:8080/books
        System.out.println("getById() is running....");
        return "springboot";
    } */

    @GetMapping
    public Book getById(){
        System.out.println("getById() is running....");
        Book book = new Book();
        book.setId(1);
        book.setType("springboot");
        book.setName("springboot");
        book.setType("springboot");
        book.setDescription("springboot");
        return book;
    }
}
