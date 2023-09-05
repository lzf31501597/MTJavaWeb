package com.javaTest.polymorphic_.ObjectPoly;

public class PolyObject {

	// 对象的多态：核心，困难，重点
	//1，一个对象的编译类型和运行类型可以不一致
	//2.编译类型在定义对象时，就确定了，不能改变
	//3，运行类型是可以变化的
	//4，编译类型看定义时=号的左边，运行类型看=号右边
	// Animal animal = new Dog（）；  Animal是anima的编译类型，Dog是运行类型
	// animal = new Cat（）；Animal任然是anima的编译类型，Cat是运行类型
	public static void main(String[] args) {
		// 体验对象多态特点
		
		// animal 编译类型就是 Animal，运行类型Dog
		Animal animal = new Dog();
		animal.cry();//因为运行时，这时就执行到改行时，animal运行类型是Dog，所以cry（）是Dog的cry（）
		
		//animal 编译类Animal，运行类型就是Cat
		animal = new Cat();
		animal.cry();
	}

}
