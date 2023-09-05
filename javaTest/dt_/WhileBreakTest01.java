package com.javaTest.dt_;

public class WhileBreakTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cash = 100000;
		int counts = 0;
		
		while(true) {
			if(cash > 50000) {
				cash -= cash * 0.05;
				counts++;
				//System.out.println("这是cash > 50000,第" + counts + "次经过路口收费,还剩多钱=" + cash);
			}else if(cash <=50000) {
				cash -= 1000;
				counts++;
				//System.out.println("这是cash <=50000,第" + counts + "次经过路口收费,还剩多钱=" + cash);
				if(cash < 1000) {
					break;
				}
			}
			System.out.println("这是第" + counts + "次经过路口收费,还剩多钱=" + cash);
			
		}
		
	}

}
