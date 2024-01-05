package com.itheima.servlet.demo.jredis;

import redis.clients.jedis.Jedis;

public class Jredis01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Jedis jedis = new Jedis("192.168.1.55");		
		Jedis jedis = new Jedis("127.0.0.1");
		//jedis.auth("admin");
		jedis.set("foo", "bar");
		jedis.set("foo1", "bar1");
		String value = jedis.get("foo");
		String value1 = jedis.get("foo1");
		System.out.println(value);
		System.out.println(value1);
	}

}
