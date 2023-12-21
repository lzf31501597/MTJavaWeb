package com.itheima.servlet.demo.filter_.project.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.servlet.demo.filter_.project.domain.User;
import com.itheima.servlet.demo.filter_.project.model.UserModel;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 接收数据
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		System.out.println(name +" - "+ pwd);
		// 封装数据
		User user = new User();
		user.setUsername(name);
		user.setPassword(pwd);
		// 处理数据
		try {
			UserModel userModel = new UserModel();
			User existUser = userModel.login(user);
			
			// 根据处理结果页面跳转
			if (existUser == null) {
				//登录失败
				request.setAttribute("msg", " 用户名或密码错误");
				request.getRequestDispatcher("/filter/login.jsp").forward(request, response);
				
			}else {
				//登陆成功
				request.getSession().setAttribute("existUser", existUser);
				response.sendRedirect(request.getContextPath()+"/filter_jsp/success.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
