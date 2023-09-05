package com.javaTest.dt_;

public class WhileBreakTest02Demo {

	public static void main(String[] args) {
	//什么也不输出	
		int m = 0;
		int n = 3;	
		if( m>0 ) {
			if( n>2 ) {
				System.out.println("ok1");
			}else {
				System.out.println("ok2");
			}
		}	
		
		
		//2-判断闰年		
		 for (int year = 1; year < 2023; year++) { 
			  //System.out.println("请输入一个年份=");
			  //int year = myScanner.nextInt();
		  
			  if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
				  System.out.println("这个年份是闰年=" + year );
		  
			  }else { 
				  //System.out.println("这个年份不是闰年=" + year );
			  } 
		  }

	}

}
