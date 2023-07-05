package javaTest.constructor;

public class HomeWork02 {

	public static void main(String[] args) {
		//A07 Dog
		System.out.println("//A07 Dog-----------------");
		Dogy d = new Dogy("smith", "黄色", 5);
		d.show();
		
		//Test8 
		System.out.println("\n//Test8-----------------");
		//new Test()是匿名对象，匿名对象使用后，就不能使用（没有对象名，使用后会被销毁）
		//new Test().count1();创建好匿名对象后，就调用count1()方法
		new Test().count1();
		Test t = new Test();
		t.count2();
		t.count2();
		
		//Music9
		System.out.println("\n////Music9-----------------");
		Music m = new Music("中国红", 5);
		m.getInfo();
		
		//Demo 10
		System.out.println("\n////Demo 10-----------------");
		Demo d1 = new Demo();
		Demo d2 = d1;
		d2.m();
		System.out.println("d1.i=" + d1.i);
		System.out.println("d2.i=" + d2.i);
		
		//Test1 11
		System.out.println("\n////Test1 11-----------------");
		Test1 t1 = new Test1();
		double tt = t1.method(t1.method(10.0, 20.0), 100);
		System.out.println("t1.method(t1.method(10.0, 20.0), 100)=" + tt);
		
		//Employee 12
		System.out.println("\n////Employee 12-----------------");
		new Employee("222", '男', 30, "自由", 25000.0);
		
	}

}

class Dogy {
	
	String name;
	String color;
	int age;
	public Dogy(String name, String color, int age) {
		
		this.name = name;
		this.color = color;
		this.age = age;
		
	}
	
	public void show() {
		
		System.out.println("Dogy的名字是：" + this.name + " ,颜色是："+this.color 
				+ " ,年龄也" + this.age + "岁了。");
		
	}
	
}

class Test {
	
	int count = 9;	
	public void count1() {
		
		count = 10;
		System.out.println("count1()=" + count);
		
	}
	
	public void count2() {
		
		System.out.println("count2()=" + count++);
		
	}
	
	
}

class Music {
	
	String name;
	int times;
	public Music(String name, int times) {

		this.name = name;
		this.times = times;
		
	}
	public void play() {
		
		System.out.println("播放的这首歌名叫：" + this.name + " ,时长是：" + this.times +"分钟。");
		
	}
	
	public void getInfo() {
		this.play();
	}
}	

class Demo {
	
	int i = 100;
	public void m() {
		
		int j = i++;
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		
	}
	
}

class Test1 {
	
	double d1;
	double d2;

	
	/*
	 * public Test1() {
	 * 
	 * }
	 */
	 
	public double method(double d1, double d2) {
		
		this.d1 = d1;
		this.d2 = d2;
		return d1 + d2;
		
	}
}

class Employee {
	
	String name;
	char gender;
	int age;
	String position;
	double money;
	
	public Employee(String position, double money) {
		//this.Employee("111", '男', 35, "自11由", 5000.0);
		this.position = position;
		this.money = money;
		
		System.out.println("Employee(String position, double money).职业是："+this.position 
				+ " ,money=" + this.money);
		
	}
	
	public Employee(String name, char gender, int age) {
		
		this("IT",20000.0);
		this.name = name;
		this.gender = gender;
		this.age = age;
		
		System.out.println("Employee(String name, char gender, int age).姓名是："
				+this.name + " ,性别：" + this.gender + " ,age=" + this.age);
		
	}

	public Employee(String name, char gender, int age, String position, double money) {
		
		this("小B", '女', 20);
		
		this.position = position;
		this.money = money;
		
		System.out.println("Employee(String name, char gender, int age, String position, double money).姓名是："
				+this.name + " ,性别：" + this.gender + " ,age=" + this.age 
				+ " ,职业是："+this.position 	+ " ,money=" + this.money);
	}
	
}