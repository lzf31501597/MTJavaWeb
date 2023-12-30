package com.itheima.servlet.demo.ajax;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.servlet.demo.ajax.cityutil.CityUtil;

/**
 * Servlet implementation class ProvinceServlet
 */
public class CityServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String pname = request.getParameter("pname");
		String citys = CityUtil.getCitys(pname);
		
		response.setCharacterEncoding("utf-8");
		response.getWriter().write(citys);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
