package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author
 * @version 1.0
 * @date 2024/05/15 14:14
 * @Description
 */

@Controller
public class UserController {

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("User save...");
        return "{'module':'User save '}";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("User delete id ==>" + id);
        return "{'module':'User delete '}";
    }

    @RequestMapping(value ="/users", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user){
        System.out.println("User update  ==>" + user);
        return "{'module':'User update '}";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Integer id){
        System.out.println("User getById id :" + id);
        return "{'module':'User getById'}";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public String getALL(){
        System.out.println("User getALL");
        return "{'module':'User getALL'}";
    }

}
