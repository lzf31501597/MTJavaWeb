package javaTest.classobject;

public class MethodExercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 p = new Person2();
		p.name = "xiaoyuer";
		p.age = 25;
		
		System.out.println("main方法 p.name="+ p.name +", p.age=" +p.age);
		
		Tools t = new Tools();
		Person2 p2 = t.copyPerson2(p);
		System.out.println("main.copyPerson2方法 p2.name="+ p2.name +", p2.age=" +p2.age);
		
	}

}

class Person2 {
	String name;
	int age;
	double weight;
	double height;
}

class Tools {
	//Person2对象的复制
	public Person2 copyPerson2(Person2 p) {
		Person2 p2 = new Person2();
		p2.name = p.name;
		p2.age = p.age;
		System.out.println("Tools.copyPerson2方法 p2.name="+ p2.name +", p2.age=" +p2.age);
		
		return p2;
		
	}

}