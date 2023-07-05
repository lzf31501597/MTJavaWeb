package javaTest.dt;
import java.util.Scanner;
public class While01 {
	//Î»ÔËËã
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		//System.out.println("����ѭ����ӡ����:");
		int c1 = myScanner.nextInt();

		int i = 1;
		while( i <= 10) {
			if( i % 3 ==0 ){
				System.out.println("Hello:" + i);
			}
			
			i++;
		}
		System.out.println("�˳�while���������");
		
		int j = 40;
		while( j <= 200) {
			if( j % 2 ==0 ){
				System.out.println("Hello:" + j);
			}
			
			j++;
		}
	}	
}