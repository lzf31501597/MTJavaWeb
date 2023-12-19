<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL的foreach标签的使用</h1>
	<h3>遍历数组</h3>
	<%
		String[] arrs = {"aa", "bb", "cc"};
		pageContext.setAttribute("arrs", arrs);
	%>	
	<c:forEach var="s" items="${ arrs }">${ s }<br/></c:forEach>
	
	<h3>遍历list集合</h3>
	<%
		List<String> list = new ArrayList<String>();
		list.add("11");
		list.add("22");
		list.add("33");
		pageContext.setAttribute("list", list);
	%>
	<c:forEach var="s" items="${ list }">${ s }<br/></c:forEach>
	
	<h3>遍历map集合</h3>
	<%
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("11", 111);
		map.put("22", 222);
		map.put("33", 333);	
		pageContext.setAttribute("map", map);
	%>
	<c:forEach var="entry" items="${ map }">
		${ entry.key }-${ entry.value }
	<br/></c:forEach>
	
	<h3>遍历1--100,并且每到第五个就换行</h3>
	<c:forEach var="i" begin="1" end="100" step="1" varStatus="status">
		<c:if test="${ status.count % 5 == 0  }">
			<font color="red">${ i }<br></font>
		</c:if>
		<c:if test="${ status.count % 5 != 0 }">
			<font>${ i }</font>
		</c:if>
		
	</c:forEach>
	
	<h3>遍历100--200 每次加2，每到第三个数的时候，将该数变为蓝色</h3>
	<c:forEach var="i" begin="100" end="200" step="2" varStatus="status">
		<c:if test="${ status.count % 3 == 0 }">
			<font color="blue">${ i }</font><br>
		</c:if>
		<c:if test="${ status.count % 3 != 0 }">
			<font>${ i }</font>
		</c:if>
		
	</c:forEach>
</body>
</html>