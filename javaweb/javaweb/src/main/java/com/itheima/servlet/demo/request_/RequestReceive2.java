package com.itheima.servlet.demo.request_;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * request接收中文数据 post方式接收中文
 */
public class RequestReceive2 extends HttpServlet {

	// get方式接收中文
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 接收用户
		//request.setCharacterEncoding("UTF-8");//无效
		/**
		 * 产生乱码的原因：
		 * 	get方式：提交的数据，在请求行的url后面，在地址栏上其实就已经进行了一次URL的编码了。
		 * 解决方案： 将request的缓存区中的值以ISO-8859-1编码形式取出来，再以UTF-8方式解码
		 */
		String name = request.getParameter("username");
//		String encode = URLEncoder.encode(name, "ISO-8859-1");
//		String decode = URLDecoder.decode(encode, "UTF-8");
//		System.out.println("get用户:" + decode);
		
		String namString = new String(name.getBytes("ISO-8859-1"), "UTF-8");
		System.out.println("get用户:" + namString);
		
	}

	// post方式接收中文
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//接收数据
		/**
		 * 产生乱码的原因：
		 * 	post方式：提交的数据是在请求体中，request对象接受到的数据之后，放入request的缓存区中。
		 * 缓存区就有编码（默认 ISO-8859-1：不支持中文）
		 * 解决方案： 修改request的缓存区的编码为UTF-8
		 */
		// 接收用户
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("username");
		System.out.println("post用户:" + name);
}

}
