package com.javaTest.dt_;
import java.util.Scanner;

public class If03 {
	//λ����
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������÷�:");
		int grade = myScanner.nextInt();
		
		if (grade >= 1 && grade <= 100) {
			if (grade == 100) {
				System.out.println("���ü���");
			} else if (grade > 80 && grade <=99) {
				System.out.println("��������");
			} else if (grade >= 60 && grade <=80) {
				System.out.println("����һ��");
			} else {
				System.out.println("���ò�����");
			} 
		} else {
			System.out.println("������1-100֮������÷֣���������:");
		}
		
	}
}