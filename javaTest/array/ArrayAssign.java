package javaTest.array;

import java.lang.reflect.Array;

public class ArrayAssign {

	public static void main(String[] args) {
		//数组在默认情况下是引用传递，赋的值是地址*******************
		int[] arr1 = {10,20,30};
		int[] arr2 = new int[arr1.length]; 
		
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			System.out.println("arr2["+i+"]=" + arr2[i]);
		}
		arr2[0] = 100;
		
		for(int i = 0; i < arr1.length; i++) {
			  System.out.println("arr1["+i+"]=" + arr1[i]); 
		}
		for(int i = 0; i < arr2.length; i++) {
			  System.out.println("arr2["+i+"]=" + arr2[i]); 
		} 
		
	}

}
