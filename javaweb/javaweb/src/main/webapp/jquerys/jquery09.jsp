<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>子元素过滤选择器</title>

<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		//1.设置含有id属性的div，字体颜色为红色
		$("ul li:nth-child(2)").css({"color":"red","font-size":30});
		
		$("ul li:first-child").css({"color":"blue","font-size":20});
		$("ul li:last-child").css({"color":"orange","font-size":25});
		$("ul li:only-child").css({"color":"yellow","font-size":35});
		alert($("ul li:only-child").html());
	});
	
	
</script>
</head>
<body>
	<ul>
		<li>Java</li>
		<li>IOS</li>
		<li>python</li>
		<li>c++</li>
		<li>andriod</li>
	</ul>
	<ul>
		<li>刘德华</li>
		<li>梁朝伟</li>
		<li>郭富城</li>
		<li>张学友</li>
		<li>刘亦菲</li>
	</ul>
	<ul>
		<li>NodeJS</li>
	</ul>
</body>
</html>