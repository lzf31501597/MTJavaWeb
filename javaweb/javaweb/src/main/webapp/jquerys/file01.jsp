<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>文档--内外部添加</title>

<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		//内部插入 first <option value="学前班">学前班</option>
		$("#edu").prepend($("<option value='学前班2'>学前班2</option>"));
		$("<option value='学前班1'>学前班1</option>").prependTo($("#edu"));
		
		//内部插入 last <option value="研究生1">研究生1</option>
		$("#edu").append($("<option value='研究生1'>研究生1</option>"));
		$("<option value='研究生2'>研究生2</option>").appendTo($("#edu"));
		
		//外部插入 before <option value="学前班">学前班</option>
		$("#edu option:first").before($("<option value='学前班3'>学前班3</option>"));
		$("<option value='学前班4'>学前班4</option>").insertBefore($("#edu option:first"));
		
		//外部插入 after <option value="研究生1">研究生1</option>
		$("#edu option:last").after($("<option value='研究生3'>研究生3</option>"));
		$("<option value='研究生4'>研究生4</option>").insertAfter($("#edu option:last"));
		
	});

</script>
</head>
<body>
	<select id="edu">
		<option value="小学">小学</option>
		<option value="中学">中学</option>
		<option value="大学">大学</option>
	</select>
</body>
</html>