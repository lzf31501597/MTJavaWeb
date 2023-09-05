package com.javaTest.pkg_;

import com.javaTest.pkg_.xiaoming.Dog;

//import xiaoming.Dog;

public class Package01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//只能包含数字，字母，下划线，小圆点，但不能用数字开头，不能是关键字或保留字
		//包命名
		Dog dog = new Dog();
		
		com.javaTest.pkg_.xiaoqiang.Dog dog1 =new com.javaTest.pkg_.xiaoqiang.Dog();
		System.out.print("");
	}
	
	
	
}
