package com.itheima.servlet.demo.fastjson.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.naming.java.javaURLContextFactory;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.itheima.servlet.demo.fastjson.domain.Project01;

public class JsonTest {
	
	
	//将一个project对象转换成json
	//Project オブジェクトをJSON形式に変換するには、JSONライブラリを使用します
	
	public void test1(){
		Project01 project01 = new Project01();
		project01.setId(1);
		project01.setName("television");
		project01.setCount(200);
		project01.setPrice(1500);
		project01.setDdate(new Date());
		
		SerializeFilter filter = new SerializeFilter() {
			public boolean apply(java.lang.Object arg0, java.lang.Object arg1, java.lang.Object arg2 ) {
				System.out.println(arg0); //类名
				System.out.println(arg1); //属性名
				System.out.println(arg2); //属性值
				
				if ("id".equals(arg1)) {
					return false;
				}
				
				return true;
				
			}
		};//---可以简化,可以指定属性值
		SerializeFilter filter1 = new SimplePropertyPreFilter("count", "name", "price", "ddate");
		
		
		//2.使用fastjson讲 project01 转换成JSON数据
		String json = JSONObject.toJSONString(project01, filter1);
		System.out.println("json");
	}
	public void test2(){
		Project01 project01 = new Project01();
		project01.setId(1);
		project01.setName("television");
		project01.setCount(200);
		project01.setPrice(1500);
		
		Project01 project02 = new Project01();
		project02.setId(2);
		project02.setName("xiyiji");
		project02.setCount(200);
		project02.setPrice(1500);
		
		List<Project01> list = new ArrayList();
		list.add(project02);
		list.add(project01);
		
		//2.使用fastjson讲 project01 转换成JSON数据
		String json = JSONObject.toJSONString(list);
		System.out.println("json");
	}
	//使用fastjson将 project01 转换成JSON时循环使用
	public void test3(){
		Project01 project01 = new Project01();
		project01.setId(1);
		project01.setName("television");
		project01.setCount(200);
		project01.setPrice(1500);
		
		List<Project01> list = new ArrayList();
		list.add(project01);
		list.add(project01);
		list.add(project01);
		
		//2.使用fastjson讲 project01 转换成JSON数据
		String json = JSONObject.toJSONString(list, SerializerFeature.DisableCircularReferenceDetect);
		System.out.println("json");
	}
}
