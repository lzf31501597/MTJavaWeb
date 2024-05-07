package com.itheima.controller;

import com.itheima.service.QuickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author
 * @version 1.0
 * @date 2024/04/16 16:26
 * @Description
 */
//@Component
@Controller
@RequestMapping("/quick")
public class QuickController {
    //直接注入Service 使用
    @Autowired
    private QuickService quickService;

    //@RequestMapping(value = {"/show","/showxxx","/showyyy"},method = RequestMethod.GET)
    //@RequestMapping(value={"/show","/showxxx","/showyyy"})
    //@RequestMapping(path={"/show","/showxxx","/showyyy"})

    @GetMapping("/show") //http://localhost:8080/quick/show
    //@PostMapping("/show")
    //@PutMapping
    //@DeleteMapping
    public String show(){
        System.out.println("show running........." + quickService);
        return "forward:/index.jsp";
    }

    @RequestMapping("/show2")
    public String show2(){
        System.out.println("show2222 running........." + quickService);
        return "redirect:/index2.jsp";
    }
}
