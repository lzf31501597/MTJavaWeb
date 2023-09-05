package com.javaTest.encapsulation_.improvee;

public class Account {
	
	public String name;
	private double balance;
	private String pwd;
	
	
	
	public Account() {
		
	}
	
	public Account(String name, double balance, String pwd) {
		
//		this.name = name;
//		this.balance = balance;
//		this.pwd = pwd;
		setName(name);
		setPwd(pwd);
		setBalance(balance);
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name.length() >= 2 && name.length() <= 6) {
			this.name = name;
		} else {
			System.out.println("姓名：长度为2位 3位或4位，默认无名");
			this.name = "无名";
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		if(balance >= 20) {
			this.balance = balance;
		}else {
			System.out.println("余额：必须》20，默认为0");
			this.balance = balance;
		}
		
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		if(pwd.length() == 6) {
			this.pwd = pwd;
		}else {
			System.out.println("密码必须是6位，默认位000000");
			this.pwd = "000000";
		}
		
	}
	
	public void showInfo() {
		
		//System.out.println("名字:"+name+" ,密码:"+pwd+" ,余额:"+balance);
		
		if(name.equals("james") && pwd.equals("321321") ) {
			System.out.println("名字:"+name+" ,密码:"+pwd+" ,余额:"+balance);
		}else {
			System.out.println("你无权查看！！！");
		}
		
	}
	
	
	
}
