package com.javaTest.constructor_;

public class HomeWork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1。。A01
		System.out.println("//1。。A01-----------------");
		A a1 = new A();
		int max = a1.max(9, 8);
		System.out.println("max=" + max);
		
		//2.。A02
		System.out.println("\n//2.。A02----------------");
		A a2 = new A();
		String str1 = "5555";
		String[] str = {"123","asd","rfv","5555"};
		int i = a2.find(str,str1);
		if(i != -1) {
			System.out.println("arr[i]=" + i);
		}
		
		//3..Book
		System.out.println("\n//3..Book----------------");
		Book b = new Book("天龙八部", 300);
		b.info();
		b.UpdatePrice();
		
		b.info();
		b.UpdatePrice(200);
		b.info();
		b.UpdatePrice(110);
		b.info();
		b.UpdatePrice(90);
		b.info();
		
		//4..A03--copyArr
		System.out.println("\n//4..A03--copyArr-----------------");
		int[] oldArr = {1,9,6,2,8,10};
		A a3 = new A();
		int[] newArr = a3.copyArr(oldArr);
		for(int i1=0; i1 < newArr.length; i1++) {
			System.out.print(newArr[i1] + " ");;
		}
		
		//5..Circle
		System.out.println("\n \n//5..Circle-----------------");
		Circle c = new Circle(5);
		double yuanmianji = c.SCircular_area();
		System.out.println("yuanmianji=" + yuanmianji);
		double yuanzhouchang = c.Circumference();
		System.out.println("yuanzhouchang=" + yuanzhouchang);
		
		//6..Cale
		System.out.println("\n //6..Cale----------------");
		Cale cale = new Cale(4,0);
		double cale1 = cale.plus();
		System.out.println("cale1和=" + cale1);
		double cale2 = cale.mminus();
		System.out.println("cale2差=" + cale2);
		double cale3 = cale.multiply();
		System.out.println("cale3乘积=" + cale3);
		//double cale4 = cale.mod(8.0, 0);//cale4商=Infinity
		Double cale4 = cale.mod();
		if(cale4 != null) {
			System.out.println("cale4商=" + cale4);
		}else {
			System.out.println("除数不能为零！！！ ");
		}
		
	}

}

class A{
	
	public int max(int a, int b) {
		return a > b ? a : b;
	}
	
	public int find(String[] arr,String str) {
		
		int i = -1;
		for(i = 0; i < arr.length; i++) {
			if(arr[i].equals(str)) {
				//System.out.println(arr[i]+"=arr["+i+"]=" + i);
				return i;
			} /*
				 * else { //System.out.println("arr[i]= -1"); return i; }
				 */
		}
		return i;		
	}
	
	public int[] copyArr(int[] oldArr) {
		
		int[] newArr = new int[oldArr.length];
		if( oldArr != null ) {
			for(int i=0; i < oldArr.length; i++) {
				newArr[i] = oldArr[i];
			}
		}else {
			System.out.println("数组不能为空");
		}
		return newArr;
		
	}
	
	
	
}

class Book{
	
	String name;
	double price;
	
	public Book(String name,double price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("书名：" + this.name + ", 价格："+this.price);
	}
	
	public void UpdatePrice() {
		
		if(this.price >= 150) {
			this.price = 150;
		}else if(this.price >= 100 && this.price < 150){
			this.price = 100;
		}else if(this.price > 0 && this.price < 100){
			this.price = this.price;
		}
		
	}
	
	public void UpdatePrice(double price) {
		
		if(price >= 150) {
			this.price = 150;
		}else if(price >= 100 && price < 150){
			this.price = 100;
		}else if(price > 0 && price < 100){
			this.price = price;
		}
		
	}
}

class Circle {
	//radius--半径
	double radius;
	//double p = 3.14;
	double p = Math.PI;
	
	public Circle(double radius) {
		
		this.radius = radius;
		
	}
	
	//圆周长--Circular_area
	public double SCircular_area() {
		
		double SCircular_area = p * radius * radius;
		return SCircular_area;
		
	}
	//Circumference--圆周长 
	public double Circumference() {
		
		double Circumference = 2 * p * radius;
		return Circumference;
		
	}
	
}	

class Cale{
	
	double a;
	double b;
	public Cale(double a, double b) {
		this.a = a;
		this.b = b;
	}
	//+ sum
	public double plus() {
		return a + b;
	}
	//- minus
	public double mminus() {
		return a - b;
	}
	//* multiply mul
	public double multiply() {
		return a * b;
	}
	//  / div
	//public double mod() {
	public Double mod() {
		if(b == 0) {
			System.out.println("除数不能为零:" + b);
			return null;
		}
		return a / b;
	}
		
}

	
