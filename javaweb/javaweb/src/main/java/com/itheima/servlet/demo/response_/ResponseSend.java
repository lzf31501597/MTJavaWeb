package com.itheima.servlet.demo.response_;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 设置响应的状态码
 * 	使用状态码和Location头完成重定向
 * 	定时刷新	
 */
public class ResponseSend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置响应的状态码
		//response.setStatus(404);
		//完成重定向
		//response.setStatus(302);
		//设置响应头
		//response.setHeader("Location", "/javaweb/ResponseSend2");
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println("ResponseSend...");
		//能替换上两句
		//response.sendRedirect("/javaweb/ResponseSend2");
		
		//定时刷新	
		
		response.getWriter().println("5秒后页面跳转。。。");
		response.setHeader("Refresh", "5;url=/javaweb/ResponseSend2");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
