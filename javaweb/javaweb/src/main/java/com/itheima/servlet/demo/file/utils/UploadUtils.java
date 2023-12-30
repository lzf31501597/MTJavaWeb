package com.itheima.servlet.demo.file.utils;

import java.io.DataOutput;
import java.util.UUID;

public class UploadUtils {
	
	//传递一个文件名，返回一个唯一的文件名
	public static String getUuidFilename(String filename) {
		//在Java中的API中有一个类UUID可以生产生随机的字符串 
		int index = filename.lastIndexOf(".");
		String extetion = filename.substring(index);
		return UUID.randomUUID().toString().replace("-", "")+extetion;//获取文件名的扩展名
		
	}
	//目录分离的算法实现
	public static String getRealPath(String uuidFilename) {
		int code1 = uuidFilename.hashCode();
		int d1 = code1 & 0xf;
		int code2 = code1 >>> 4;
		int d2 = code2 & 0xf;
		return "/"+d1+"/"+d2;
	}
	
	
//	public static void main(String[] args) {
//		//在Java中的API中有一个类UUID可以生产生随机的字符串 
//		System.out.println(UUID.randomUUID().toString().replace("-", ""));//获取文件名的扩展名
//		//int index = f
//		String string = getUuidFilename("aa.txt");
//		System.out.println(string);
//	}
}
