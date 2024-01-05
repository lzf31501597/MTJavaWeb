package com.itheima.servlet.demo.jredis;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class Jredis05 {
	
	Jedis jedis = new Jedis("127.0.0.1");
	
	public static void main(String[] args) {
		//new Jredis05().test1();
		//new Jredis05().test2();
		new Jredis05().test3();
		new Jredis05().test4();
		new Jredis05().test5();
	}
	
	public void test1() {
		jedis.sadd("languages", "java", "c++", "ruby", "python");
		Set<String> keys = jedis.smembers("languages");
		System.out.println("test1()= "+keys);
	}
	
	public void test2() {
		jedis.srem("languages", "java");
		Set<String> keys = jedis.smembers("languages");
		System.out.println("test2()= "+keys);
	}
	
	public void test3() {//差集
		jedis.sadd("languages1", "java", "c++", "ruby", "python", "php");
		jedis.sadd("languages2",  "ios",  "C#", "ruby", "andriod", "php");
		
		Set<String> sdiffs = jedis.sdiff("languages1", "languages2");
		
		System.out.println("test3()= " + sdiffs);
	}

	public void test4() {//交集
		
		jedis.sadd("languages1", "java", "c++", "ruby", "python", "php");
		jedis.sadd("languages2",  "ios",  "C#", "ruby", "andriod", "php");
		
		Set<String> sinters = jedis.sinter("languages1", "languages2");
		
		System.out.println("test4()= " + sinters);
	}
	
	public void test5() {//并集
		
		jedis.sadd("languages1", "java", "c++", "ruby", "python", "php");
		jedis.sadd("languages2",  "ios",  "C#", "ruby", "andriod", "php");
		
		Set<String> sunions = jedis.sunion("languages1", "languages2");
		
		System.out.println("test5()= " + sunions);
	}
	
}
