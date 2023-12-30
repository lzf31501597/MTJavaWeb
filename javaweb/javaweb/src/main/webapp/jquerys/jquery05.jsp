<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>基本过滤器</title>
<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		//1.获取表格第一行。显示未红色
		/* $("tr:first").css("color",'blue');
		$("tr:last").css("color",'red'); */
		
		//2.设置表格除了第一行以外，显示未蓝色
		 //$("tr:not(tr:first)").css("color",'blue');
		
		//3.设置奇数和偶数行的颜色
		 /* $("tr:even").css("color",'blue');
		 $("tr:odd").css("color",'red'); */
		 
		//$("tr:eq(0)").css("color",'blue');
		//$("tr:gt(0)").css("color",'blue');
		//$("tr:lt(0)").css("color",'blue');
		
		//4.设置设置标题为蓝色
		$(":header").css("color",'blue');
		
		//$(":animated").css("color",'blue');
		//$(":focus").css("color",'blue');
	});
	
	
</script>
</head>
<body>
	<h1>商品信息</h1>
	<table border="1">
		<tr>
			<td>商品信息</td>
			<td>商品名称</td>
			<td>价格</td>
			<td>规格</td>
		</tr>
		<tr>
			<td>001</td>
			<td>电视机</td>
			<td>2100</td>
			<td>1111</td>
		</tr>
		<tr>
			<td>002</td>
			<td>pc</td>
			<td>2100</td>
			<td>1111</td>
		</tr>
		<tr>
			<td>003</td>
			<td>ipad</td>
			<td>2100</td>
			<td>1111</td>
		</tr>
	</table>
</body>
</html>