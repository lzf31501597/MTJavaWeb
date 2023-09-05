package com.javaTest.extends_;

//模拟小学生的考试情况
public class Pupil {
	
	public String name;
	public int age;
	private double score;
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public void testing() {//和Pupil不一样
		System.out.println("小学生："+ name + " 正在考小学数学。。");
	}
	
	public void showInfo() {
		System.out.println("小学生名："+ name + " 年龄："+age+" 成绩：" +score);
	}
	
	
}
