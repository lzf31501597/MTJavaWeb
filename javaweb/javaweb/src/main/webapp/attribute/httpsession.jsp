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
	session.setAttribute("name", "aaa");//添加属性
	session.setAttribute("name", "bbb");//添加属性
	session.removeAttribute("name");//移除属性
%>
</body>
</html>