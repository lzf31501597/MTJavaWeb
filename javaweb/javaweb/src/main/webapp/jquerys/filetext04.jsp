<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		$(":button").click(function(){
			
			var tr=$("<tr></tr>");
			
			var td1=$("<td></td>");
			td1.append($("#username").val());
			
			var td2=$("<td></td>");
			td2.append($("#phone").val());
			
			var td3=$("<td></td>");
			td3.append($("#email").val());
			
			var td4=$("<td></td>");
			var a=$("<a href='javascript:void(0)'>删除</a>");
			td4.append(a);
			
			tr.append(td1).append(td2).append(td3).append(td4);
			$("#tab").append(tr);
		});
	});
</script>
</head>
<body>
	<div align="center">
		<table id="tab" border="1">
			<tr>
				<td>姓名</td>
				<td>电话</td>
				<td>邮箱</td>
				<td>删除</td>
			</tr>
		</table>
		<hr>
		姓名：<input type="text" id="username">
		电话：<input type="text" id="phone">
		邮箱：<input type="text" id="email">
		<input type="button" value="添加">
	</div>
</body>
</html>