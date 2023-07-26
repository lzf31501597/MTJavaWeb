package javaTest.extendss.extends01;

public class Base extends TopBase{

	public int n1 = 100;
	protected int n2 = 200;
	int n3 = 300;
	private int n4 = 400;
	
	//1，子类继承了父类所有的属性和方法，非私有属性和方法能在子类直接访问，
	//但是私有属性和方法不能在子类直接访问，要通过公共的方法去访问（间接访问 ）
	
	public Base() {//无参构造器
		//super(); //父类无参构造器
		System.out.println("父类Base()构造器被调用....");
		
	}
	public Base(String name,int age) {//有参构造器
		// do noting
		//super(); //父类无参构造器
		System.out.println("父类Base(String name,int age)构造器被调用....");
		
	}
	public Base(String name) {//有参构造器
		// do noting
		//super(); //父类无参构造器
		System.out.println("父类Base(String name)构造器被调用....");
		
	}
	//父类提供一个public方法，访问返回N4的值
	public int getN4() {
		return n4;
	}
	
	public void test100() {
		
		System.out.println("test100()....");
		
	}
	
	protected void test200() {
		
		System.out.println("test200()....");
		
	}
	
	void test300() {
	
		System.out.println("test300()....");
	
	}
	
	private void test400() {
	
		System.out.println("test400()....");
	
	}
	//父类提供一个public方法，访问返回N4的值
	public void callGetN4() {
		test400();
	}
	
}
