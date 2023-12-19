package com.itheima.servlet.demo.request_;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Request对象获取客户机的信息
 */
public class RequestSend extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取请求方式
		System.out.println("请求方式:" + request.getMethod());
		// 获取客户端的IP地址
		System.out.println("客户端的IP地址:" + request.getRemoteAddr());
		// 获取请求参数的字符串
		System.out.println("请求参数的字符串:" + request.getQueryString());
		// 获取请求路径的URL和URI
		System.out.println("请求路径的URL:" + request.getRequestURL());
		System.out.println("请求路径的URI:" + request.getRequestURI());
		// 获取请求头的信息
		System.out.println("请求方式:" + request.getHeader("User-Agent"));
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
