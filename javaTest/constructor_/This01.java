package com.javaTest.constructor_;

public class This01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 d2 = new Dog2("dog", 5);
		d2.info();
		System.out.println("d2.hashCode()=" + d2.hashCode());
		
		System.out.println("++++++++++++++++++++++=");
		Dog2 d3 = new Dog2("dog", 2);
		d3.info();
		System.out.println("d3.hashCode()=" + d3.hashCode());
		
		/*
		info().this.hashCode()=2083562754
		dog	5	
		Dog2().this.hashCode()=2083562754
		d2.hashCode()=2083562754
		++++++++++++++++++++++=
		info().this.hashCode()=1239731077
		dog1	2	
		Dog2().this.hashCode()=1239731077
		d3.hashCode()=1239731077
		*/
	}

}

class Dog2 {
	
	String name;
	int age;
	
	/*public Dog2(String dname, int dage) {//dog	5
		name = dname;
		age = dage;
	}*/
	
	//如果构造器的形参名，能够直接携程属性名，就更好了
	//但是会出现一个问题，根据变量的作用域原则
	//构造器的name 是局部变量，而不是属性
	//构造器的age 是局部变量，而不是属性
	//=======>引出this关键字来解决---------代表当前对象
	
	/*public Dog2(String name, int age) {//null	0
		name = name;
		age = age; 
	}*/
	
	//构造器
	public Dog2(String name, int age) {//dog	5
		//this。name  就是当前（调用这个构造器）对象的属性name
		this.name = name;
		//this。age 就是当前（调用这个构造器）对象的属性age
		this.age = age; 
		System.out.println("info().this.hashCode()=" + this.hashCode() );
	}
		
	public void info() {
		System.out.println(this.name + "\t" + this.age + "\t" );
		System.out.println("Dog2().this.hashCode()=" + this.hashCode() );
	}
}