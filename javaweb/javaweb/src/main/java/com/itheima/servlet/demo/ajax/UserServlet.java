package com.itheima.servlet.demo.ajax;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); 
		String username = request.getParameter("username");
		String msg = "";
		if ("tom".equals(username)) {
			msg = "<font color='red'>用户名已被占用</font>";
		} else {
			msg = "<font color='green'>用户名可以用</font>";
		}
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(msg);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
