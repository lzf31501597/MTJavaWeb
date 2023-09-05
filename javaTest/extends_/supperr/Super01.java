package com.javaTest.extends_.supperr;

public class Super01 {
	
	//1,调用父类的构造器的好处：分工明确，父类属性由父类初始化。子类属性由子类初始化
	//2，当子类中有和父类的成员（属性和方法）重名时，为了访问父类的成员，必须通过super访问。
	//       如果没有重名，使用super，和this，直接访问的效果是一样的。
	//3，super的访问不限于直接父类，如果爷爷类和本类中有同名的成员，也可以使用supper去访问爷爷类的成员；
	//		如果多个基类（上级类）中都有同名的成员，使用super访问遵循就近原则。  A->B->C
	//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		//b.sum();
		b.test();
	}
	
}
