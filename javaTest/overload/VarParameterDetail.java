package javaTest.overload;

public class VarParameterDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T t = new T();
		int[] max = {2,5,3,6,9,7,1};
		int len = t.f1(max);
		System.out.println("main。f1().lenth=" + len);
		
		int len1 = t.f1("aho", max);
		System.out.println("T。f1(11).lenth=" + len1);
	}

}

class T {
	//三个方法名称相容，功能相同，参数个数不通--》使用可变参数优化
	//可变参数的实参可以为0，也可以多个
	
	public int f1(int... a) {
		
		return a.length;		
	}
	//可变参数的形参可以和普通类型的参数放在通才疏列表，但是可变参数的形参必须放到最后  
	//一个形参列表里面只能出现一个可变参数*********
	/*
	 * public int f2(int... a, int...b) {
	 * 
	 * return a.length; }
	 */
	String b = null;
	public int  f1(String b, int... a) {
		this.b = b;
		System.out.println("T。f1(String b, int... a).b=" + b);
		return a.length;		
	}
}
