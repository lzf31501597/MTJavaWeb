package com.javaTest.modifier_;

//import java.lang.*;
//import java.util.*;
//import java.awt.*;


public class Bb {
	public void say() {
		Aa a = new Aa();
		//同包不同类，可以访问public protected 和默认修饰属性和方法，不能访问private修饰属性和方法
		System.out.println("n1=" + a.n1 + " n2=" + a.n2 + " n3=" + a.n3 );
		a.m1();
		a.m2();
		a.m3();
		
	}
	
}
