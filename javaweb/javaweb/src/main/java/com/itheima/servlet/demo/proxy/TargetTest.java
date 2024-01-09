package com.itheima.servlet.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.jupiter.api.Test;

public class TargetTest {

	//直接访问目标
	@Test
	public void test1() {
		ITarget target = new Target();
		target.show();
	}
	
	//通过代理访问目标
	@Test
	public void test2() {
		ITarget target = new Target();
		ITarget iTarget = new TargetProxy(target);
		iTarget.show();
	}
	
	//使用jdk提供的Proxy类来完成动态代理
	@Test
	public void test3() {
		final ITarget target = new Target();
		ITarget iTarget = (ITarget) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				return method.invoke(target, args);
			}
		});
		iTarget.show();
	}	
}
