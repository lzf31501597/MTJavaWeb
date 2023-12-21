package com.itheima.servlet.demo.listener.javabean;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * 监听HttpSession中 Java类的绑定与解除绑定
 */
public class ActivationBean02 implements HttpSessionActivationListener,Serializable{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println(se.getSource()+"bean2与session活化了。。。");
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println(se.getSource()+"bean2与session顿化了。。。");
	}


	
	
}
