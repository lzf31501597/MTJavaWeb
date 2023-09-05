package com.javaTest.dt_;
import java.lang.Math;
public class Break01 {
	
	public static void main(String[] args) {
		int counts = 1;
		int randomNum = 0;
		while(true){
			randomNum = (int)(Math.random()*1000 + 1); 
			//System.out.println("���ǵ�"+counts+"�������=" + randomNum);
			
			if(randomNum == 977){
				System.out.println("���ǵ�"+counts+"�������while=977");
				break;
			}
			counts++;
		}

		do{
			randomNum = (int)(Math.random()*1000 + 1); 
			//System.out.println("���ǵ�"+counts+"�������=" + randomNum);
			
			if(randomNum == 977){
				System.out.println("���ǵ�"+counts+"�������do_while=977");
				break;
			}
			counts++;
		}while(randomNum != 977);

		for (int i = 1; i >= 1; i++){
			randomNum = (int)(Math.random()*1000 + 1); 
			//System.out.println("���ǵ�"+counts+"�������=" + randomNum);
			
			if(randomNum == 977){
				System.out.println("���ǵ�"+counts+"�������for=977");
				break;
			}
			counts++;
		}
		
	}	
}