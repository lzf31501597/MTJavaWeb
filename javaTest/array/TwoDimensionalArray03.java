package javaTest.array;

import java.util.Scanner;

public class TwoDimensionalArray03 {

	public static void main(String[] args) {
		System.out.println("二维数组03");
		/*
		i=0: 1
		i=0: 1 2
		i=0: 1 2 3
		*/
		
		int arr[][] = new int[3][];
		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			arr[i] = new int[i+1]; //给一维数组分配空间
			
			for(int j=0; j<arr[i].length; j++) {//依次给一维数组赋值
				arr[i][j] = i + 1;  
				//System.out.print(arr[i][j] +"\t");
			}
			//System.out.println();
		}
			
		for(int i=0; i<len; i++) {
			for(int j=0; j<arr[i].length; j++) {//依次给一维数组赋值
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
		}
	}

}
