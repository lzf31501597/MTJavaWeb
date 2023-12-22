package com.itheima.servlet.demo.filter_.project.filter;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyHttpServletRequest extends HttpServletRequestWrapper {
	
	private HttpServletRequest request;

	public MyHttpServletRequest(HttpServletRequest request) {
		super(request);
		this.request = request;
	}

	//增强request.getParameter(name) 方法
	@Override
	public String getParameter(String name) {
		// 获得请求方式
		String method = request.getMethod();
		//根据get或post请求进行不同方式的乱码的处理
		if ("GET".equalsIgnoreCase(method)) {
			// get方式
			String value =  super.getParameter(name);
			try {
				value = new String(value.getBytes("ISO-8859-1"),"UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return value;
		}else if ("POST".equalsIgnoreCase(method)){
			// post方式
			try {
				request.setCharacterEncoding("UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		
		return super.getParameter(name);
	}

	
}
