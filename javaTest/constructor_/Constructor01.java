package com.javaTest.constructor_;

public class Constructor01 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1 = new Person1("King",20);
		Person1 p2 = new Person1("tom");
		Dog d = new Dog();
	}

}

class Dog {
	//默认构造函数  
	//反编译 javap Dog.class
	/*Dog(){ //默认程序会自动加载
		
	}*/
}
	//构造方法，又叫构造器--作用是新对象的初始化
	//构造器的三个特点：
	//1、方法名和类名相同
	//2、没有返回值
	//3、在创建对象时，系统自动调用该类的构造器完成对对象的初始化。
class Person1{
	String name;
	int age;
	
	public Person1(String pname, int page) {
		name = pname;
		age = page;
	}
	
	public Person1(String pname) {
		name = pname;
	}
}