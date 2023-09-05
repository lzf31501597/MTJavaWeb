package com.javaTest.polymorphic_.detaill;

public class PolyDetail2 {
	
	public static void main(String[] args) {
		//instanceof比较操作符，用于判断对象的运行类型是否为XX类型，或是XX类型的子类型
		BB bb = new BB();
		System.out.println(bb instanceof BB);//true
		System.out.println(bb instanceof AA);//true
		
		//aa 编译类型 AA，运行类型是BB
		AA aa = new BB();
		System.out.println(aa instanceof BB);//true
		System.out.println(aa instanceof AA);//true
		
		Object obj = new Object();
		System.out.println(obj instanceof AA);//false
		
		String str = "hello";
		//System.out.println(str instanceof AA);// Incompatible conditional operand types String and AA(不兼容的条件操作数类型 String 和 AA)
		System.out.println(str instanceof Object);//true
		
	}
	
}

class AA {//父类
	int count = 10;//属性
}
class BB extends AA {//子类
	int count = 20;//属性
}