package com.javaTest.dt_;
import java.util.Scanner;

public class If0102 {
	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������������䣺");

		int age = myScanner.nextInt();

		if ( age > 18) {
			System.out.println("�������>18�꣬Ҫ���Լ�����ο���𣬰����������");
		}else{
			System.out.println("������䲻����ηŹ�����");
		}

		System.out.println("���������");
	}
}