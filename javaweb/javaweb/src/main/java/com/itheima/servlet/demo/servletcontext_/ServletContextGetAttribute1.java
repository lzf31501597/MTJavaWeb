package com.itheima.servlet.demo.servletcontext_;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletContext 获取域对象Attribute
 */
public class ServletContextGetAttribute1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		// 当 被创建时，初始化一个值
		this.getServletContext().setAttribute("name", "李四");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = (String) this.getServletContext().getAttribute("name");
		System.out.println("ServletContextGetAttribute1 name=" + name);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
