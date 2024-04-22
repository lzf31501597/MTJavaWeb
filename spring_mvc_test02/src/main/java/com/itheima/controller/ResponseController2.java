package com.itheima.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.pojo.User;
import com.itheima.service.QuickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author
 * @version 1.0
 * @date 2024/04/16 16:26
 * @Description
 */

//@Controller
//@ResponseBody
@RestController
public class ResponseController2 {
    //直接注入Service 使用
    @Autowired
    private QuickService quickService;

    @GetMapping("/ajax/req3") //http://localhost:8080/ajax/req3
    //@ResponseBody
    public User req3() throws JsonProcessingException {//重定向方式
        System.out.println("res1 running........." + quickService);
        User user = new User();
        user.setUsername("haohao");
        user.setAge(19);
        return user;
    }

    @GetMapping("/ajax/req2") //http://localhost:8080/ajax/req2
    //@ResponseBody
    public String req2() throws JsonProcessingException {//重定向方式
        System.out.println("res1 running........." + quickService);
        User user = new User();
        user.setUsername("haohao");
        user.setAge(19);
        //json转换工具
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(user);
        return s;
    }

    @GetMapping("/ajax/req1") //http://localhost:8080/ajax/req1
    //@ResponseBody
    public String req1(){//重定向方式
        System.out.println("res1 running........." + quickService);
        return "{\"username\":\"haohao\", \"age\":18}";
    }



}
