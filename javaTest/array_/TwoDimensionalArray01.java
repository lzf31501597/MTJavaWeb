package com.javaTest.array_;

import java.util.Scanner;

public class TwoDimensionalArray01 {

	public static void main(String[] args) {
		System.out.println("二维数组01");
		int[][] num1 = {{0,0,0,0,0,0},{0,0,1,0,0,0},{0,2,0,3,0,0},{0,0,2,0,2,0}};
		int len = num1.length;
		
		System.out.println("len="+len );
		
		Scanner myScanner = new Scanner(System.in);
		
		for(int i=0; i<len; i++) {
			//System.out.println("lenn="+num1[i].length );
			for(int j=0; j<num1[i].length; j++) {
				//System.out.print("num1["+i+"]["+j+"]"+ num1[i][j] +", 下标为："+"["+i+"]["+j+"]");
				System.out.print(num1[i][j] +"\t");
			}
			System.out.println();
		}
			
		
	}

}
