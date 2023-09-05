package com.javaTest.dt_;
import java.util.Scanner;
public class NestedIf {
	//λ����
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������ĵ÷�:");
		double score = myScanner.nextDouble();

		if ( score > 8.0 ) { 

			System.out.println("���Ѿ�������");
			System.out.println("����������Ա�:");
			char gender = myScanner.next().charAt(0);

			if (gender == '男') {
				System.out.println("�������Ž���������");
			} else if(gender == 'Ů') {
				System.out.println("�������Ž���Ů����");
			} else {
				System.out.println("��������Ա𳬳�����֪");
			}

		} else {
			System.out.println("������̭��");
		}
		
	}
}