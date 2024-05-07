package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author
 * @version 1.0
 * @date 2024/04/24 17:22
 * @Description
 */

@RestController
public class ExceptionController {

    @RequestMapping("/ex1")
    public String exceptionMethod(){
        int i = 1/0;
        return "Hello Exception";
    }

    @RequestMapping("/ex2")
    public String exceptionMethod2() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("/xxx/xxx/xxx");
        return "Hello Exception222";
    }
}
