package com.itheima.controller;

import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

/**
 * @author
 * @version 1.0
 * @date 2024/05/15 14:14
 * @Description
 */

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/books2")
public class BookController2 {

    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    //@ResponseBody
    public String save(@RequestBody Book book){
        System.out.println("book save..." + book);
        return "{'module':'book save '}";
    }
    @DeleteMapping(value = "/{id}")
    //@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    //@ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("book delete id ==>" + id);
        return "{'module':'book delete '}";
    }

    @PutMapping
    //@RequestMapping(method = RequestMethod.PUT)
    //@ResponseBody
    public String update(@RequestBody Book book){
        System.out.println("book update  ==>" + book);
        return "{'module':'book update '}";
    }

    @GetMapping(value = "/{id}")
    //@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    //@ResponseBody
    public String getById(@PathVariable Integer id){
        System.out.println("book getById id :" + id);
        return "{'module':'book getById'}";
    }

    @GetMapping
    //@RequestMapping(method = RequestMethod.GET)
    //@ResponseBody
    public String getALL(){
        System.out.println("book getALL");
        return "{'module':'book getALL'}";
    }

}
