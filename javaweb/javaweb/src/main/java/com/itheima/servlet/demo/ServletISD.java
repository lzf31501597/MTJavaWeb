package com.itheima.servlet.demo;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletISD implements Servlet {
	//Servlet对象被实例化的时候，init方法就会执行，而且只执行一次（Servlet是单例）
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("ServletDemo 初始化了。。。");

	}
	//service（）任何一次请求都会执行Service（），可以执行多次
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("ServletDemo 执行了。。。");

	}
	//servlet从服务器中移除或者服务器关闭的时候，销毁Servlet，执行一次
	@Override
	public void destroy() {
		System.out.println("ServletDemo 被销毁了。。。");

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

	

}
