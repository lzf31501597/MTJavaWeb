package javaTest.dt;

public class AssignOperator {
	
	public static void main(String[] args) {
		int n1 = 10;
		n1 += 4; //n1 = n1 + 4;
		System.out.println(n1);

		n1 /= 3 ;
		System.out.println(n1);

		n1 %= 3;
		System.out.println(n1);

		//符合复制运算符会进行类型转换
		byte b = 3;
		b += 2; //b = (byte)(b + 2);
		System.out.println("b=" + b);
		b++; //b = (byte)(b + 1);
		System.out.println("b2=" + b);
	}
}