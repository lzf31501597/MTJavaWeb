<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>文档--删除元素</title>

<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		//empty 删除匹配的元素集合中所有的子节点。
		//$("#d1").empty();
		
		//给p注册事件
		$("#d1 p").click(function({
			alert("d1111p.click()");
		});
		
		//从DOM中删除所有匹配的元素
		//var p=$("#d1 p").remove();
		//从DOM中删除所有匹配的元素。
		var p=$("#d1 p").detach();
		
		$("#d2").append("p");
	});

</script>
</head>
<body>
	<div id="d1">
		<p>d1 ppppppppppp</p>
		<span>d1 sssssssssss</span>
	</div>
	<div id="d2">
	</div>
		
</body>
</html>