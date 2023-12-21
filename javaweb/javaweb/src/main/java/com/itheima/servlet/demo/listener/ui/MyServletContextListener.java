package com.itheima.servlet.demo.listener.ui;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/**
 * 监听器ServletContextListener
 * 事件源：ServletContext
 * 监听器：MyServletContextListener
 * 事件源和监听器绑定：通过配置的方式绑定
 */
public class MyServletContextListener implements ServletContextListener {

	//监听 ServletContext对象的销毁
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ServletContext对象被销毁了。。。");

	}
	
	//监听ServletContext 对象的创建
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ServletContext对象被创建了。。。");
	}

}
