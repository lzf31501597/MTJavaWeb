package com.itheima.servlet.demo.servletcontext_;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletContext:对象作用1：获取web项目信息
 */
public class ServletContextGetWeb extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.获取文件的MIME的类型，获取ServletContext
		ServletContext sc = this.getServletContext();
		//String mimetype = sc.getMimeType("read.txt"); //
		String mimetype = sc.getMimeType("web.xml"); 
		System.out.println(mimetype);
		
		//2.获取请求路径的工程名
		String path = sc.getContextPath();
		System.out.println(path);
		
		//获取全局初始化参数
		String username = sc.getInitParameter("username");
		String password = sc.getInitParameter("password");
		System.out.println(username +" : "+ password);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
