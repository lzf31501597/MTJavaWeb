package com.javaTest.pkg_;

import com.javaTest.modifier_.Aa;
import com.javaTest.modifier_.Bb;

public class Test {
	//1,公开级别：用public修饰，对外公开
	//2，受保护级别：用protected修饰，对子类和同一个包中的类公开
	//3，默认级别：没有修饰符号，向同一个包的类公开
	//4，私有级别：用private修饰，只有类本身可以访问，不对外公开
	
	public static void main(String[] args) {
		//在不同包，可以访问public 修饰属性和方法
		//但不能访问protected 默认  private 修饰属性和方法
		Aa a = new Aa();
		System.out.println("javaTest.pkg.Test n1=" + a.n1);
		a.m1(); //不能访问 m2 m3 m4
		Bb b = new Bb();
		b.say();

	}

}

class A {
	//四个属性，分别使用不同的修饰符，
}