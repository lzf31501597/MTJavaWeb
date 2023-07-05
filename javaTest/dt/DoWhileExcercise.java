package javaTest.dt;
import java.util.Scanner;
public class DoWhileExcercise {
	//Î»ÔËËã
	public static void main(String[] args) {
		
		//1��
		int i = 1;
		do {
			System.out.println("Hello000:" + i);				
			i++;
		}while( i <= 100); 

		//2
		int sum = 0;
		int i1 = 1;
		do {
			sum += i1;
			//System.out.println("Hello111:" + sum);				
			i1++;
		}while( i1 <= 100); 
		System.out.println("Hello111:" + sum);

		//3
		int i2 = 1;
		do {
			if( i2 % 5 == 0 && i2 % 3 !=0 ){
				System.out.println("Hello222:" + i2);
			}
			
			i2++;
		}while( i2 <= 200); 

		//4
		Scanner myScanner = new Scanner(System.in);
		char answer ;
		do {
			//Scanner myScanner = new Scanner(System.in);
			System.out.println("�����㻹����Ǯ��y/n:");
			answer = myScanner.next().charAt(0);
			System.out.println("�����ش���ǣ�y����Ǯ||n������Ǯ������" + answer);

			if(answer == 'y' ){
				System.out.println("�����Ѵ�Ӧ��Ǯ");
				break;						
			} else {				
				System.out.println("����Ǯ,����5����:");		
			}					
			
		}while( answer != 'y'); 
		





		
	}	
}