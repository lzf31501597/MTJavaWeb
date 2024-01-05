package com.itheima.servlet.demo.jredis;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

public class Jredis07 {
	
	Jedis jedis = new Jedis("127.0.0.1");
	
	public static void main(String[] args) {
		//new Jredis07().test1();
		//new Jredis07().test2();
		new Jredis07().test3();
		//new Jredis07().test4();
		//new Jredis07().test5();
	}
	
	public void test1() {
		Set<String> keys = jedis.keys("*");
		System.out.println("test1()= "+keys);
		
	}
	
	public void test2() {
		Long del = jedis.del("user");
		System.out.println("test2()= "+del);
	}
	
	public void test3() {//由低向高排序分数
//		jedis.expire("username", 200);//设置生命周期为200
		jedis.persist("username");
		Long del = jedis.ttl("username");//获取生命周期
		System.out.println("test3()= "+del);
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
	
	public void test5() {//并集
		
		jedis.sadd("languages1", "java", "c++", "ruby", "python", "php");
		jedis.sadd("languages2",  "ios",  "C#", "ruby", "andriod", "php");
		
		Set<String> sunions = jedis.sunion("languages1", "languages2");
		
		System.out.println("test5()= " + sunions);
	}
	
}
