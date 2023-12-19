package com.itheima.servlet.demo.cookies;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * cookies 记录用户上次访问的时间的servlet
 */
public class VisitServlet extends HttpServlet {
	  
    /**
     * 用户访问Servlet：
     * 	1.如果是第一次访问：（显示你好，欢迎访问网站；记录当前访问时间，存入cookie，回写到浏览器）
     * 	2.如果不是第一次访问：（获取上一次访问时间，显示在页面上；记录当前访问时间，存入到cookie，回写到浏览器）
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 判断是否是第一次访问：从指定的cookie数组中，获取指定名称的cookie
		// 获取浏览器带过来的所有的cookie
		Cookie[] cookies = request.getCookies();
		
		//从数组中找到指定的名称cookie
		Cookie cookie = CookieUtils.findCookie(cookies, "lastVisit");
		
		//判断是否是第一次访问
		if (cookie == null) {
			//显示第一次访问，显示到页面上一段内容
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("<h1>您好，欢迎访问本网站！</h1>");
			
		} else {
			//如果不是第一次访问：（获取上一次访问时间，显示在页面上
			String value = cookie.getValue();
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("<h1>您好，您上次访问的时间为："+value+"</h1>");
		}
		
		// 记录当前系统时间存入到cookie，回写到浏览器
		Date date = new Date();
		// 存入到cookie
		//Cookie c2 = new Cookie("lastVisit", date.toLocaleString());//方法不合法
		Cookie c2 = new Cookie("lastVisit", date.toString());
		System.out.println(c2.getName()+ " , "+c2.getValue());
		//////////////////////////////////
		//给Cookie设置有效路径(什么时候将Cookie带过来)
		c2.setPath("/javaweb");
		//给Cookie设置有效时长
		c2.setMaxAge(60 * 60);//设置有效时间为1小时
		//给cookie设置有效域名(设置能够访问子网页传过去的cookie)
		c2.setDomain("wwww.bai.com");
		
		//////////////////
		
		// 回写到浏览器
		response.addCookie(c2);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
