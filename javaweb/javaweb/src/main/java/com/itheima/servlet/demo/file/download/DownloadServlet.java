package com.itheima.servlet.demo.file.download;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.servlet.demo.file.utils.DownloadUtils;

/**
 * Servlet 文件下载
 */
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.接收参数
		String filename = new String(request.getParameter("filename").getBytes("ISO-8859-1"), "UTF-8");
		//Content-Type,Content-Disposition
		String type = getServletContext().getMimeType(filename);
		response.setContentType(type);
		
		String path = getServletContext().getRealPath("/download");
		File file = new File(path +"/"+ filename);
		//判断浏览器的类型
		String agent =  request.getHeader("User-Agent");
		if (agent.contains("Firefox")) {
			filename = DownloadUtils.base64EncodeFileName(filename);
		} else {
			URLEncoder.encode(filename, "Utf-8");
		}
		response.setHeader("Content-Disposition", "attachment;filename="+filename);
		//设置一个代表了文件的输入流
		InputStream is = new FileInputStream(file);
		OutputStream os = response.getOutputStream();
		
		int len = 0;
		byte[] b = new byte[1024];
		while ((len = is.read(b)) != -1) {
			os.write(b, 0, len);
			
		}
		is.close();
		os.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
