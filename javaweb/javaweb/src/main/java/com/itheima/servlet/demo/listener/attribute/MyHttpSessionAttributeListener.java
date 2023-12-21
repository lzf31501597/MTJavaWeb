package com.itheima.servlet.demo.listener.attribute;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("向session中添加了属性。。。");

	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("向session中移除了属性。。。");

	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("向session中替换了属性。。。");

	}

}
