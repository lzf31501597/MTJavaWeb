package com.javaTest.extends_.supperr;

public class B extends A {
	
	public int n1 = 888;
	
	//测试super访问的父类或爷爷类的Base类的属性和方法
	public void test() {
		//super的访问不限于直接父类，如果爷爷类和本类中有同名的成员，
		//   也可以使用supper去访问爷爷类的成员；
		//	如果多个基类（上级类）中都有同名的成员，使用super访问遵循就近原则。  A->B->C
		System.out.println("super.n1="+super.n1);
		super.cal();
		
	}
	//super的访问不限于直接父类，如果爷爷类和本类中有同名的成员，
	//   也可以使用supper去访问爷爷类的成员；
	//	如果多个基类（上级类）中都有同名的成员，使用super访问遵循就近原则。  A->B->C
	
	
	
	//访问父类的属性 , 但不能访问父类的 private 属性 [案例]super.属性名 
	public void hi() {
		System.out.println("n1="+super.n1 + " ,n2=" + super.n2 + " ,n3=" + super.n3 ); 
	}
	
	//访问父类的方法，不能访问父类的 private 方法 super.方法名(参数列表); 
	public void ok() {
		super.test100();
		super.test200();
		super.test300(); 
		//super.test400();//不能访问父类 private 方法
	}
	//访问父类的构造器(这点前面用过):super(参数列表);只能放在构造器的第一句，只能出现一句! 
	public B() {
		//super(); 
		//super("jack", 10); 
		super("jack");
	}

	public void sum() {
		System.out.println("B 类的 sum() 方法...");
		//希望调用父类A类的cal方法：有三类方式
		//一，找cal方法：cal()和this.cal()步骤流程
		//1，现在本类找，如果有，则调用。
		//2，如果没有，则找父类（如果有，且可以调用，则调用）
		//3，如果父类没有，则继续找父类的父类，（整个查找方法的规则如上所述，直至找到object类）
		//提示：查找方法的过程中，
		//	1，如果找到了，且不能访问，则报错。
		//	2，没有找到，则提示方法不存在
		    
		//cal();//
		this.cal();//等价cal（）
		
		//二，找cal方法：super.cal();的顺序是直接查找父类，其他规则都一样
		//super.cal();
		
		//演示访问属性的规则
		//n1 和 this.n1
		//1，现在本类找，如果有，则调用。
		//2，如果没有，则找父类（如果有，且可以调用，则调用）
		//3，如果父类没有，则继续找父类的父类，（整个查找方法的规则如上所述，直至找到object类）
		//提示：查找属性的过程中，
		//	1，如果找到了，且不能访问，则报错:cannot access。
		//	2，没有找到，则提示属性不存在 
				
		System.out.println("n1="+n1);
		System.out.println("this.n1="+this.n1);
		
		//找n1方法：super.n1;的顺序是直接查找父类，其他规则都一样
		//super.n1;
		System.out.println("super.n1="+super.n1);
	}
	
//	public void cal() {
//		System.out.println("B 类的 cal() 方法...");
//	}
	
	
}
