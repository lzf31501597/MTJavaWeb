<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>filter02</h1>
<%
    //System.out.println("filter02.jsp被执行了。。。");
	response.getWriter().println("filter02被执行了...");
%>
<jsp:forward page="/filter/filter03.jsp"></jsp:forward>
</body>
</html>