package com.javaTest.dt_;
import java.util.Scanner;
public class SwitchExercise03 {
	//λ����
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("������鿴���·�:");
		int c1 = myScanner.nextInt();

		if(( c1 >= 1 && c1 <= 12 )) {
			switch(c1){
				
				case 3 :
				case 4 :
				case 5 :
					System.out.println("����");
					break;

				case 6 :
				case 7 :
				case 8 :
					System.out.println("�ļ�");
					break;
				case 9:
				case 10:
				case 11 :
					System.out.println("�＾");
					break;

				case 12:
				case 1:
				case 2 :
					System.out.println("����");
					break;

				default : 
					System.out.println("�����·�Ҫ��1-12֮�䣡��");
					break;
			}
			
		} else {
			System.out.println("�����·�Ҫ��1-12֮�䣡");
		}
		System.out.println("�˳�switch������ִ�г���");
	}	
}