package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author
 * @version 1.0
 * @date 2024/05/15 15:15
 * @Description
 */

@Controller
public class UserController {

    @RequestMapping(   "/save")
    @ResponseBody
    public String save(){
        System.out.println("user save()....");
        return "{'module':'springmvc save'}";
    }

    @RequestMapping(   "/delete")
    @ResponseBody
    public String delete(){
        System.out.println("user delete()....");
        return "{'module':'springmvc delete'}";
    }
}
