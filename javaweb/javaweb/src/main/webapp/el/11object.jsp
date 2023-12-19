<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>获取Web开发常用的对象</h1>
<%
	pageContext.setAttribute("name", "value");
	pageContext.setAttribute("hobby", "football");
	pageContext.setAttribute("hobby", "basketball");
	
%>
${ param.name }<br/> <!-- request.getParameter("name"); -->
${ paramValues.hobby[0] }<br/>${ paramValues.hobby[1] }<br/> <!-- request.getParameterValues("hobby"); -->
${ header["User-Agent"] }<br/>
${ cookie.key.value }<br/>
${ initParam.username }<br/>

${ pageContext.request.servletContext.contextPath }<br/>
${ pageContext.request.servletContext.serverInfo }<br/>
${ pageContext.session.servletContext.sessionCookieConfig }<br/>

</body>
</html>