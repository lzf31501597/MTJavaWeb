package javaTest.array;

import java.util.Scanner;

public class SeqSearch2 {

	public static void main(String[] args) {
		System.out.println("二分法查找排序");
		int[] num1 = {1,8,10,89,1000,1234};
		int len = num1.length;
		int mid = (num1.length+0)/2;
		System.out.println("len="+len +", mid="+mid );
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("输入你猜的数字：");
		int inputNum = myScanner.nextInt();
		
		int index = -1;
		for(int i=0; i<len-1; i++) {
			if(inputNum == num1[i]) {  //精轮法王
				System.out.println("找到了你猜的数字："+ inputNum +", 下标为："+i);	
				index = i;
				break;
			}	 
		}
		if (index == -1) {
			System.out.println("没有找到你猜的数字："+inputNum);
			
		} 			
		
	}

}
