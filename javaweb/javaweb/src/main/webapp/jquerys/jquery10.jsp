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
		//1.当username与password失去焦点后，判断录入的数据不能为空
		$(":text,:password").blur(function(){
			var value = $(this).val();
			//if(value.trim() == ""){
			if($.trim(value) == ""){
				alert( $(this).attr("name")+"不可以为空" );
			}
		});
		
		//通过button点击，提交的表单
		$(":button").click(function(){
			$("form").submit();
		});
	});
	
	
</script>
</head>
<body>
	<form>
		username: <input type="text" name="username"/><br>
		password: <input type="password" name="password"/><br>
		<input type="radio" class="itcast1" name="food" value="米饭"/>米饭
		<input type="radio" class="itcast2" name="food" value="牛肉"/>牛肉
		<input type="radio" class="itcast3" name="food" value="羊肉"/>羊肉
		<hr>
		<input type="image" class="1itcast" name="image"/><br>
		<input type="reset" class="2itcast" name="reset"/><br>
		<select><option/></select>
		<textarea></textarea>
		<hr>
		<input type="checkbox" name="hobby" class="itheima1" value="篮球"/>篮球
		<input type="checkbox" name="hobby" class="itheima2" value="足球"/>足球
		<input type="checkbox" name="hobby" class="itheima3" value="网球"/>网球<br>
		<input type="button" value="按钮">
		<input type="submit" value="提交">
	</form> 
</body>
</html>