package com.javaTest.array_;

import java.util.Scanner;

public class ArrayExercise {

	public static void main(String[] args) {
		//1- A--Z
		char az[] = new char[26];
		for(char i = 0; i < az.length; i++) {
			az[i] += ('A'+i);
			System.out.println("az["+ i +"]=" + az[i]);
		}
		
		//2-int{4,-1,9,10,23}
		int num[] = {4,-1,9,10,23};
		int maxNum = 0;
		for(int i=1; i<num.length; i++) {
			if(num[i] > num[i-1] ) {
				maxNum = num[i];
				System.out.println("maxNum"+ i +"]=" + maxNum);
			}else {
				maxNum = num[i-1];
				System.out.println("maxNum"+ (i-1) +"]=" + maxNum);
			}
			
		}
		
		//3-求养鸡场的鸡数组和和平均值
		int len = 6;
		double hens[] = new double[len];
		Scanner myScanner = new Scanner(System.in);
		double totalWeight = 0.0;
		
		for(int i=0; i<hens.length; i++) {
			System.out.println("请输入单只鸡的重量：");
			hens[i] = myScanner.nextDouble();
			totalWeight += hens[i];
		}
		
		System.out.println("鸡的总重量=" + totalWeight+", 鸡的平均重量="+ totalWeight/hens.length);
	}

}
