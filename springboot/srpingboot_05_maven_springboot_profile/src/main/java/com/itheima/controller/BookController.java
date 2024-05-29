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

    @GetMapping("/{id}")
    public String getByid(@PathVariable Integer id){

        System.out.println("------------------id=" + id);

        return "hello, srping boot !!!";
    }
}
