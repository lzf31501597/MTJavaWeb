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
		//得到div的DOM对象
		var div = document.getElementById("div1");
		//div.innerHTML="";
		
		//得到一个jquery对象
		var jqueryDiv=$("#div1");
		//jqueryDiv.html();
		
		//转换dom成jquery对象
		//$(div1).html("hello jquery.");
		
		//转换jquery成dom对象
		jqueryDiv.get(0).innerHTML="hello jquery..."
	});	
</script>
</head>
<body>
	<div id="div1"></div>

</body>
</html>