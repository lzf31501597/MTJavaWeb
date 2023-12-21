package com.itheima.servlet.demo.listener.online_count;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class OnlineCountServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// 在服务器启动的时候，初始化一个值为0，还需要将这个值存入到ServletContext中
		//arg0.getServletContext().setAttribute("count", 0);
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// 在服务器启动的时候，初始化一个值为0，还需要将这个值存入到ServletContext中
		arg0.getServletContext().setAttribute("count1", 0);

	}

}
