package com.javaTest.smallChangeSys.homeWork.homeWork09;

public class Point {
	
	private double x;
	private double y;
	
	
	public Point(double x, double y) {
		//super();
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public String printPoint() {
		return x + ", " + y;
		
	}
	
	
}
