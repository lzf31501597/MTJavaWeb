package com.javaTest.dt_;
import java.util.Scanner;
public class SwitchExercise02 {
	//λ����
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("������ɼ�����:");
		int c1 = myScanner.nextInt();

		if(( c1 >= 0 && c1 <= 100 )) {
			switch(c1/60){
				case 0 :
					System.out.println("���ϸ�");
					break;
				case 1 :
					System.out.println("�ϸ�");
					break;
				default : 
					System.out.println("����ɼ�������1-100֮�䣡��");
					break;
			}
			
		} else {
			System.out.println("����ɼ�������1-100֮�䣡");
		}
		System.out.println("�˳�switch������ִ�г���");
	}	
}