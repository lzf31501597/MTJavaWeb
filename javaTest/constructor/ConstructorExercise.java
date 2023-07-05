package javaTest.constructor;

public class ConstructorExercise {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 p1 = new Person2();
		System.out.println("Person2().p1.name=" + p1.name 
				+" Person2().p1.age=" + p1.age);
		//Person2().p1.name=null Person2().p1.age=18
		
		Person2 p2 = new Person2("King", 22);
		System.out.println("Person2().p2.name=" + p2.name 
				+" Person2().p2.age=" + p2.age);
		//Person2().p2.name=King Person2().p2.age=22
	}

}

class Dog1 {
	//默认构造函数  
	//反编译 javap Dog.class
	/*Dog(){ //默认程序会自动加载
		
	}*/
}
	//构造方法，又叫构造器--作用是新对象的初始化
	//构造器的三个特点：
	//1、方法名和类名相同
	//2、没有返回值
	//3、在创建对象时，系统自动调用该类的构造器完成对对象的初始化。
class Person2{
	String name;
	int age;
	
	public Person2(){
		//name = "Jack";
		age = 18;
	}
	
	public Person2(String pname, int page) {
		name = pname;
		age = page;
	}
	
	public Person2(String pname) {
		name = pname;
	}
}