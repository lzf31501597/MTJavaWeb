package com.itheima.servlet.demo.jstl.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.servlet.demo.jstl.domain.Student;
import com.itheima.servlet.demo.jstl.model.StudentModel;

/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			//1.调用Java类处理数据
			StudentModel studentModel = new StudentModel();
			List<Student> list = studentModel.findAll();
			
			//2.显示在页面上
			request.setAttribute("list", list);
			request.getRequestDispatcher("/jstl/list.jsp").forward(request, response);
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
