package com.javaTest.smallChangeSys.homeWork.homeWork06;

public class Son extends Father {

	String name = "BB";
	
	@Override
	public void g1() {
		
	}
	
	private void show() {
		//super能访问父类的父类的默认属性name和g1（），不能访问私有属性的age
		name = super.name;
		super.g1();
		id = super.id; //super能访问父类的默认属性id和f1（），不能访问私有属性的score
		super.f1();
	
		 //this能访问父类的父类的g1（），不能访问私有属性的age,name
		this.g1();
		id = this.id;//this能访问父类的默认属性id和f1（），不能访问私有属性的score
		this.f1();
		//this能访问本类默认属性name和g1（）show();
		name = this.name;
		this.g1();
		this.show();
	}
}
