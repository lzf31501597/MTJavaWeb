package com.itheima.servlet.demo.response_;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet  Response响应中文处理
 */
public class ResponseCode extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//dog1(response);
		dog2(response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	// 使用字符流的方式输出中文
	private void dog2(HttpServletResponse response) throws IOException {
		// 设置浏览器默认打开的时候采用的字符集
		response.setHeader("Content-Type", "text/html; charset=UTF-8");
		// 设置response获得字符流的缓冲区的编码
		response.setCharacterEncoding("UTF-8");
		// 设置中文转成字节数组字符集编码
		//sos.write("中文".getBytes());
		response.getWriter().println("中文汉字");		
	}
	
	// 使用字节流的方式输出中文
	private void dog1(HttpServletResponse response) throws IOException {
		// 使用字节流的方式输出中文
		ServletOutputStream sos = response.getOutputStream();
		// 设置浏览器默认打开的时候采用的字符集
		response.setHeader("Content-Type", "text/html; charset=UTF-8");
		// 设置中文转成字节数组字符集编码
		//sos.write("中文".getBytes());
		sos.write("中文".getBytes("UTF-8"));		
	}

}
