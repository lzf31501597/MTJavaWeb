<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true" buffer="8kb" autoFlush="true"
	errorPage="/jsp/error.jsp" isELIgnored="true"   
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//session.getAttribute(arg0);
	List list = new ArrayList();
	int t = 1/0;
%>
${ msg }
	<h1>JSP的注释</h1>
	<!-- JSP的注释 -->
	<%
		// 单行注释
		
		/*
			多行注释
		*/
		
		/**
			多行注释
		*/
	%>
</body>
</html>