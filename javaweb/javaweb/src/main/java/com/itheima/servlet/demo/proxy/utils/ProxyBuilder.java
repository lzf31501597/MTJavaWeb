package com.itheima.servlet.demo.proxy.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂
 */
public class ProxyBuilder implements InvocationHandler{
	
	private Object target;// 目标对象
	
	public ProxyBuilder(Object target) {
		this.target = target;
	}

	public Object createProxy() {//创建代理对象
		ClassLoader loader = target.getClass().getClassLoader();
		Class[] interfaces = target.getClass().getInterfaces();
		return Proxy.newProxyInstance(loader, interfaces, this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		//System.out.println(proxy);
		System.out.println(method);
		System.out.println(args);
		return null;
	}
	
	
	
}
