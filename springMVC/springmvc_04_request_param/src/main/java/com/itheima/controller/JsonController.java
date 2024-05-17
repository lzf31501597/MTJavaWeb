package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/05/15 15:15
 * @Description
 */

@Controller
public class JsonController {

    //list集合参数传递：json格式
    @RequestMapping(   "/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> hobby){
        System.out.println("user list集合参数传递 listParamForJson list: " + hobby);
        return "{'module':'springmvc listParamForJson'}";
    }

    //POJO参数传递：json格式
    @RequestMapping(   "/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){
        System.out.println("user pojoParamForJson() POJO参数传递 user: " + user);
        System.out.println("user pojoParamForJson() POJO参数传递 name: " + user.getName());
        System.out.println("user pojoParamForJson() POJO参数传递 age: " + user.getAge());
        System.out.println("user pojoParamForJson() POJO参数传递 addr: " + user.getAddress());
        return "{'module':'springmvc pojoParamForJson'}";
    }

    //POJO集合参数传递:：json格式
    @RequestMapping(   "/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> user){
        System.out.println("user listPojoParamForJson() 嵌套POJO参数传递 user: " + user);/*
        System.out.println("user listPojoParamForJson() 嵌套POJO参数传递 name: " + user.getName());
        System.out.println("user listPojoParamForJson() 嵌套POJO参数传递 age: " + user.getAge());
        System.out.println("user listPojoParamForJson() 嵌套POJO参数传递 addr: " + user.getAddress());*/
        return "{'module':'springmvc listPojoParamForJson'}";
    }




}
