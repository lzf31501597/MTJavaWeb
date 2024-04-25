package com.itheima.ex;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author
 * @version 1.0
 * @date 2024/04/24 17:41
 * @Description
 */
//@Component
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        //1.error1.html
        /*ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/error1.html");
        return modelAndView;*/

        //2,前后端分离，响应json格式的字符串{"code":0,"message":"", "data:""}
        String resultjson = "{\"code\":0,\"message\":\"\", \"data:\"\"}";
        try {
            httpServletResponse.getWriter().write(resultjson);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
