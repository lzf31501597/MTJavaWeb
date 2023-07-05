package javaTest.constructor;

public class ThisTestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 =new Person("mary",20);
		//Person p2 = new Person("smith",30);
		Person p2 = new Person("mary",20);
		
		boolean b1 = p1.compareTo(p2);
		System.out.println("b1=" + b1);
		
	
	}

}

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean compareTo(Person p) {
		/*
		if(this.name.equals(p.name) && this.age == p.age) {
			return true;
		}else {
			return false;
		}*/
		
		return this.name.equals(p.name) && this.age == p.age;
			
	}
	
}