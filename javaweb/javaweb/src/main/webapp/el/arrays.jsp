<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EL获取数组数据</h1>
	<%
		String[] arrs = {"aa", "bb", "cc"};
		pageContext.setAttribute("arrs", arrs);
	%>
	${ arrs[0] }
	${ arrs[1] }
	${ arrs[2] }
	
	<h1>EL获取List集合ß数据</h1>
	<%
		List<String> list = new ArrayList();
		list.add("11");
		list.add("22");
		list.add("33");
		pageContext.setAttribute("list", list);
	%>
	${ list[0] }
	${ list[1] }
	${ list[2] }
	
	<h1>EL获取Map集合ß数据</h1>
	<%
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("aa", 111);
		map.put("bb", 222);
		map.put("cc.dd", 333);
		pageContext.setAttribute("map", map);
	%>
	${ map.aa }
	${ map.bb }
	<%-- ${ map.cc } --%>
	${ map["cc.dd"] }
</body>
</html>