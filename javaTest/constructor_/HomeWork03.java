package com.javaTest.constructor_;

import java.util.Random;
import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		
		//Circle1 PassObject  13
		System.out.println("\n////Circle1 PassObject  13-----------------");
		Circle1 c = new Circle1();
		PassObject po = new PassObject();
		po.printAreas(c, 5);

		//Tom 0 1 2  14
		System.out.println("\n////Circle1 PassObject  13-----------------");
		Tom t = new Tom();
		System.out.println("\n请出拳：0-石头,1-剪刀,2-布:");	
		t.p012();
	}

}

class Circle1 {
	
	double radius;
	double p = Math.PI;
	
	public Circle1() {//double radius) {
		//this.radius = radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double finaAreas() {
		
		return p * this.radius * this.radius;
		
	}
	
}

class PassObject {
	
	public void printAreas(Circle1 c1,int times) {
		
		System.out.println("Radius\tArea");
		for(int i = 1; i <= times; i++) {			
			c1.setRadius(i);//设置每个原的半径的值
			System.out.println(c1.radius + "\t" + c1.finaAreas());
			
		}
		
	}
	
}

class Tom {
	
	String shitou = "石头";
	String jiandao = "剪刀";
	String bu = "布";
	int n = 0;
	public int random1() {
		//while(true) {

			Random r = new Random();
			//return (int)(Math.random())*2;
			return r.nextInt(3);
		//}
		
		
	}
	
	public String print(int n) {
		
		switch( n ) {
			case 0 :
				return this.shitou;
				
			case 1 :
				return this.jiandao;
				
			case 2 :
				return this.bu;
				
			default:
				return "";
				
		}
		
	}
	
	public void p012(){
		
		int counts = 0;	
		int counts1 = 0;
		int counts2 = 0;	
		int counts3 = 0;
		int counts4 = 0;
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			//System.out.println("\n请出拳：0-石头,1-剪刀,2-布:");		
			
			int n2 = sc.nextInt();
			String t1 = print(n2);
			
			int n1 = random1();
			String t2 = print(n1);
			
			
			if((t1.equals(this.shitou) && t2.equals(this.jiandao))
					|| (t1.equals(this.jiandao) && t2.equals(this.bu))
					|| (t1.equals(this.bu) && t2.equals(shitou))) {
				
				counts++;
				System.out.println("Tom赢了"+counts +"次,Tom出的：" + t1 + " , 电脑出的：" + t2);
				
			}else if((t2.equals(this.shitou) && t1.equals(this.jiandao))
					|| (t2.equals(this.jiandao) && t1.equals(this.bu))
					|| (t2.equals(this.bu) && t1.equals(shitou))) {
				
				counts1++;
				System.out.println("电脑赢了"+counts1 +"次,Tom出的："+ t1 + " , 电脑出的：" + t2);
				
			}else if((t2.equals(this.shitou) && t1.equals(this.shitou))
					|| (t2.equals(this.jiandao) && t1.equals(this.jiandao))
					|| (t2.equals(this.bu) && t1.equals(bu))){
				
				counts2++;
				System.out.println("平了"+counts2 +"次,Tom出的："+ t1 + " , 电脑出的：" + t2);
				
			}else if(t1==null || t2==null || t1=="" || t2==""){
				
				counts3++;
				System.out.println("Tom没出拳"+counts3 +"次,Tom出的："+ t1 + " , 电脑出的：" + t2);
				
			} /*
				 * else { counts4++; System.out.println("其他了"+counts4 +"次,Tom出的："+ t1 +
				 * " , 电脑出的：" + t2); }
				 */
		
		}
		
	}
	
}