package javaTest.overload;

public class OverLoad01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator mc = new MyCalculator();
		
		int num1 = mc.calculator(2, 3);
		System.out.println("num1=" + num1);
		
		double num2 = mc.calculator(3.0, 2);
		System.out.println("num2=" + num2);
		
		double num3 = mc.calculator(3, 5.0);
		System.out.println("num3=" + num3);
		
		double num4 = mc.calculator(3, 3.3, 8);
		System.out.println("num4=" + num4);
		
	}

}

class MyCalculator {
	//对calculator()构成了重载
	public int calculator(int n1, int n2) {
		System.out.println("MyCalculator。calculator(int n1, int n2)");
		return n1 + n2 ;
	}
	
	public double calculator(double n1, int n2) {
		System.out.println("MyCalculator。calculator(double n1, int n2)");
		return n1 + n2;
	}
	
	public double calculator(int n1, double n2) {
		System.out.println("MyCalculator。calculator(int n1, double n2)");
		return n1 + n2;
	}
	
	public double calculator(int n1, double n2, int n3) {
		System.out.println("MyCalculator。calculator(int n1, double n2, int n3)");
		return n1 + n2 + n3;
	}
}