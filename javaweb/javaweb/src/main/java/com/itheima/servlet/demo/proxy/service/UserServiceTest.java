package com.itheima.servlet.demo.proxy.service;

import org.junit.Test;

import com.itheima.servlet.demo.proxy.utils.ProxyBuilder;

public class UserServiceTest {

	@Test
	public void test1() {
		IUserService userService = new UserServiceImpl();
		ProxyBuilder proxyBuilder = new ProxyBuilder(userService);
		IUserService proxy = (IUserService) proxyBuilder.createProxy();
		proxy.addUser("tom", "321");
	}
}
