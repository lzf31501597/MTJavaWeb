package javaTest.array;

import java.util.Scanner;
import java.lang.Math;

public class HomeWork03 {

	public static void main(String[] args) {
		//6、冒泡排序
		System.out.println("冒泡排序");
		int[] arr = new int[10];
		int len = arr.length;
		int ramNum = 0;
		int numMax =0;
		int counts =0;
		
		
			for (int i=0; i<len; i++) {
				ramNum = (int)(Math.random()*100+1);
				arr[i] = ramNum ;
				System.out.println("arr["+i+"]="+arr[i]);				
			}
			
			System.out.println("+++++++++1111+++++++++++++++");
			for (int i=0; i<len-1; i++) {
				for(int j=0; j<len-1-i; j++) {//每排序一次，依次减去1个元素
					if( arr[j] <= arr[j+1] ) {
						arr[j+1] = arr[j+1];
						arr[j] = arr[j];
					}else {
						numMax = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = numMax;
					}	
					
					
				}
				System.out.print("\n第"+i+"次排序:\n");
				for (int k=0; k<len; k++) {
					System.out.print(arr[k]+"\t");				
				}
				
			}
			
			System.out.println("\n冒泡排序后的数组元素");
			
		
		
		
		for (int i=0; i<len; i++) {
			System.out.print(arr[i]+"\t");				
		}
		
	}

}
