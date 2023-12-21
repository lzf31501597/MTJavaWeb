package com.itheima.servlet.demo.listener.ui;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 监听HttpSession的创建，销毁
 */
public class MyHttpSessionListener implements HttpSessionListener {

	//监听HttpSession的创建
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("HttpSessionListener对象被创建了。。。");
	}
	//监听HttpSession的销毁
	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("HttpSessionListener对象被销毁了。。。");
	}

}
