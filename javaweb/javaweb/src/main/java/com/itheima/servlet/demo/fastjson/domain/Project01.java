package com.itheima.servlet.demo.fastjson.domain;


import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Project01 {
	
	//@JSONField(name = "编号")
	private int id;
	private String name;
	private int count;
	private double price;
	private Date ddate;
	//@JSONField(ddate = "yyyy年MM月dd日")
	
	
	public Date getDdate() {
		return ddate;
	}
	public void setDdate(Date ddate) {
		this.ddate = ddate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
