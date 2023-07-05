package javaTest.array;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		//1、
		//String strs[] = {'a','b','c'};
		String[] strs1 = {"a","b","c"};
		//String[] strs2 = new String{"a","b","c"};
		String strs3[] = new String[]{"a","b","c"};
		//String strs4[] = new String[3]{"a","b","c"};
		
		//2、
		String foo = "blue";
		boolean[] bar = new boolean[2]; //bar[0]=false,bar[1]=false
		if(bar[0]) {
			foo = "green";
		}
		System.out.println(foo); 
		
		//3/
		int num = 1;
		while(num<10) {
			System.out.println(num); //7
			if(num>5) {
				break;
			}
			num += 2; 
		}
		
		//4-2 添加元素23，也要生序排列，
		int[] arr5= {10,12,45,90};
		int len1 = arr5.length;
		int inNum = 23;
		int index = -1;
		
		//遍历数组，并记录大于等于23的数的索引
		for(int i=0; i<len1; i++) {
			if(inNum <= arr5[i]) {
				index = i;		
				System.out.println("index="+index);
				break;
			}
		}
		//如果没有大于等于23的数，记录索引==数组的元素长度
		if(index == -1) {
			index = len1;
		}
		
		//定义比旧数组多一个元素的新数组，
		int[] arrNew = new int[len1+1];
		
		//把23插入新数组index的位置
		for(int i=0,j=0; i<len1+1; i++) {
			if(index == i) {//把23插入大于23数组元素的index位置				
				arrNew[i] = inNum;
			}else {//将其他元素依次插入，且跳过index位置
				arrNew[i] = arr5[j];
				j++;
			}
		}
		System.out.println("arrNe的元素");
		for(int j=0; j<len1+1; j++) {
			System.out.print(arrNew[j]+"\t");
		}
		
		arr5 =arrNew;
		
		System.out.println("\narr5的元素");
		for(int j=0; j<len1+1; j++) {
			System.out.print(arr5[j]+"\t");
		}
				
		//4-2
		int[] arr = {10,12,45,90};
		Scanner myScanner = new Scanner(System.in);
		int insertNum = 23;
		do {
			int len = arr.length+1;
			int[] arr2 = new int[len];
			
			for(int i=0; i<len-1; i++) {
				arr2[i] = arr[i];
			}
			
			System.out.print("请输入要插入的整数23：");
			//arr2[len-1] = insertNum; 
			arr2[len-1] = myScanner.nextInt();
			System.out.println("插入成功, 23："+arr2[len-1]);
			
			for(int j = 0; j < arr2.length; j++) {
				System.out.println("arr2["+j+"]=" + arr2[j]);
			}
			
			int numMax = 0;
			for(int j=1; j<len-1; j++) {
				for (int i=0; i<len-j; i++) {
					if(arr2[i] >= arr2[i+1]) {
						numMax = arr2[i];
						arr2[i] = arr2[i+1];
						arr2[i+1] = numMax;
					}else {
						arr2[i] = arr2[i];
						arr2[i+1] = arr2[i+1];
					}
				}
			
			}
			
			arr =arr2;
			
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[j]+"\t");
			}
		
		}while(true);
		
		
	}

}
