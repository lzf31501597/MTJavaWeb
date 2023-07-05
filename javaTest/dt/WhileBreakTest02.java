package javaTest.dt;

import java.util.Scanner;

public class WhileBreakTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner = new Scanner(System.in);
		//1-判断一个数是>0,<0,=0
		while(true) {
			System.out.println("请输入一个整=");
			int num = myScanner.nextInt();
			
			if( num > 0 ){
				System.out.println("这个数>0=" + num );
			
			}else if( num < 0 ) {
				System.out.println("这个数<0=" + num );
			}else {
				System.out.println("这个数=0=" + num );
			}
		}
		
		//2-判断闰年		
		 /*for (int year = 1; year < 2023; year++) { 
			  //System.out.println("请输入一个年份=");
			  //int year = myScanner.nextInt();
		  
			  if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
				  System.out.println("这个年份是闰年=" + year );
		  
			  }else { 
				  //System.out.println("这个年份不是闰年=" + year );
				  System.out.println("这个年份不是闰年=" + year );
			  } 
		  }*/
		
		//3-水仙花数:一个三位数的百位的三次方加十位的三次方加个位的三次方等于这个三位数本身,则称这个数为水仙花数
		//153 = 1*1*1 + 3*3*3 + 5*5*5
		/*for (int i = 100; i < 1000; i++) { 
			  //int num = (int)(Math.random()*1000 + 1);
			  int a = i/100; 
			  int b = (i%100)/10; 
			  int c = (i%100)%10;
			  //System.out.println("i="+i+", a="+a+", b="+b+", c="+c );
		  
			  if(i == ( a*a*a + b*b*b + c*c*c )) { 
			  //System.out.println((i=(i/100)^3 +(i%100/10)^3 + (i/100%10)^3 )); 
				  System.out.println("这个水仙花数=" + i 
						  + ", a="+a*a*a+", b="+b*b*b+", c="+c*c*c ); 
			  } 
		 }*/
		 
		 
		  
		  //4-输出1--100之间不能被5整除的数，每五个一行
		  /*int j = 0;
		  for(int i = 1; i <= 100; i++)  {
			  if(i%5 != 0) {
				  System.out.print(i+" ");
				  j++;
					  
				  if(j % 5 ==0) {
					  System.out.println(" ");
					
				  }
			  }
		  }*/
		 
		  //5-输出A--Z,a--z
		  /*for(char i='a'; i<='z'; i++) {
			  System.out.print(i+" ");
		  }
		  System.out.println();
		  for(char i='A'; i<='Z'; i++) {
			  System.out.print(i+" ");
		  }*/
		  
		 //6、1-1/2+1/3-1/4.....1/100
		//double sum1 = 0;
		//double sum2 = 0;
		/*double sum = 0;
		for(int i = 1; i <= 100; i++) {
			//System.out.println("i="+i+", i % 2="+(i % 2));
			if(i % 2 ==0) {//隐藏条件：分子要带小数点，才能保留精度
				sum -= 1.0/i;
				//System.out.println("sum2="+1/i);
			}else if(i % 2 ==1){
				sum += 1.0/i;
				//System.out.println("sum1="+1/i);
			}
			//sum += (sum1+sum2);
			System.out.println("i="+i+", sum="+sum);
		}
		System.out.println("1-1/2+1/3-1/4.....1/100="+sum);
		*/
		
		//7-1+(1+2)+(1+2+3)+...(1+2+...+100)
		/*int summ = 0,sumn=0;
		for(int i = 1; i<= 100; i++) {
			for(int k = 1; k <= i; k++) {
				summ += k;
				System.out.println("k="+k+",和="+summ);
			}
			//System.out.println("j="+j+",和="+summ);
			
			//sumn += summ;
			
			System.out.println("i="+i+",和="+summ);
		}
		
		System.out.println("1+(1+2)+(1+2+3)+...(1+2+...+100)="+sumn);
		*/
	}
	
}		  

	


