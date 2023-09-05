package com.javaTest.array_;

import java.lang.Math;

public class HomeWork02 {

	public static void main(String[] args) {
		//5、
		int[] arr = new int[10];
		int len = arr.length;
		int ramNum = 0;
		int counts = 0;
		int numMax = 0;
		int maxIndex = -1;
		int temp = 0;
		int sum = 0;
		int avgNum = 0;
		int index = -1;
		
		
			
			for (int i=0; i<len; i++) {
				ramNum = (int)(Math.random()*100+1);
				arr[i] = ramNum ;
				System.out.println("arr["+i+"]="+arr[i]);
				counts++;
				
			}
			System.out.println("\n正序打印数组元素");
			//正序打印数组元素
			for (int i=0; i<len; i++) {
				System.out.print(arr[i] +"\t");
			}
			System.out.println("\n逆序打印数组元素");
			//逆序打印数组元素
			for (int i=len-1; i>=0; i--) {
				System.out.print(arr[i] +"\t");
			}
			
			for (int i=0; i<len-1; i++) {
				sum += arr[i];
				if(arr[i] < arr[i+1]) {
					numMax = arr[i+1];
					maxIndex = i+1;
				}
				
				if(arr[i]==8) {
					System.out.println("\n有数=8：arr["+i+"]"+arr[i]);
					index = 1;
				}
				//System.out.print(arr[i] +"\t");
			}
			
			//
			System.out.println("\n和="+sum +", 平均数="+sum/len 
					+", 最大值="+numMax+", 且它的下标="+maxIndex);
			
			
			if(index == -1) {
				System.out.println("没有数=8");
				
			}
			
			//System.out.println("\n++++++++++++++++++++++++");
			for (int i=1; i<len; i++) {
				for(int j=0; j<len-i; j++) {
					if( arr[j] <= arr[j+1] ) {
						temp = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = temp;
					}else {
						arr[j+1] = arr[j+1];
						arr[j] = arr[j];
					}					
				}
				//System.out.print(arr[i] +"\t");
			}
			System.out.println("\n+++++++++++++逆序排列数组元素+++++++++++");
			
			for (int i=0; i<len; i++) {
				System.out.print(arr[i] +"\t");
			}
			
			for (int i=1; i<len; i++) {
				for(int j=0; j<len-i; j++) {
					if( arr[j] >= arr[j+1] ) {
						temp = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = temp;
					}else {
						arr[j+1] = arr[j+1];
						arr[j] = arr[j];
					}					
				}
				//System.out.print(arr[i] +"\t");
			}
			System.out.println("\n+++++++++++++顺序排列数组元素+++++++++++");
			for (int i=0; i<len; i++) {
				System.out.print(arr[i] +"\t");
			}
		
		
	}

}
