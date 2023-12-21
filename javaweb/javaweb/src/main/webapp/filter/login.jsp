<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>登录页面</h1>
<h1><font color="red">${ msg }</font></h1>
<form action="${ pageContext.request.contextPath }/UserServlet" method="post">
<%-- <form action="/javaweb/UserServlet" method="post"> --%>
	<table border="1" >
		<tr>
			<td>用户名</td>
			<td><input type="text" name="username"/></td>
		</tr>
		<tr>
			<td>密码</td>
			<td><input type="password" name="password"/></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="登录"/></td>
		</tr>
	</table>
</form>
</body>
</html>