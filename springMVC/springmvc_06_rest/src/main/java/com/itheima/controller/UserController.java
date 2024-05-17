package com.itheima.controller;

import com.itheima.domain.Address;
import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
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

    //响应跳转页面
    @RequestMapping(   "/toJumpPage")
    public String toJumpPage(){
        System.out.println("跳转页面 toJumpPage ");
        return "page.jsp";
    }

    //响应文本数据
    @RequestMapping(   "/toText")
    @ResponseBody
    public String toText(){
        System.out.println("返回纯文本数据" );
        return "response text";
    }

    //响应POJO对象
    @RequestMapping(   "/toJsonPOJO")
    @ResponseBody
    public User toJsonPOJO(){
        System.out.println("返回json对象数据" );
        User user = new User();
        user.setName("itcast");
        user.setAge(30);
        Address addr = new Address();
        addr.setProvince("peiking");
        addr.setCity("peikin");
        user.setAddress(addr);
        return user;
    }

    //响应POJO集合对象
    @RequestMapping(   "/toJsonPOJOList")
    @ResponseBody
    public List<User> toJsonPOJOList(){
        System.out.println("返回json集合数据" );
        User user = new User();
        user.setName("itcast");
        user.setAge(30);

        User user1 = new User();
        user1.setName("itcast");
        user1.setAge(30);

        Address addr = new Address();
        addr.setProvince("peiking");
        addr.setCity("peikin");
        user.setAddress(addr);
        user1.setAddress(addr);

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user);
        return list;
    }
}
