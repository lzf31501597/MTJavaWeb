package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.QuickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author
 * @version 1.0
 * @date 2024/04/16 16:26
 * @Description
 */
//@Component
@Controller
public class ResponseController1 {
    //直接注入Service 使用
    @Autowired
    private QuickService quickService;

    //@RequestMapping(value = {"/show","/showxxx","/showyyy"},method = RequestMethod.GET)
    //@RequestMapping(value={"/show","/showxxx","/showyyy"})
    //@RequestMapping(path={"/show","/showxxx","/showyyy"})

    @GetMapping("/res1") //http://localhost:8080/quick/show
    public String res1(){//重定向方式
        System.out.println("res1 running........." + quickService);
        return "forward:/index.jsp";
    }

    @RequestMapping("/res2")
    public String res2(){//转发方式
        System.out.println("res222222 running........." + quickService);
        return "redirect:/index2.jsp";
    }

    @RequestMapping("/res3")
    public ModelAndView res3(ModelAndView modelAndView){//带数据转发方式，
        //ModelAndView封装模型数据和视图名
        //设置数据模型
        User user = new User();
        user.setUsername("haohao");
        user.setAge(19);
        modelAndView.addObject("user", user);
        //设置视图名称，在页面中展示模型数据
        modelAndView.setViewName("/index3.jsp");
        return modelAndView;
    }

    @RequestMapping("/res4")
    @ResponseBody //告诉SpringMVC返回的字符串不是视图名，是以响应体方式响应的数据
    public String res4(){//直接回写字符串

        return "hello haohao";
    }
}
