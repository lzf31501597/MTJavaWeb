package com.itheima.servlet.demo.filter_;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter04 implements Filter {

	@Override
	public void destroy() {
		// 获得过滤器的名称
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
//		System.out.println("Filter04 过滤器被执行了。。。");
//		arg2.doFilter(arg0, arg1);
//		System.out.println("Filter04 过滤器被执行结束了了。。。");

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// 获得过滤器的名称
		String fString = arg0.getFilterName();
		System.out.println(fString);
		String name = arg0.getInitParameter("username");
		String pwd = arg0.getInitParameter("password");
		System.out.println(name+" - "+pwd);
		
		Enumeration<String> names = arg0.getInitParameterNames();
		while(names.hasMoreElements()) {
			String name1 = names.nextElement();
			String value = arg0.getInitParameter(name1);
			System.out.println(name1+" - "+value);
		}
	}

}
