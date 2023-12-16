package com.itheima.servlet.demo.servletcontext_;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletContext的作用2： 读取文件File
 */
public class ServletContextGetFile extends HttpServlet {
	
	//
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//do1();
		//do2();
		do3();
	}

	//
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	//读取web项目下的文件，使用ServletContext读取
		public void do3() throws IOException {
			//使用ServletContext:读取文件File
			Properties properties = new Properties();
			
			//创建一个文件的输入流
			//InputStream is = new FileInputStream("classes/db.properties");
			//InputStream is = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");

			String path = this.getServletContext().getRealPath("/WEB-INF/classes/com/itheima/servlet/demo/db.properties");
			System.out.println(path);
			InputStream is = new FileInputStream(path);
			properties.load(is);
			
			//获取数据
			String driverClassName = properties.getProperty("driverClassName");
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			
			//输出控制台
			System.out.println(driverClassName);
			System.out.println(url);
			System.out.println(username);
			System.out.println(password);		
		}
	//读取web项目下的文件，使用ServletContext读取
	public void do2() throws IOException {
		//使用ServletContext:读取文件File
		Properties properties = new Properties();
		
		//创建一个文件的输入流(要查看tomcat发布之后，拷贝到webapp发布目录下WEB-INF的配置文件的绝对路径--)
		//InputStream is = new FileInputStream("classes/db.properties");
		InputStream is = this.getServletContext().getResourceAsStream("/WEB-INF/classes/com/itheima/servlet/demo/db.properties");
		properties.load(is);
		
		//获取数据
		String driverClassName = properties.getProperty("driverClassName");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		//输出控制台
		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);		
	}
	//传统方式:读取文件File（不好使）
	public void do1() throws IOException {
		
				Properties properties = new Properties();
				
				//创建一个文件的输入流
				InputStream is = new FileInputStream("classes/db.properties");
				properties.load(is);
				
				//获取数据
				String driverClassName = properties.getProperty("driverClassName");
				String url = properties.getProperty("url");
				String username = properties.getProperty("username");
				String password = properties.getProperty("password");
				
				//输出控制台
				System.out.println(driverClassName);
				System.out.println(url);
				System.out.println(username);
				System.out.println(password);
	}
}
