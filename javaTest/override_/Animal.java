package com.javaTest.override_;

public class Animal {
	
	public void cry() {

		System.out.println("动物叫唤..");
	}

	//1,子类的方法的参数，方法名称，要和父类方法的参数，方法名称完全一致。
	//2,子类方法的返回类型和父类方法返回类型一样，或者是父类返回类型的子类。
	//  父类的返回类型是object ，子类是String
	//3,子类方法不能缩小父类方法的访问权限 public > protected > 默认 > private
	public Object m1() {
		return null;
	}

	//这里Object不是String的子类，因此编译报错
	//AAA是没有被定义的类型
	public String m2() {
		return null;
	}

	public String m3() {
		return null;
	}

	protected void eat() {
		
	}
}

