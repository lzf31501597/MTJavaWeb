package javaTest.constructor;

public class ThisDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T t1 = new T();
		t1.f1();
		
		t1.f2();
		
		t1.f3();
	}

}

class T {
	//1、this访问成员方法：this。方法名（参数列表）；
	//2、this(参数列表)--只能在构造器内使用（即只能在构造器内，访问另一个构造器）*************
	//3、访问构造器的语法：this();必须放置在第一条语句
	
	String name = "Jacky";
	int age = 100;
	
	public T() {
		//访问构造器T(String name, int age)
		this("jack", 20);
		System.out.println("T() 构造器");
		//this("jack1", 20); //必须放置在第一条语句
	}
	
	public T(String name, int age) {
		System.out.println("T(String name, int age) 构造器");
		System.out.println("T(String name, int age) 构造器, name="+name +", age="+age);
	}
	
	
	//
	public void f1() {
		//this("jack", 20);//对this的调用必须是构造器的第一条语句
		System.out.println("f1() 方法");
	}
	
	public void f2() {
		//1.2两种方法的区别，涉及到继承，目前没法讲清楚
		System.out.println("f2() 方法");
		//1、调用本类的f1()方法
		f1();
		//2.调用本类的f1()方法
		this.f1();
	}
	
	//this关键字可以用来访问本类的属性
	public void f3() {
		String name = "smith";
		//传统访问方式(变量的作用域原则--就近原则)--//f3(), name=smith, age=100
		System.out.println("f3(), name="+name +", age="+age);
		//this访问属性(最准确的访问方式)--//f3(), this.name=Jacky, this.age=100
		System.out.println("f3(), this.name="+this.name +", this.age="+this.age);
	}
}