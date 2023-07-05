package javaTest.dt;

public class TernaryOperatorExercise {
	
	public static void main(String[] args) {
		//运算符优先级
		//1) . () {} ,
		//2) 单目运算符 ++ -- ~ !(date type)
		//3）算术运算符 * / % + -
		//4）位移运算符 << >> >>>
		//5）比较运算符 < > <= >= instanceof == !=
		//6）逻辑运算符 & ^ | && || 
		//7）三元运算符 ? :
		//8）赋值运算符 = *= /= %= += -= <<= >>= >>>= &= ^= |=
		int a = 55;
		int b = 33;
		int c = 123;
		int max1 = a > b ? a : b; //Ò»Õæ´óÊ¦
		int max2 = max1 > c ? max1 : c;
		System.out.println("max1=" + max1);
		System.out.println("max2=" + max2);

		//一条语句，推荐使用上面的方法
		int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		System.out.println("max=" + max);
		//max1=55
		//max2=123
		//max=123

		int abcclass = 10;
		int n = 22;
		int N = 55;
		System.out.println("n=" + n);
		System.out.println("N=" + N);

		int abc = 100;
		int aBc = 200;
		System.out.println("abc=" + abc);
		System.out.println("aBc=" + aBc);
		//1-ok 2-ok 3-no 4-no 5-no 6-ok 7-no 8-no 9-no 10-no 11-no 12-n0 13-ok
		//int goto= 
	}
}