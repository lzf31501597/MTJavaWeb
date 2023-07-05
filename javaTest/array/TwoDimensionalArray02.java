package javaTest.array;

import java.util.Scanner;

public class TwoDimensionalArray02 {

	public static void main(String[] args) {
		System.out.println("二维数组02");
		int[][] num1 = new int[2][3];//定义了一个2行3列的数组
		
		int arr[][];
		arr = new int[2][3];
		
		int len = num1.length;
		
		System.out.println("len="+len );
		
		num1[1][2]=5;
		
		for(int i=0; i<len; i++) {
			for(int j=0; j<num1[i].length; j++) {
				System.out.print(num1[i][j] +"\t");
			}
			System.out.println();
		}
			
		
	}

}
