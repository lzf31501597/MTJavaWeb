<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>层级关系</title>
<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		//1.获取id=d所有p子元素
		//var size=$("#d1 p").size();
		
		//2.获取id=d直接a子元素
		//var size=$("#d1>a").size();
		
		//3.获取id=d第一个p兄弟元素
		/* var size=$("#d1 + a").size();
		alert($("#d1+ p").html()); */
		
		//4.获取id=d所有p兄弟元素
		//alert($("#d1~p").size());
		
		//5.id=d下所有p子元素的文字颜色设置成红色
		//$("#d1 p").css({ color: "#ff0011", background: "blue" });
		//$("#d1>a").css({ color: "#ff0011", background: "blue" });
		//$("#d1+p").css({ color: "#ff0011", background: "blue" });
		$("#d1~p").css({ color: "#ff0011", background: "blue" });
	});
	
	
</script>
</head>
<body>
	<div id="d1">
		<a>itcast java1</a>
		<p>itcast java2</p>
		<p><a>itheima ios</a></p>
		<p>itcast android</p>
	</div>
	<p>itheima php</p>
	<p>itheima ui</p>
</body>
</html>