package com.javaTest.overload_;

public class VarScope {
	//---变量的作用域
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat(); 
		cat.eat();
		cat.cry();
		cat.say();
		cat.hi();
	}

}

/*//代码块没有被定义
 * { int num = 100; }
 */


class Cat {
	//全局变量--对象的属性
	//属性在定义的同时，可以直接赋值
	int age = 10;
	double weight;
	
	public void hi() {
		int num = 100; 
		System.out.println("Cat。hi()使用属性 num=" + num);
		
		//String address ; //参数没有初始化
		//System.out.println("Cat。hi()使用属性 address=" + address);
		
		String address1 = "深圳软件园";
		System.out.println("Cat。hi()使用属性 address1=" + address1);
	}
	
	public void cry() {
		//局部变量是一般指在成员方法中定义的变量
		int n = 10;
		String name = "Jack";
		System.out.println("Cat。say()使用属性 age=" + age);
	}

	public void eat() {
		System.out.println("Cat。eat()使用属性 age=" + age);
		
		//这个参数name没有定义。(name cannot be resolved to a variable)
		//System.out.println("Cat。eat()使用Cat。say()属性 name=" + name);
	}
	
	public void say() {
		weight = 50;
		
		System.out.println("Cat。say()使用属性 age=" + age + ", weight=" + weight);
		
		//这个参数name没有定义。(name cannot be resolved to a variable)
		//System.out.println("Cat。eat()使用Cat。say()属性 name=" + name);
	}
	
}