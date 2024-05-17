package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2024/05/15 15:15
 * @Description
 */

@Controller
public class DateController {

    //Date参数传递
    @RequestMapping(   "/dateParam")
    @ResponseBody
    public String dateParam(Date date,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
                            @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date date2){
        System.out.println("user dateParam date: " + date);
        System.out.println("user dateParam date1(yyyy-MM-dd): " + date1);
        System.out.println("user dateParam date2(yyyy/MM/dd HH:mm:ss): " + date2);
        return "{'module':'springmvc dateParam'}";
    }

}
