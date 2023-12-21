package com.itheima.servlet.demo.filter_.project.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.connector.Request;

import com.itheima.servlet.demo.filter_.project.domain.User;

/**
 * 权限验证的过滤器
 */

public class PrivilegeFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// 判断用户是否一键登录过了。如果已经登录就放行，否则就返回到登录页面。
		HttpServletRequest httpServletRequest = (HttpServletRequest) arg0;
		User existUser = (User) httpServletRequest.getSession().getAttribute("existuser");
		//判断
		if (existUser == null) {
			//已经登录
			arg2.doFilter(arg0, arg1);
		}else {
			
			//没有登录
			httpServletRequest.setAttribute("msg", "您还没有登陆！没有权限访问！");
			httpServletRequest.getRequestDispatcher("/filter/login.jsp").forward(arg0, arg1);
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
