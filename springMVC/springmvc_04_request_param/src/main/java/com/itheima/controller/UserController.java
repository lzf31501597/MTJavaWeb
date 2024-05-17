package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
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
public class UserController {
    //普通参数传递
    @RequestMapping(   "/commonParam")
    @ResponseBody
    public String commonParam(String name, int age, String addr){
        System.out.println("user commonParam() 普通参数传递 name: " + name);
        System.out.println("user commonParam() 普通参数传递 age: " + age);
        System.out.println("user commonParam() 普通参数传递 addr: " + addr);
        return "{'module':'springmvc commonParam'}";
    }

    //参数传递：请求参数名与形参名不同
    @RequestMapping(   "/commonParamDifferentName")
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String username, @RequestParam("age") int age, @RequestParam("addr") String addr){
        System.out.println("user commonParam() 普通参数传递 name: " + username);
        System.out.println("user commonParam() 普通参数传递 age: " + age);
        System.out.println("user commonParam() 普通参数传递 addr: " + addr);
        return "{'module':'springmvc commonParamDifferentName'}";
    }

    //POJO参数传递
    @RequestMapping(   "/pojoParam")
    @ResponseBody
    public String pojoParam(User user){
        System.out.println("user commonParam() POJO参数传递 user: " + user);
        System.out.println("user commonParam() POJO参数传递 name: " + user.getName());
        System.out.println("user commonParam() POJO参数传递 age: " + user.getAge());
        System.out.println("user commonParam() POJO参数传递 addr: " + user.getAddress());
        return "{'module':'springmvc pojoParam'}";
    }

    //嵌套POJO参数传递
    @RequestMapping(   "/pojoContainPojoParam")
    @ResponseBody
    public String pojoContainPojoParam(User user){
        System.out.println("user commonParam() 嵌套POJO参数传递 user: " + user);
        System.out.println("user commonParam() 嵌套POJO参数传递 name: " + user.getName());
        System.out.println("user commonParam() 嵌套POJO参数传递 age: " + user.getAge());
        System.out.println("user commonParam() 嵌套POJO参数传递 addr: " + user.getAddress());
        return "{'module':'springmvc pojoContainPojoParam'}";
    }

    //array数组参数传递hobby
    @RequestMapping(   "/arrayParam")
    @ResponseBody
    public String arrayParam(String[] hobby){
        System.out.println("user array数组参数传递() arrayParam name: " + Arrays.toString(hobby));
        return "{'module':'springmvc array数组参数传递 arrayParam'}";
    }
    //list集合参数传递
    @RequestMapping(   "/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> hobby){
        System.out.println("user list集合参数传递 listParam name: " + hobby);
        return "{'module':'springmvc listParam'}";
    }

}
