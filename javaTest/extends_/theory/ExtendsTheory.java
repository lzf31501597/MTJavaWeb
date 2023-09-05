package com.javaTest.extends_.theory;


/*
 * 继承的本质：先从子类找属性值，一次往上从父类找，能访问则返回信息，不能访问则通过间接访问的方式访问（创建公共的访问方法）
 * 直到object类，
 */
public class ExtendsTheory {

	public static void main(String[] args) {
		// 内存的布局
		Son son = new Son();//内存布局
		//要按照查找关系来返回信息
		//(1) 首先看子类是否有该属性
		//(2) 如果子类有这个属性，并且可以访问，则返回信息
		//(3) 如果子类没有这个属性，就看父类有没有这个属性(如果父类有该属性，并且可以访问，就返回信息..) 
		//(4) 如果父类没有就按照(3)的规则，继续找上级父类，直到 Object...
		
		System.out.println("son.name=" + son.name);//返回大头儿子
		//System.out.println("son.age=" + son.age);//返回39 ，要能访问
		System.out.println("son.age=" + son.getAge());//返回39
		System.out.println("son.hobby=" + son.hobby);//返回旅游

	}

}

class GrandPa{
	String name = "大头爷爷";
	String hobby = "旅游";
	int age = 100;
}

class Father extends GrandPa{
	String name = "大头爸爸";
	//int age = 39;
	private int age = 39;
	
	public int getAge() {
		return age;
		
	}
}

class Son extends Father{
	String name = "大头儿子";
	
}