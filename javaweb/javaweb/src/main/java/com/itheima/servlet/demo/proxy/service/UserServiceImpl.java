package com.itheima.servlet.demo.proxy.service;

public class UserServiceImpl implements IUserService {

	@Override
	public void addUser(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("添加用户：" + username + "  " +password);
	}

}
