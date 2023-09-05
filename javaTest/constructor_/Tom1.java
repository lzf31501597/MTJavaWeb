package com.javaTest.constructor_;

import java.util.Random;
import java.util.Scanner;

public class Tom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tom1 t = new Tom1();
		System.out.println("\n请出拳：0-石头,1-剪刀,2-布:");
		t.p012();
	}

	String shitou = "石头";
	String jiandao = "剪刀";
	String bu = "布";
	int n = 0;

	public int random1() {
		// while(true) {

		Random r = new Random();
		// return (int)(Math.random())*2;
		return r.nextInt(3);
		// }

	}

	public String print(int n) {

		switch (n) {
		case 0:
			return this.shitou;

		case 1:
			return this.jiandao;

		case 2:
			return this.bu;

		default:
			return "";

		}

	}

	/**
	 * 
	 */
	public void p012() {

		int tomCounts = 0;
		int comCounts = 0;
		int pingCounts = 0;
		int noCounts = 0;

		while (true) {

			Scanner sc = new Scanner(System.in);
			// System.out.println("\n请出拳：0-石头,1-剪刀,2-布:");

			int n2 = sc.nextInt();
			String t1 = print(n2);

			int n1 = random1();
			String t2 = print(n1);

			if (((t1.equals(this.shitou) && t2.equals(this.jiandao)) 
					|| (t1.equals(this.jiandao) && t2.equals(this.bu))
					|| (t1.equals(this.bu) && t2.equals(this.shitou)))) {

				tomCounts++;
				System.out.println("Tom赢了" + tomCounts + "次,Tom出的：" + t1 + " , 电脑出的：" + t2);
				//return tomCounts;

			} else if (((t2.equals(this.shitou) && t1.equals(this.jiandao))
					|| (t2.equals(this.jiandao) && t1.equals(this.bu))
					|| (t2.equals(this.bu) && t1.equals(this.shitou)))) {

				comCounts++;
				System.out.println("电脑赢了" + comCounts + "次,Tom出的：" + t1 + " , 电脑出的：" + t2);
				//return comCounts;

			} else if (((t2.equals(this.shitou) && t1.equals(this.shitou))
					|| (t2.equals(this.jiandao) && t1.equals(this.jiandao))
					|| (t2.equals(this.bu) && t1.equals(this.bu)))) {

				pingCounts++;
				System.out.println("平了" + pingCounts + "次,Tom出的：" + t1 + " , 电脑出的：" + t2);
				//return pingCounts;

			} else if (t1 == null || t2 == null || t1 == "" || t2 == "") {

				noCounts++;
				System.out.println("Tom没出拳" + noCounts + "次,Tom出的：" + t1 + " , 电脑出的：" + t2);
				//return noCounts;

			} 
			
			
			/*
				 * else {
				 * 
				 * counts4++; System.out.println("其他了"+counts4 +"次,Tom出的："+ t1 + " , 电脑出的：" +
				 * t2);
				 * 
				 * }
				 */
				 

		}

	}
}
