package com.javaTest.overload_;

public class OverLoadExercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods m = new Methods();
		
		int n1 = m.m(5);
		System.out.println("main(,)n1=" + n1);
		
		int n2 = m.m(5,6);
		System.out.println("main(,)n2=" + n2);
		
		String n3 = m.m("xiaoyuer");
		System.out.println("main(,)n2=" + n3);
		
		int max11 = m.max1(2, 3);
		System.out.println("max11=" + max11);
		
		double max12 = m.max1(2.0, 3.0);
		System.out.println("max12=" + max12);
		
		double max13 = m.max1(4.0, 3.0, 5.0);
		System.out.println("max13=" + max13);
		
		int max1 = m.max(2, 3);
		System.out.println("max1=" + max1);
		
		double max2 = m.max(2.0, 3.0);
		System.out.println("max2=" + max2);
		
		double max3 = m.max(4.0, 3.0, 5.0);
		System.out.println("max3=" + max3);
	}

}

class Methods {
	//m
	public int m(int a) {
		System.out.println("Methods.m(int a)======");
		return a * a;
	}
	
	public int m(int a, int b) {
		System.out.println("Methods.m(int a, int b)======");
		return a * b;
	}

	public String m(String a) {
		System.out.println("Methods.m(String a)======");
		return a;
	}
	//max
	public int max1(int a, int b) {
		return a > b ? a : b;		
	}
	public double max1(double a, double b) {
		return a > b ? a : b;	
	}
	public double max1(double a, double b, double c) {
		double max = a > b ? a : b;
		return max > c ? max : c ;
	}
	
	
	public int max(int a, int b) {
		if( a > b ) {
			return a;			
		}else {
			return b;
		}
	}
	
	public double max(double a, double b) {
		if( a > b ) {
			return a;			
		}else {
			return b;
		}
	}
	
	public double max(double a, double b, double c) {
		if( a > b && a > c ) {
			return a;			
		}else if( b > a && b > c){
			return b;
		}else if( c > a && c > b) {
			return c;
		}else {
			return a=b=c;
		}
	}
}