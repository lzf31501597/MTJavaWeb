package com.itheima.servlet.demo.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.itheima.servlet.demo.file.utils.UploadUtils;


public class UploadServlet extends HttpServlet {

	/**
	 *
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			// 1.创建磁盘文件工厂
			DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
			// 2.创建一个核心的解析类
			ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
			// 3.利用核心类解析Request，解析后会得到多个部分，返回一个集合。List集合装的是每一个部分的内容（FileItem文件项）
			List<FileItem> list = servletFileUpload.parseRequest((RequestContext) req);
			// 4.遍历List集合，会得到代表每个部分的文件项的对象。根据文件判断是否是文件上传。
			for (FileItem fileItem : list) {
				//判断这个文件项是否是普通项还是文件上传
				if (fileItem.isFormField()) {//文件项
					//接收普通项的值（接收值不能使用 request.getParameter()）
					//获取普通项的名称
					String name = fileItem.getFieldName();
					//获取普通项的值
					String value = fileItem.getString("UTF-8");
					System.out.println(name + " - " + value);
					
				} else {//文件上传
					//获取文件上传的文件名称
					String filename = fileItem.getName();
					System.out.println("文件名："+filename);
					int index = filename.lastIndexOf("\\");
					if (index != -1) {
						filename = filename.substring(index+1);
					}
					
					//得到唯一文件名
					String uuidFilename = UploadUtils.getUuidFilename(filename);
					
					
					//获取文件上传的数据
					InputStream iStream =fileItem.getInputStream();
					//获取文件上传的路径：磁盘绝对路径
					String  realPath= getServletContext().getRealPath("/upload");
					
					// 进行目录分离
					String path = UploadUtils.getRealPath(uuidFilename);
					String newpath = realPath + path;
					File file = new File(newpath);
					if (!file.exists()) {
						file.mkdirs();
					}
					
					//创建一个输出流，写入到设置的路径中
				    OutputStream oStream = new FileOutputStream(newpath+"/"+uuidFilename);
					//两个流对接
				    int len =0;
				    byte[] bytes = new byte[1024];
				    while ((len = iStream.read(bytes)) != -1) {
						oStream.write(bytes, 0, len);
						
					}
				    
				    oStream.close();
				    iStream.close();
				}
				
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
