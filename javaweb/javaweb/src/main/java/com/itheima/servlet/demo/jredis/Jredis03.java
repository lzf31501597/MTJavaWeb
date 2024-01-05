package com.itheima.servlet.demo.jredis;


import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.ListPosition;

public class Jredis03 {
	
	public Jedis jedis = new Jedis("127.0.0.1");
	
	public static void main(String[] args) {
		//new Jredis03().test1();
		//new Jredis03().test2();
		//new Jredis03().test3();
		new Jredis03().test4();
	}
	
	public void test1() {
		jedis.lpush("names", "tom","james","张三","李四");
		List<String> values = jedis.lrange("names", 0, -1);
		System.out.println(values);
	}
	
	public void test2() {
		
		jedis.lset("names", 1, "王五");
		List<String> values = jedis.lrange("names", 0, -1);
		System.out.println(values);
		
		String value = jedis.lindex("names", 1);
		System.out.println(value);
	}
	
	public void test3() {
		
		jedis.linsert("names", ListPosition.BEFORE, "james", "fff");
		List<String> values = jedis.lrange("names", 0, -1);
		System.out.println(values);
	}

	public void test4() {
		
		jedis.lrem("names", 1, "tom");
		List<String> values = jedis.lrange("names", 0, -1);
		System.out.println(values);
	}
	
}
