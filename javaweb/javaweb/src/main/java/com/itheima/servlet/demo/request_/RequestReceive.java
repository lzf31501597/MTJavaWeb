package com.itheima.servlet.demo.request_;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * request接收表单参数
 */
public class RequestReceive extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 接收用户密码
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		//接收性别籍贯
		String sex = request.getParameter("sex");
		String city = request.getParameter("city");
		//接收爱好
		//String hobby = request.getParameter("hobby");
		String[] hobbys = request.getParameterValues("hobby");
		
		//接收自我介绍
		String info = request.getParameter("info");
		
		System.out.println("用户:"+name+"\n密码:"+pwd+"\n性别:"+sex+"\n籍贯:"+sex+"\n爱好:"+Arrays.toString(hobbys)+"\n自我介绍:"+info);
		
		//使用
		Map<String, String[]> map = request.getParameterMap();
		for(String key : map.keySet()) {
			String[] value = map.get(key);
			System.out.println(key+" : "+Arrays.toString(value));
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
