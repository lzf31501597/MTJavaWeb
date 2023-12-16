package com.itheima.servlet.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTttp extends HttpServlet {

	
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.service(req, resp);
//	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get请求执行doGet(） 方法
		//super.doGet(req, resp);
		doPost(req, resp);
		//resp.getWriter().println("doGet(req, resp)");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// post请求执行doPost(） 方法
		//super.doPost(req, resp);
		//doGet(req, resp);
		resp.getWriter().println("doPost(req, resp)");
	}

}
