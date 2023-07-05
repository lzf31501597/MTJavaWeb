package javaTest.array;

import java.util.Scanner;

public class TwoDimensionalArray05 {

	public static void main(String[] args) {
		System.out.println("二维数组05");
		int arr[][] = {{4,6},{1,4,5,7},{-2}}; 
		int len = arr.length;
		int sum = 0;
		
		for(int i=0; i<len; i++) {
			for(int j=0; j<arr[i].length; j++) {//依次给一维数组赋值
				sum += arr[i][j];
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
		}
		System.out.println("sum="+sum);
	}

}
