package com.javaTest.array_;

import java.util.Scanner;

public class ArrayAdd01 {

	public static void main(String[] args) {
		System.out.println("整数扩容");
		int[] arr = {11,22,33};
		
		Scanner myScanner = new Scanner(System.in);
		
		do {
			int len = arr.length + 1;
			int[] arr2 = new int[len];
			
			//这是看完视频编写的代码
			for(int i = 0; i < len-1; i++) {
				arr2[i] = arr[i];
				System.out.println("arr2["+i+"]=" + arr2[i]);
			}
			
			System.out.println("请输入要输入的整数"); 
			arr2[len-1] = myScanner.nextInt();
			System.out.println("添加成功, arr2["+(len-1)+"]=" + arr2[len-1]);
			
			for(int j = 0; j < arr2.length; j++) {
				System.out.println("arr2["+j+"]=" + arr2[j]);
			}
			arr = arr2;
			for(int k = 0; k < arr.length; k++) {
				System.out.println("arr["+k+"]=" + arr[k]);
			}
			
			System.out.println("是否需要继续添加，输入y/n:");
			char c1 = myScanner.next().charAt(0);
			
			if(c1 == 'y') {
				 continue;
		    }else { 
		    	for(int k = 0; k < arr.length; k++) {
					System.out.println("arr["+k+"]=" + arr[k]);
				}
		    	break; 
		    	
		    } 
			
			
			
			
			/*//这是自己思考编写的代码
			 * for(int i = 0; i < len; i++) { if(i < len-1) { arr2[i] = arr[i];
			 * System.out.println("arr2["+i+"]=" + arr2[i]); }else if(i==len-1) {
			 * 
			 * System.out.println("请输入要输入的整数"); arr2[i] = myScanner.nextInt();
			 * 
			 * System.out.println("添加成功, arr2["+i+"]=" + arr2[i]);
			 * System.out.println("是否需要继续添加，输入y/n:"); char c1 = myScanner.next().charAt(0);
			 * 
			 * if(c1 == 'y') {
			 * 
			 * continue; }else { return; } }
			 * 
			 * }
			 
			for(int j = 0; j < arr2.length; j++) {
				System.out.println("arr2["+j+"]=" + arr2[j]);
			}
			arr = arr2;
			for(int k = 0; k < arr.length; k++) {
				System.out.println("arr["+k+"]=" + arr[k]);
			}*/
		}while(true);
	}

}
