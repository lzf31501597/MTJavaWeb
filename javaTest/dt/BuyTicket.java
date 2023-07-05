package javaTest.dt;
import java.util.Scanner;
public class BuyTicket {
	//λ����
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�����뵱ǰ�·�:");
		int mouth1 = myScanner.nextInt();
		
		if ( (4 <= mouth1 && mouth1 <= 10) ) { 
			System.out.println("����������++++++++++++");
			
			System.out.println("�������������:");
			int age = myScanner.nextInt();

			if ((18 <= age && age <= 60 )) {
				System.out.println("���ǳ��ˣ�Ʊ��Ϊ60Ԫ");
			} else if ((1 <= age && age < 18) ){
				System.out.println("���Ƕ�ͯ��Ʊ��Ϊ���30Ԫ");
			} else if (age > 60){
				System.out.println("�������ˣ�Ʊ��1/3Ϊ20Ԫ");
			} else {
				System.out.println("��������ȷ������:");
			}

		} else if ( ((1 <= mouth1 && mouth1 <= 3) || (11 <= mouth1 && mouth1 <= 12 ))){
			System.out.println("�����ǵ���++++++++++++++");
			System.out.println("�������������:");
			int age = myScanner.nextInt();

			if ((18 <= age && age<=60 )) {
				System.out.println("���ǳ��ˣ�Ʊ��Ϊ40Ԫ");
			} else if ( ((1 <= age && age< 18) || age > 60)){
				System.out.println("���Ƕ�ͯ�����ˣ�Ʊ��Ϊ20Ԫ");
			} else {
				System.out.println("��������ȷ������:");
			}	
		} else {
				System.out.println("��������ȷ���·�:");
			}
		
	}
}