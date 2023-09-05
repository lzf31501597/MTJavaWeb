package com.javaTest.dt_;
import java.util.Scanner;
public class IfExercise02 {
	//λ����
	public static void main(String[] args) {
		double n1 = 33.5; 
		double n2 = 2.6; 
		if(n1 > 10 && n2 <20.0){
			System.out.println(n1 + n2);
		}

		int num1 = 10;
		int num2 = 5; //5  6
		int sum = num1 + num2;
		if(sum % 3 == 0 && sum % 5 == 0){
			System.out.println("���ܱ�3��5��������");
		}else{
			System.out.println("�Ͳ��ܱ�3��5��������");
		}

		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������:");
		int year = myScanner.nextInt();

		if((year % 4 == 0 || year % 100 != 0) && year % 400 == 0){
			System.out.println(year + "�������ꡣ");
		}else{
			System.out.println(year + "�겻�����ꡣ");
		}
	}
}