package com.javaTest.object_;

public class Equals01 {
	
	//==是一个比较运算符
	// 1，既可以判断基本类型，也可以判断引用类型；
	// 2，如果判断基本类型，则判断的是值是否相等；
	// 3，如果判断的是引用类型，则判断的是地址是否相等（及判定是不是同一个对象）
	// 4, equals 是object类的方法，只能判断引用类型
	// 5, 默认判断的是地址是否相等，子类中往往重写该方法，用于判断内容是否相等。比如Integer，String
	// 6, 
	// 7, 
	// 8, 
	// 9, 
	public static void main(String[] args) {
		A a = new A();
		A b = a;
		A c = b;
		System.out.println(a == c);  //true
		System.out.println(b == c);  //true
		
		B bobj = a;
		System.out.println(bobj == c);  //true
		
		int num1 = 10;
		double num2 = 10.0;
		System.out.println(num1 == num2);  //true  基本数据类型，判断值是否相等。
		
		////equals 方法，源码怎么查看.
		"hello".equals("abc");
		
	}

}
class B {
	
}
class A extends B {
	
}