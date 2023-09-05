package com.javaTest.extends_.exercise;

public class ExtendsExercise01 {
	
	public static void main (String[]agrs) {
		B b = new B();
	}
	
}

class A {
	
	A(){
		System.out.println("a");//1
	}
	
	A(String name){
		System.out.println("a name");
	}
	
}

class B extends A {
	
	B(){
		this("abc");
		System.out.println("b");//3
	}
	B(String name){
		//默认super（）调用父类的无参构造器
		System.out.println("b name");  //2
	}
}