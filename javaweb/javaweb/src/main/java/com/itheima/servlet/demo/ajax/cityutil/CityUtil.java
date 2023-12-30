package com.itheima.servlet.demo.ajax.cityutil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CityUtil {

	private static final Map<String, String> citys = new HashMap<String, String>();
	static {
		citys.put("黑龙江", "哈尔滨,大庆,齐齐哈尔");
		citys.put("吉林", "长春,吉林,四平");
		citys.put("辽宁", "沈阳,大连,葫芦岛");
	}
	
	public static String getProvince() {
		Set<String> set = citys.keySet();
		String provinces = "";
		for (String p: set) {
			provinces += p + ",";
		}
		return provinces.substring(0, provinces.length() -1);
	}
	public static String getCitys(String provincename) {
		return citys.get(provincename);
	}
}
