package com.itheima.servlet.demo.filter_;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter03 implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Filter03 过滤器delete了。。。");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("Filter03 过滤器被执行了。。。");
		arg2.doFilter(arg0, arg1);
		System.out.println("Filter03 过滤器被执行结束了了。。。");

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Filter03 过滤器cteate了。。。");
	}

}
