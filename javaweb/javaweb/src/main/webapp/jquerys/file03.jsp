<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>文档--替换和克隆</title>

<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		//将id=d1中的第一个p来克隆一份，替换id=d2中的div中的第二个span
		$("#d1 p:first").click(function(){alert("ppppp");});
		$("a").mouseover(function(){alert("aaaaaaa");});
		
		var cp=$("#d1 p:first").clone(true,true);
		//$("#d2 span:last").replaceWith(cp);
		cp.replaceAll($("#d2 span:last"));
		
	});

</script>
</head>
<body>
	<div id="d1">
		<p>
			<a>a1</a>
		</p>
		<p>p2</p>
	</div>
	
	<div id="d2">
		<span>SAPN1</span><br>
		<span>SAPN2</span>
	</div>
		
</body>
</html>