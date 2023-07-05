package javaTest.dt;
import java.util.Scanner;
public class For01 {
	//Î»ÔËËã
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����ѭ����ӡ����:");
		int c1 = myScanner.nextInt();

		for(int i=1;i<=c1;i++)  {
			System.out.println(i);
		}
		//System.out.println("i="+i);
		System.out.println("\n");

		int i=1;
		for(;i<=c1;)  {
			System.out.println(i);
			i++;
		}
		System.out.println("i="+i);
	}	
}