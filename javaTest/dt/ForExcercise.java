package javaTest.dt;
import java.util.Scanner;
public class ForExcercise {
	//Î»ÔËËã
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����ѭ����ӡ����1-100:");
		int end = myScanner.nextInt();
		int sum =0;
		int counts=0;
		int start = 1;
		System.out.println("����������:");
		int t = myScanner.nextInt();
		for(int i = start; i <= end; i++)  {
			if( i % t == 0 ) {
				counts++;
				System.out.println("i="+i+" counts="+counts);
				
				sum= sum + i;
				
			}
		}
		System.out.println("����counts="+counts);
		System.out.println("�ܺ�sum="+sum);

		for(int i=0,l=5;i<=5;i++,l--) {
			System.out.println(i+" + "+l+" = "+(i+l));
			
		}

	}	
}