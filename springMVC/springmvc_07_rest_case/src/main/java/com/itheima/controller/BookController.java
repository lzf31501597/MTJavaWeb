package com.itheima.controller;


import com.itheima.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/05/15 14:14
 * @Description
 */


@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save..." + book);
        return "{'module':'book save success'}";
    }

    @GetMapping
    public List<Book> getALL(){
        List<Book> bookList = new ArrayList<>();

        Book book = new Book();
        book.setType("计算机");
        book.setName("springMvc入门教程");
        book.setDescription("小试牛刀");
        bookList.add(book);

        Book book1 = new Book();
        book1.setType("计算机");
        book1.setName("springMvc实战教程");
        book1.setDescription("一代宗师");
        bookList.add(book1);


        return bookList;
    }

}
