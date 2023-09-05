package com.javaTest.polymorphic_.dynamicc;

public class DanamicBinding {
	//java动态绑定机制
	//1, 当调用对象方法的时候，该方法会和该对象的内存地址、运行类型绑定
	//2，当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用
	//
	//
	public static void main(String[] args) {
		// a 的编译类型是A，运行类型是B
		A a = new B();//向上转型
		System.out.println(a.sum());//40-->30
		System.out.println(a.sum1());//30 -->20

	}

}

class A{
	public int i = 10;
	
	public int getI() {//10
		return i;
		
	}
	public int sum() {//20+10
		return getI() + 10;
		
	}
	public int sum1() {//20
		return i + 10;
		
	}
}

class B extends A{
	public int i = 20;
	
	public int getI() {//20
		return i;
		
	}
//	public int sum() {//40
//		return getI() + 20;
//		
//	}
//	public int sum1() {//30
//		return i + 10;
//		
//	}
}