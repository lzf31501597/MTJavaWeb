package com.javaTest.array_;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		//1、数组的动态初始化*********************************
		double[] scores = new double[6];
		//2、数组的动态初始化*************************
		//等价于 double scores[]; 只是给数组命名了，没有分配内存。*************
		//double[] scores1; 
		//通过NEW分配内存空间。*********************
		//scores1 = new double[6]; 
		double totalScorse = 0.0;
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("请输入学生成绩");
			scores[i] = myScanner.nextDouble();
			System.out.println("scores["+i+"]=" + scores[i]);
			totalScorse += scores[i] ;			
		}
		System.out.println("总成绩=" + totalScorse 
				+ ", 平均成绩=" +totalScorse/scores.length);
		
		//遍历数组==取出数组里面吗的元素值
		System.out.println("遍历数组==取出数组里面吗的元素值");
		for(int i = 0; i < scores.length; i++) {
			System.out.println("scores["+i+"]=" + scores[i]);
		}
		
	}

}
