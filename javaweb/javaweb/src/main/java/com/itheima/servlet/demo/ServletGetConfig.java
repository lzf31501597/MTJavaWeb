package com.itheima.servlet.demo;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletConfig对象的API演示
 */
public class ServletGetConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.获取初始化参数API
	    //获取Servletconfig对象
		ServletConfig sc = this.getServletConfig();
		String uname = sc.getInitParameter("username");
		String pwd = sc.getInitParameter("password");
		System.out.println(uname +" : " + pwd);
		
		//2.获得所有初始化参数的名称
		Enumeration<String> names = sc.getInitParameterNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			String value = sc.getInitParameter(name);
			System.out.println(name +" : " + value);
		}
		
		//3.获得Servlet的名称
		String servletName = sc.getServletName();
		System.out.println(servletName);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
