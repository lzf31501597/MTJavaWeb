package javaTest.classobject;

public class PropertiesDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		int[] arr = {1,2,3};
		b.test100(arr);
		
		System.out.println("main方法  arr数组");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		Person1 p = new Person1();
		p.name = "james";
		p.age = 38;
		System.out.println("main方法  p.name="+ p.name +", p.age=" +p.age);
		b.test200(p);
		
	}

}
class Person1{
	String name;
	int age;
}

class B {

	public void test100(int[] arr) {
		//arr[0] = 100 ;
		
		System.out.println("test100方法  arr数组");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		arr[0] = 100 ;
	}
	
	public void test200(Person1 p1) {
		
		p1.age = 20000;
		System.out.println("test100方法 p1.name="+ p1.name +", p1.age=" +p1.age);
		
	}
}