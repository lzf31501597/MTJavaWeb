package com.itheima.servlet.demo.bootstrap.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.itheima.servlet.demo.bootstrap.domain.PageBean;
import com.itheima.servlet.demo.bootstrap.domain.Product;
import com.itheima.servlet.demo.bootstrap.service.ProductService;

/**
 * Servlet implementation class ProServlet
 */
public class ProServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		int pageNo = Integer.parseInt(request.getParameter("pageNo"));
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		System.out.println(pageNo +" : "+ pageSize);
		
		
		ProductService service = new ProductService();
		try {
			//List<Product> psList = service.findAllList(pageNo, pageSize);
			PageBean<Product> pageBean = service.findAllList(pageNo, pageSize);
			String json =JSONObject.toJSONString(pageBean);
			response.getWriter().write(json);
			
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
