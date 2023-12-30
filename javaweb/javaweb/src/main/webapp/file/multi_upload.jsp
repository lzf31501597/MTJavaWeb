<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function add(){
		var div1Element = document.getElementById("div1");
		div1Element.innerHTML += "<div><input type='file' name='upload'/><input type='button' value='删除' onclick='del(this)'></div> ";
	}
	function del(who){
		/* var divv = who.parentNode;
		divv.parentNode.removeChild(who.parentNode); */
		who.parentNode.parentNode.removeChild(who.parentNode);
	}
</script>
</head>
<body>
<h1>多文件上传</h1>
<form action="" method="post" enctype="multipart/form-data">
	<input type="button" value="添加" onclick="add()"/>
	<input type="submit" value="上传"/><br/>
	<div id="div1"></div>
</form>
</body>
</html>