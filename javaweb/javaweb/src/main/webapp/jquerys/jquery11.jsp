<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>表单过滤选择器</title>

<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		$(":button").click(function(){
			//1.
			alert($(":radio:checked").val());
			//2.
			$(":checkbox:checked").each(function(){
				alert($(this).val());
			});	
			//3.
			$("select option:selected").each(function(){
				alert($(this).val());
			});	
		});
		
	});
	
	
</script>
</head>
<body>
	<form>
		性别：<input type="radio"  name="sex" value="男"/>男
		<input type="radio" name="sex" value="女"/>女
		<hr>
		城市：<select>
			<option value="">--请选择--</option>
			<option value="北京">北京</option>
			<option value="上海">上海</option>
			<option value="广州">广州</option>
			<option value="深圳">深圳</option>
		</select>
		<hr>
		爱好：<input type="checkbox" name="hobby" class="itheima1" value="篮球"/>篮球
		<input type="checkbox" name="hobby" class="itheima2" value="足球"/>足球
		<input type="checkbox" name="hobby" class="itheima3" value="网球"/>网球<br>
		<input type="button" value="点击">
	</form> 
</body>
</html>