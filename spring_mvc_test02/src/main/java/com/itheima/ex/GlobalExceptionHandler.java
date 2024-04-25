package com.itheima.ex;

import com.itheima.pojo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * @author
 * @version 1.0
 * @date 2024/04/24 17:54
 * @Description
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public ModelAndView runtimeExceptionResolverMethod(RuntimeException exception){
        System.out.println(exception);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/error1.html");
        return modelAndView;
    }
    @ExceptionHandler(IOException.class)
    @ResponseBody
    public Result ioExceptionResolverMethod(IOException exception){
        System.out.println(exception);
        //ModelAndView modelAndView = new ModelAndView();
        //modelAndView.setViewName("/error2.html");
        //return modelAndView;
        Result result = new Result(0,"33333","33333");
        return result;
    }

}
