package com.itheima.servlet.demo.listener.online_count;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineCountHttpSessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// 在线了 （获取原来的值）
		HttpSession httpSession = arg0.getSession();
		System.out.println(httpSession.getId()+"上线了");
		// 获取ServletContext的count值
		Integer count1 = (Integer) httpSession.getServletContext().getAttribute("count1");
		count1++;
		httpSession.getServletContext().setAttribute("count1", count1);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// 离线了 （）
		HttpSession httpSession = arg0.getSession();
		System.out.println(httpSession.getId()+"离线了");
		// 获取ServletContext的count值
		Integer count1 = (Integer) httpSession.getServletContext().getAttribute("count1");
		count1--;
		httpSession.getServletContext().setAttribute("count1", count1);
	}

}
