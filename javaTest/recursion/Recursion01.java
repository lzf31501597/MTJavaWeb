package javaTest.recursion;

public class Recursion01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DG d = new DG();
		d.test(5);
		d.test1(5);
		
		int res = d.factorial(5);
		System.out.println("res=" + res);
	}

}

class DG {
	public void test(int n) {
		if( n > 2 ) {
			test( n - 1 );
			//System.out.println("n=" + n);
		}
		System.out.println("test()n"+n+"=" + n);
	}
	
	public void test1(int n) {
		if( n > 2 ) {
			test1( n - 1 );
			System.out.println("test1(if)n=" + n);
		}else {
			System.out.println("test1(else)n"+n+"=" + n);
		}
	}
	//factorial阶乘
	public int factorial(int n) {
		if( n == 1 ) {
			System.out.println("(if)n=" + n);
			return 1;
		}else {
			System.out.println("(else)factorial( n - 1 ) * n,"+n+"=" + factorial( n - 1 ) * n);
			return factorial( n - 1 ) * n;
		}
		
	}
	
}