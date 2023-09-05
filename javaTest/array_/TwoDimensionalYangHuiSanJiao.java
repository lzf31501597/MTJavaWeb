package com.javaTest.array_;

public class TwoDimensionalYangHuiSanJiao {

	public static void main(String[] args) {
		System.out.println("杨辉三角");
		//int arr[][] = new int[10][]; 
		//int[][] arr = new int[10][]; 
		int[] arr[] = new int[10][]; 
		int len = arr.length;
		
		
		for(int i=0; i<len; i++) {
			arr[i] = new int[i+1];
			for(int j=0; j<arr[i].length; j++) {//依次给一维数组赋值
				if(j==0 || j== arr[i].length-1) {
					arr[i][j] = 1;					
				}else {
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				 	
				}
			}
			
		}
		
		for(int i=0; i<len; i++) {
			for(int j=0; j<arr[i].length; j++) {//依次给一维数组赋值
				System.out.print(arr[i][j] +"\t");
				
			}
			System.out.println();
		}
	}

}
