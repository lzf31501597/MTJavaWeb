<%@page import="com.itheima.servlet.demo.listener.javabean.BindingBean01"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	BindingBean01 bean1 = new BindingBean01();
	bean1.setName("king james");
	session.setAttribute("bean1", bean1);
%>
</body>
</html>