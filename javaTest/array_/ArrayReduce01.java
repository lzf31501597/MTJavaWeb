package com.javaTest.array_;

import java.util.Scanner;

public class ArrayReduce01 {

	public static void main(String[] args) {
		System.out.println("数组缩容");
		int[] arr = {11,22,33,44,55,66};
		
		Scanner myScanner = new Scanner(System.in);
		
		do {
			for(int k = 0; k < arr.length; k++) {
				System.out.println("arr["+k+"]=" + arr[k]);
			}
			
			int len = arr.length - 1;
			int[] arr2 = new int[len];
			
			//这是看完视频编写的代码
			for(int i = 0; i < len; i++) {
				arr2[i] = arr[i];
				System.out.println("arr2["+i+"]=" + arr2[i]);
			}
			
			/*
			 * for(int j = 0; j < len; j++) { System.out.println("arr2["+j+"]=" + arr2[j]);
			 * }
			 */
			arr = arr2;
			for(int k = 0; k < arr.length; k++) {
				System.out.println("arr["+k+"]=" + arr[k]);
			}
			
			if(arr.length+1 == 1) {
				System.out.println("不能再缩减元素值了"); 
				break;
		    }
			
			System.out.println("请选择是否好药缩容y/n："); 
			char c1 = myScanner.next().charAt(0);
			
			if(c1 == 'y') {
				 continue;
		    }else { 
		    	for(int k = 0; k < arr.length; k++) {
					System.out.println("arr["+k+"]=" + arr[k]);
				}
		    	break; 
		    	
		    } 
			
			
		}while(true);
	}

}
