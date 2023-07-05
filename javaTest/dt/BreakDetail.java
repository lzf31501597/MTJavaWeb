package javaTest.dt;
import java.util.Scanner;
import java.lang.Math;
public class BreakDetail {
	
	public static void main(String[] args) {
		int counts = 1;
		int randomNum = 0;
		
		label1:
		for (int i = 1; i < 4; i++){ 

		label2:	
			for (int j = 1; j < 10; j++){ 
			
			
				if(j == 5){
					
					break label2;
				}
				System.out.println("���ǵ�"+i+"�������=" + i);
			}
		}
		
	}	
}