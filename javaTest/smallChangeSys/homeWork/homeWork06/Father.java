package com.javaTest.smallChangeSys.homeWork.homeWork06;

public class Father extends Grand {

	String id = "001";
	private double score;
	
	public void f1() {
		//name = super.name; //1.super能访问父类的默认name属性和g1（），不能访问父类的私有属性age。
		//super.g1();

		id = this.id; //1.this能访问父类的默认属性name和个g1（），也可以访问本类的默认属性id和私有属性score f1()。
		score = this.score;
		this.f1();
		name = this.name;
		this.g1();
		
		
	}
	
	
}
