<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>内容过滤选择器</title>

<style type="text/css">
	.test1 {
	color: orange	
</style>
<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		//1.:contains(text) 设置含有文本内容JAVA的div字体颜色为红色
		$("div:contains('JAVA')").css("color",'red');
	
		//2.:empty 设置没有子元素的div文本内用为”这是一个空的div“
		//$("div:empty('JAVA')").text("这是一个空的div");
		$("div:empty('JAVA')").html("这是一个空的div1").css("color",'blue');
	
		//3.:has(selector) 包含<a>元素的div字体颜色为黄色
		$("div:has(p)").addClass("test1");
		
		//4.:parent 设置所有包含子元素的span字体为蓝色
		$("span:parent").css("color",'green');
	});
	
	
</script>
</head>
<body>
	<div>itcast java1</div>
	<div>itcast java2</div>
	<div></div>
	<div>itheima ios</div>
	<div>itcast android</div>
	<div>itheima php</div>
	<div>itheima ui</div>
	<div><p>传智播客</p>欢迎你</div>
	<div>世界第一开发语言<a>JAVA</a></div>
	<div><span>传智播客</span>JAVA</div>
</body>
</html>