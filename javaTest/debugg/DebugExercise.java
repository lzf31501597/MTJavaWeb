package javaTest.debugg;

import java.util.Arrays;
//debug对象创建的过程，加深对调试的理解
public class DebugExercise {

	// 
	public static void main(String[] args) {
		 //演示执行到下一个断点，同时支持动态的下断点.
		Person jacky = new Person("jacky", 30);
		
		System.out.println(jacky);
		

	}

}

class Person {
	 private String name;
	 private int age;
	 
	public Person(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	 
}
