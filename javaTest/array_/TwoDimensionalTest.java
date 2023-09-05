package com.javaTest.array_;

public class TwoDimensionalTest {

	public static void main(String[] args) {
		System.out.println("杨辉三角");
		int[] x = new int[5];
		int[][] y = new int[5][];
		
		//System.out.println("x[0]=y:" +(x[0]=y)); //cannot convert from int[][] to int
		System.out.println("y[0]=x:" +(y[0]=x)); //[I@58ceff1
		//System.out.println("y[0][0]=x:" +(y[0][0]=x)); //cannot convert from int[] to int
		//System.out.println("x[0][0]=y:" +(x[0][0]=y)); //The type of the expression must be an array type but it resolved to int
		System.out.println("y[0][0]=x[0]:" +(y[0][0]=x[0])); //0
		//System.out.println("x=y:" +(x=y)); //cannot convert from int[][] to int[]
		
		
		
	}

}
