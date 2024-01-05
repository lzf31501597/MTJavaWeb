package com.itheima.servlet.demo.jredis;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class Jredis04 {
	
	Jedis jedis = new Jedis("127.0.0.1");
	
	public static void main(String[] args) {
		//new Jredis04().test1();
		//new Jredis04().test2();
		//new Jredis04().test3();
		new Jredis04().test4();
	}
	
	public void test1() {
		jedis.hset("user", "username", "tom");
		String values = jedis.hget("user", "username");
		System.out.println("test1()="+values);
	}
	
	public void test2() {
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("password", "321");
		hashMap.put("sex", "male");
		jedis.hmset("user", hashMap);
		
		List<String> values = jedis.hmget("user", "username", "password", "sex");
		System.out.println("test2()="+values);
	}
	
	public void test3() {
		Map<String, String> hashMap = jedis.hgetAll("user");
		for(String keyString : hashMap.keySet()) {
			System.out.println("test3()1= "+ keyString +" : "+hashMap.get(keyString));
		}
		
		Set<String> keys = jedis.hkeys("user");
		System.out.println("test3()2= "+ keys);
		
		List<String> values = jedis.hvals("user");
		System.out.println("test3()3= "+values);
	}

	public void test4() {
		
		jedis.hdel("user", "username", "password");
		Map<String, String> hashMap = jedis.hgetAll("user");
		for(String keyString : hashMap.keySet()) {
			System.out.println("test4()= "+ keyString +" : "+hashMap.get(keyString));
		}
	}
	
}
