package javaTest.dt;
import java.util.Scanner;
public class MulFor {
	
	public static void main(String[] args) {
		
		//Scanner myScanner = new Scanner(System.in);
		//System.out.println("����ѭ����ӡ����:");
		//int c1 = myScanner.nextInt();

		for(int i=1;i<=5;i++)  {
			for(int j=1;j<=5;j++)  {
				System.out.println("i="+i+" j="+j);	
				
				if(i==5 && j==5){
					System.out.println("i*j="+i*j);
				}
			}
			
		}
		
	}	
}