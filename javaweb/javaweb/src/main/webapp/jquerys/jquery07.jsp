<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>可见性过滤选择器</title>

<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		//1.获取表单中隐藏域的值
		var value=$("input:hidden").val();
		//alert(value);
		alert($("form :hidden").val());
		
		//2.设置table中所有可见tr背景颜色为蓝色
		$("tr:visible").css("background-color",'gray');
	
		//3.:设置table中所有隐藏tr的值
		alert($("tr:hidden").text());
		//并将隐藏tr显示出来
		$("tr:parent").show();
		//原来显示的tr隐藏起来
		$("tr:visible").hide();
	});
	
	
</script>
</head>
<body>
	<form>
		<input type="text" name="email" />email<br>
		<input type="hidden" name="id" value="10"/>
	</form>
	<table>
		<tr style="display: none">
			<td>Value 1</td>
		</tr>
		<tr>
			<td>Value 2</td>
		</tr>
		<tr>
			<td>Value 3</td>
		</tr>
		<tr>
			<td>Value 4</td>
		</tr>
	</table>
</body>
</html>