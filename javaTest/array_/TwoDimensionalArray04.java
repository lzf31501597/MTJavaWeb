package com.javaTest.array_;

public class TwoDimensionalArray04 {

	public static void main(String[] args) {
		System.out.println("二维数组04");
		int arr[][] = {{1,1,1},{8,8,9},{100}}; //100要加{}，否则报错cannot convert from int to int[]
		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			for(int j=0; j<arr[i].length; j++) {//依次给一维数组赋值
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
		}
	}

}
