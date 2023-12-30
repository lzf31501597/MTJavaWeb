<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>属性过滤选择器</title>

<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		//1.设置含有id属性的div，字体颜色为红色
		$("div[id]").css("color","red");
		$("span[id]").css("color","blue");
		
		//2.获取name=username的value值
		var value=$("input[name='username']").val();
		//alert(value);
		
		//3.设置所有多选框被选中
		//$("input[type='checkbox']").attr("checked",true);
		
		//4.设置class中包含itcast的多选框被选中
		//$("input[type='checkbox'][class*='itcast']").attr("checked", true);
		//$("input[type='checkbox'][class^='itheima']").attr("checked", true);
		$("input[type='checkbox'][class$='itcast']").attr("checked", true);
		
	});
	
	
</script>
</head>
<body>
	<div id="div">这是一个div</div>
	<form>
		<input type="text" name="username" value="tom"/><br>
		<input type="checkbox" class="1itcast1" name="food" value="米饭"/>米饭
		<input type="checkbox" class="2itcast2" name="food" value="牛肉"/>牛肉
		<input type="checkbox" class="3itcast3" name="food" value="羊肉"/>羊肉
		<hr>
		<input type="checkbox" class="1itcast" name="food" value="米饭"/>米饭
		<input type="checkbox" class="2itcast" name="food" value="牛肉"/>牛肉
		<input type="checkbox" class="3itcast" name="food" value="羊肉"/>羊肉
		<hr>
		<input type="checkbox" name="hobby" class="itheima1" value="篮球"/>篮球
		<input type="checkbox" name="hobby" class="itheima2" value="足球"/>足球
		<input type="checkbox" name="hobby" class="itheima3" value="网球"/>网球
	</form>
	<span id="span">这是一个div</span>
</body>
</html>