package com.javaTest.modifier_;

public class Aa {
	
	//四个属性，分别使用不同的访问修饰符来访问
	public int n1 = 100;
	protected int n2 = 200;
	int n3 = 300;
	private int n4 = 400;
	
	public void m1() {
		//该方法可以访问 四个属性
		//同包同类下，可以访问public protected 默认  private修饰属性和方法
		System.out.println("m1() n1=" + n1 + " ,n2=" + n2 + " ,n3=" + n3 + " ,n4=" + n4);
		m4();
		
	}
	
	protected void m2() {
		System.out.println("m2() n1=" + n1 + " ,n2=" + n2 + " ,n3=" + n3 + " ,n4=" + n4);
	}
	void m3() {
		System.out.println("m3()  n1=" + n1 + " ,n2=" + n2 + " ,n3=" + n3 + " ,n4=" + n4);
	}
	private void m4() {
		System.out.println("m4() n1=" + n1 + " ,n2=" + n2 + " ,n3=" + n3 + " ,n4=" + n4);
	}
	

}
