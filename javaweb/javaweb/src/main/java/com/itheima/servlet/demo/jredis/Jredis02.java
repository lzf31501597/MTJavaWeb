package com.itheima.servlet.demo.jredis;


import java.util.List;

import redis.clients.jedis.Jedis;

public class Jredis02 {
	
	static Jedis jedis = new Jedis("127.0.0.1");
	
	public static void main(String[] args) {
		//test1();
		test2();
		//test3();
	}
	
	
	public static void test1() {
		jedis.set("username", "tom");
		String value = jedis.get("username");
		System.out.println(value);
	}
	
	
	public static void test2() {
		
		jedis.mset("password", "123", "age", "20");
		List<String> values = jedis.mget("username", "password", "age");
		System.out.println(values);
	}
	
	
	public static void test3() {
		
//		jedis.append("username", " is boy");
//		String value = jedis.get("username");
//		System.out.println(value);
		
		jedis.setrange("username", 7, "girl");
		String value1 = jedis.get("username");
		System.out.println(value1);
	}
	
}
