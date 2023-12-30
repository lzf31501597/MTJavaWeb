package com.itheima.servlet.demo.ajax;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoadServlet
 */
public class LoadServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if ("tom".equals(username)) {
			response.getWriter().write("<font color='red'>用户名被占用</font>");
		} else {
			response.getWriter().write("<font color='green'>用户名可以使用</font>");
		}
//		if ("321".equals(password)) {
//			response.getWriter().write("<font color='red'>密码正确</font>");
//		} else {
//			response.getWriter().write("<font color='green'>密码不正确</font>");
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
