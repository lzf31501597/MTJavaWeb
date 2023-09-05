package com.javaTest.dt_;

public class DoWhile01 {
	//Î»ÔËËã
	public static void main(String[] args) {
		
		//Scanner myScanner = new Scanner(System.in);
		//System.out.println("����ѭ����ӡ����:");
		//int c1 = myScanner.nextInt();

		int i = 1;
		do {
			if( i % 3 ==0 ){
				System.out.println("Hello:" + i);
			}
			
			i++;
		}while( i <= 10); 
		System.out.println("�˳�do..while���������");
	}	
}