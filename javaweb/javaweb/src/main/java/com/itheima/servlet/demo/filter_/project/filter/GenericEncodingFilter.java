package com.itheima.servlet.demo.filter_.project.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * 通用字符集增强过滤器
 */
public class GenericEncodingFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 在过滤器中增强request对象，并将增强后的request对象传递给Servlet
		HttpServletRequest request2 = (HttpServletRequest) request;
		//调用增强resquest
		MyHttpServletRequest request3 = new MyHttpServletRequest(request2);
		chain.doFilter(request3, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

}
