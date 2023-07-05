package javaTest.array;

import java.lang.reflect.Array;

public class ArrayCopy {

	public static void main(String[] args) {
		//整数型是值传递/值拷贝
		int n1 = 10;
		int n2 = n1;
		
		System.out.println("n1=" + n1);
		System.out.println("n2=" + n2);
		
		//数组在默认情况下是引用传递，赋的值是地址*******************
		int[] arr1 = {1,2,3};
		int[] arr2 = arr1; 
		arr2[0] = 10;
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr1["+i+"]=" + arr1[i]);
		}
		
		for(int i = 0; i < arr2.length; i++) {
			  System.out.println("arr2["+i+"]=" +
		  arr2[i]); 
		}
		 
		
	}

}
