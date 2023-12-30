<%@page import="java.util.LinkedList"%>
<%@page import="java.util.Queue"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>树形遍历</h1>
<%
	//1. 创建一个队列
	Queue<File> queue = new LinkedList<File>();
    //2.先将根结点入队
	File root = new File("/download");
	queue.offer(root);
	while(!queue.isEmpty()){
		//将根节点出对
		File file = queue.poll();
		//获取根结点下的所有字节点
		File[] files = file.listFiles();
		//遍历所有子节点
		for(File f: files){
			//判断该节点是否为叶子结点
			if(f.isFile()){
%>	
	<h4><a href="#"><%= f.getName() %></a></h4>
<%			
			}else{
				queue.offer(f);
			}
		}
	}
%>
</body>
</html>