package javaTest.dt;

public class TernaryOperator {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 99;
		int result = a > b ? a++ : b--; //һ���ʦ
		System.out.println("result=" + result);
		System.out.println("a=" + a);
  		System.out.println("b=" + b);

		int result2 = a < b ? a++ : b--; //һ���ʦ
		System.out.println("result2=" + result2);
		System.out.println("a=" + a);
  		System.out.println("b=" + b);

//result=99
//a=10
//b=98
//result2=10
//a=11
//b=98
	}
}