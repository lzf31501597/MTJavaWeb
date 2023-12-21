package com.itheima.servlet.demo.listener.ui;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 监听HttpSession的创建，销毁
 */
public class MyServletRequestListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("ServletRequestListener对象被销毁了。。。");
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("ServletRequestListener对象被创建了。。。");
	}
	

}
