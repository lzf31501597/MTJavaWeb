package com.javaTest.debug_;

import java.util.Arrays;

public class Debug04 {

	// 
	public static void main(String[] args) {
		 //演示执行到下一个断点，同时支持动态的下断点.
		int[] arr = {1, -1, 10, -20, 100};
		//我们看看 Arrays.sort 方法底层实现.->Debug
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println("arr["+i+"]=" + arr[i] +"\t");
		}
		
		System.out.println("out for........");
		
		System.out.println("hello100........");
		System.out.println("hello200........");
		System.out.println("hello300........");
		System.out.println("hello400........");
		System.out.println("hello500........");
		System.out.println("hello600........");
		System.out.println("hello700........");
		System.out.println("hello800........");

	}

}
