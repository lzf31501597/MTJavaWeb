package com.javaTest.overload_;

public class VarScopeDetail {
	//---变量的作用域
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(); 
		p.call();
		p.call1();
		p.hi();
		
		T1 t1 = new T1();
		t1.test();
		t1.test2(p);
	}

}

class T1 {
	
	public void test() {
		Person p1 = new Person();
		System.out.println("test().p1.name=" + p1.name);
	}
	
	public void test2(Person p) {
		System.out.println("test2().p.name=" + p.name);
	}
	
}

class Person {
	
	private int age = 20;
	String name = "Jack";
	//属性和局部变量可以重名，访问时遵循就近原则
	public void call() {
		String name = "King";
		System.out.println("call().name=" + name +" call().age=" +age);
	}
	
	public void call1() {
		System.out.println("call1().name=" + name +" call1().age=" +age);
	}
	
	public void hi() {
		String address1 = "深圳软件园";
		//String address1 = "北京软件园"; //参数已定义，不能重复定义
		System.out.println("hi().address1=" + address1);
	}
}