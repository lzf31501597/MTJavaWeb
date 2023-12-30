package com.itheima.servlet.demo.fastjson.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.itheima.servlet.demo.fastjson.domain.City;
import com.itheima.servlet.demo.fastjson.domain.Province;
import com.thoughtworks.xstream.XStream;

/**
 * Servlet implementation class CityServlet
 */
public class CityServlet01 extends HttpServlet {
	
	private Map<Province, List<City>> map;
	
	@Override
	public void init() {
		map = new HashMap<Province, List<City>>();
		
		Province p1 = new Province();
		p1.setId(1);
		p1.setName("黑龙江");
		
		City c11 = new City();
		c11.setId(1);
		c11.setName("哈尔滨");
		
		City c12 = new City();
		c12.setId(2);
		c12.setName("大庆");
		
		List<City> list1 = new ArrayList<City>();
		list1.add(c11);
		list1.add(c12);
		map.put(p1, list1);
		
		Province p2 = new Province();
		p2.setId(2);
		p2.setName("吉林");
		
		City c21 = new City();
		c21.setId(1);
		c21.setName("长春");
		
		City c22 = new City();
		c22.setId(2);
		c22.setName("吉林");
		
		List<City> list2 = new ArrayList<City>();
		list2.add(c21);
		list2.add(c22);
		map.put(p2, list2);
		
		Province p3 = new Province();
		p3.setId(3);
		p3.setName("辽宁");
		
		City c31 = new City();
		c31.setId(1);
		c31.setName("沈阳");
		
		City c32 = new City();
		c32.setId(2);
		c32.setName("大连");
		
		List<City> list3 = new ArrayList<City>();
		list3.add(c31);
		list3.add(c32);
		map.put(p3, list3);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("utf-8");
		//method
		String method = request.getParameter("method");
		if ("pro".equals(method)) {
			Set<Province> pnames = map.keySet();
			String json = JSONObject.toJSONString(pnames);
			response.getWriter().write(json);
			
		} 
		//city
		if ("city".equals(method)) {
			String pname = request.getParameter("pname");
			
			for(Province p : map.keySet()) {
				if (pname.equals(p.getName())) {
					List<City> list = map.get(p);
					String json = JSONObject.toJSONString(list);
					response.getWriter().write(json);
					break;
				}
			}
		}
		
		//xml
		if ("xml".equals(method)) {
			XStream xStream = new XStream();
			String xml = xStream.toXML(map);
			response.getWriter().write(xml);
			
		}
		System.out.println(method);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
