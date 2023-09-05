package com.javaTest.debug_;

import java.util.Arrays;

public class Debug03 {
	//演示执行到下一个断点，同时支持动态的下断点.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, -1, 10, -20, 100};
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println("arr["+i+"]=" + arr[i] +"\t");
		}
		
		System.out.println("out for........");


	}

}
