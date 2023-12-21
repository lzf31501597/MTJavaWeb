<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>您已经登录成功，欢迎：${ existUser.username }</h2>
<h2>您已经登录成功，欢迎：${ existUser.getUsername() }</h2>
<a href="${ pageContext.request.contextPath }/filter_jsp/sub.jsp">提交数据</a>
</body>
</html>