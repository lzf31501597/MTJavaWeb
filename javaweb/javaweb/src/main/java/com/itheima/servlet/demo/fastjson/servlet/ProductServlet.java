package com.itheima.servlet.demo.fastjson.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.itheima.servlet.demo.fastjson.domain.Project01;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String callback = request.getParameter("callback");
		request.setCharacterEncoding("utf-8");
		
		Project01 project01 = new Project01();
		project01.setId(1);
		project01.setName("电视机");
		project01.setCount(200);
		project01.setPrice(1500);
		
		Project01 project02 = new Project01();
		project02.setId(2);
		project02.setName("洗衣机");
		project02.setCount(280);
		project02.setPrice(1500);
		
		List<Project01> list = new ArrayList();
		list.add(project01);
		list.add(project02);
		
		//2.使用fastjson讲 project01 转换成JSON数据
		String json = JSONObject.toJSONString(list);
		response.setCharacterEncoding("utf-8");
		//response.getWriter().write(callback+"("+json+")");
		response.getWriter().write("cb"+"("+json+")");
		//System.out.println("json");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
