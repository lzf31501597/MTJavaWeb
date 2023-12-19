package com.itheima.servlet.demo.cookies;



import javax.servlet.http.Cookie;

/**
 * 查找指定名称Cookie的工具类
 */
public class CookieUtils {
	
	public static Cookie findCookie(Cookie[] cookies, String name) {
		
		if (cookies == null) {
			// 浏览器没有携带任何的cookie
			return null;
		} else {
			for (Cookie cookie : cookies) {
				// 判断数组中的每个cookie的名称与给定名称是否一致
				if (name.equals(cookie.getName())) {
					return cookie; // 直接返回
				}
			}
			// 浏览器带有cookie过来了，但是没有指定名称的那个cookie
			return null;
		}
	}
       
    


}
