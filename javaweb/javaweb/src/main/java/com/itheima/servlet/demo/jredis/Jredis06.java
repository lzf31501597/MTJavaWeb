package com.itheima.servlet.demo.jredis;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

public class Jredis06 {
	
	Jedis jedis = new Jedis("127.0.0.1");
	
	public static void main(String[] args) {
		//new Jredis06().test1();
		//new Jredis06().test2();
		//new Jredis06().test3();
		new Jredis06().test4();
		//new Jredis06().test5();
	}
	
	public void test1() {
		Map<String, Double> hMap = new HashMap<String, Double>();
		hMap.put("张三", 70.0);
		hMap.put("李四", 80.0);
		hMap.put("王五", 60.0);
		hMap.put("周六", 90.0);

		jedis.zadd("zkey",hMap);
		Set<String> keys = jedis.zrange("zkey", 0, -1);
		System.out.println("test1()= "+keys);
		
		Set<String> keys1 =jedis.zrangeByScore("zkey", 70.0, 90.0);
		System.out.println("test1()= "+keys1);
	}
	
	public void test2() {
		Map<String, Double> hMap = new HashMap<String, Double>();
		hMap.put("张三", 70.0);
		hMap.put("李四", 80.0);
		hMap.put("王五", 60.0);
		hMap.put("周六", 90.0);
		jedis.zadd("zkey",hMap);
		
		Set<Tuple> keys = jedis.zrangeWithScores("zkey", 0, -1);
		System.out.println("test2()= "+keys);
	}
	
	public void test3() {//由低向高排序分数
		Map<String, Double> hMap = new HashMap<String, Double>();
		hMap.put("张三", 70.0);
		hMap.put("李四", 80.0);
		hMap.put("王五", 60.0);
		hMap.put("周六", 90.0);
		jedis.zadd("zkey",hMap);
		
		Long numLong = jedis.zrank("zkey", "周六");
		
		System.out.println("test3()= " + numLong);
	}

	public void test4() {//交集
		Map<String, Double> hMap = new HashMap<String, Double>();
		hMap.put("张三", 70.0);
		hMap.put("李四", 80.0);
		hMap.put("王五", 60.0);
		hMap.put("周六", 90.0);
		jedis.zadd("zkey",hMap);
		Double zscore = jedis.zscore("zkey","张三");
		
		System.out.println("test4()= " + zscore);
	}
	
	
}
