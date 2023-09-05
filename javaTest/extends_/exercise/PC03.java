package com.javaTest.extends_.exercise;

public class PC03 extends Computer03{
	private String brand;
	
	public PC03(String cpu, int mem, int device, String brand) {
		super(cpu, mem, device);
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void printInfo() {
		System.out.println("PC的信息：" );
		//
		System.out.println("内存：" + getCpu() + " ,内存：" + getMem() 
				+" ，磁盘：" + getDevice()+ " ,品牌：" + getBrand() );
		//System.out.println(getDetails() + "品牌：" + getBrand() );
	}

	


	
	
}
