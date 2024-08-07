package com.itheima.controller.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author
 * @version 1.0
 * @date 2024/05/21 18:01
 * @Description
 */
@Component
public class ProjectInterceptor2 implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*Enumeration<String> headers = request.getHeaderNames();
        while(headers.hasMoreElements()){
            String s = headers.nextElement();
            System.out.println(s + " : " + request.getHeader(s));
        }
        System.out.println(handler.getClass());
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        String name = handlerMethod.getMethod().getName();
        System.out.println(name);*/

        System.out.println("++++++++++++++++++++++reHandle()2222222");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //System.out.println(modelAndView.getViewName());
        System.out.println("postHandle()2222222");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //System.out.println(ex.getMessage());
        System.out.println("afterCompletion()2222222");
    }
}
