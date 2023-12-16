package com.itheima.servlet.demo;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//servlet入门程序
public class FirstServlet implements Servlet {
	
	//用来处理客户的请求，并且对请求作出响应的方法
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		//向页面输出一个 first servlet 字符串
		arg1.getWriter().println("first servlet...");

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	

}
