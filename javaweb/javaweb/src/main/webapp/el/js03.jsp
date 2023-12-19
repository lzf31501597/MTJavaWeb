<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EL执行运算</h1>
	<h3>算术运算</h3>
	<% 
		pageContext.setAttribute("n1", "10");
		pageContext.setAttribute("n2", "30");
		pageContext.setAttribute("user", "jack");
	%>
	${ n1+n2 }
	
	<h3>关系运算</h3>
	${ n1 < n2 } -- ${ n1 lt n2 }<br/>
	${ n1 > n2 } -- ${ n1 gt n2 }<br/>
	${ n1 == n2 } -- ${ n1 eq n2 }<br/>
	${ n1 <= n2 } -- ${ n1 le n2 }<br/>
	${ n1 >= n2 } -- ${ n1 ge n2 }<br/>
	${ n1 != n2 } -- ${ n1 ne n2 }<br/>
	
	<h3>逻辑运算</h3>
	<% 
		pageContext.setAttribute("n3", "40");
		pageContext.setAttribute("n4", "30");
	%>
	${ (n1 < n2) && (n3 < n4) } -- ${ (n1 < n2) and (n3 < n4) }<br/>
	${ (n1 < n2) || (n3 < n4) } -- ${ (n1 < n2) || (n3 < n4) }<br/>
	${ !(n1 < n2) } -- ${ not(n1 < n2) }<br/>
	
	<h3>三元运算</h3>
	${ n1 < n2 ? "n1 < n2" : "n1 > n2" }
	
	<h3>空运算</h3>
	${ empty user }<br/>
	${ not empty user }<br/>
</body> 
</html>