package javaTest.dt;
import java.util.Scanner;
public class ForDetail {
	//Î»ÔËËã
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����ѭ����ӡ����:");
		int c1 = myScanner.nextInt();

		for(int i=0,j=0;i<=c1;i++,j+=2)  {
			System.out.println("i="+i+" j="+j);
		}
		
	}	
}