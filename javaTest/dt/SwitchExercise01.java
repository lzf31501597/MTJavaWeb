package javaTest.dt;
import java.util.Scanner;
public class SwitchExercise01 {
	//λ����
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ���ַ�a-e:");
		char c1 = myScanner.next().charAt(0);

		switch(c1){
			case 'a' :
				System.out.println("A");
				break;
			case 'b' :
				System.out.println("B");
				break;
			case 'c' :
				System.out.println("C");
				break;
			case 'd' :
				System.out.println("D");
				break;
			case 'e' :
				System.out.println("E");
				break;
			default : 
				System.out.println("other");
				break;
		}
		System.out.println("�˳�switch������ִ�г���");
	}	
}