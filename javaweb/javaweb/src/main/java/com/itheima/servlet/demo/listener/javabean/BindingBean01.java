package com.itheima.servlet.demo.listener.javabean;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * 监听HttpSession中 Java类的绑定与解除绑定
 */
public class BindingBean01 implements HttpSessionBindingListener{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		// 
		System.out.println(event.getName()+"与session绑定了。。。");
		
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.getName()+"与session解除绑定了。。。");
	}
	
	
}
