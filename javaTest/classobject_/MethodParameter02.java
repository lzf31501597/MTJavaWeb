package com.javaTest.classobject_;

public class MethodParameter02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.name = "xiaoyuer";
		person.age = 25;
		person.weight = 60;
		person.height = 170;
		
		Person p2 = person;
		System.out.println(p2.age);
	}

}

class Person {
	String name;
	int age;
	double weight;
	double height;
}