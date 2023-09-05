package com.javaTest.extends_.extends01;

public class ExtendsDetail {
	//1，子类继承了父类所有的属性和方法，非私有属性和方法不能在子类直接访问，
	//但是私有属性和方法不能在子类直接访问，要通过公共的方法去访问（间接访问 ） 
	public static void main(String[] args) {
		//Sub sub = new Sub();
		//sub.sayOk();
		//sub.callGetN4();
		
		System.out.println("第一个对象-----------");
		Sub sub = new Sub();
		
		System.out.println("第二个对象-----------");
		Sub sub2 = new Sub("king");
		
		System.out.println("第三个对象-----------");
		Sub sub3 = new Sub("king",20);
		
	}
	
}
