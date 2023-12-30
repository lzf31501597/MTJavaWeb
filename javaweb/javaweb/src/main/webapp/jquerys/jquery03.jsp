<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	//1.得到id="div1"元素的内容
	$(function(){
		var html=$("#div1").html();//该方法是得到div的id=d1元素中的所有html
		//alert(html);
		var text=$("#div1").text();//该方法是得到div的id=d1元素中的所有文本
		//alert(text);
		
		//2.class="d1"元素的内容,后面添加欢迎您
		$(".d1").each(function(i){
			//alert(i);
			//this它是一个dom对象，调用jquery方法，应先将其转换为jquery对象
			//alert($(this).html(" ok"));
			//$(this).html($(this).html()+" ok1");
			$(this).html($(this).html()+" 欢迎您11!!!");
		});
		
		//3.得到id=div1 这个div1在整个页面是第几个
		
		//var index = $("div").index($("#div2")); //得到 id=div1这个div
		var index = $("div").index();//得到所有的div的索引值。从0开始
		alert(index);
		
		//4.得到class="d1" 的元素有几个
		var size=$(".d1").size();
		alert(size);
		
		//5.将 class="d1" 或 id=div1 元素的值设置为java
		$(".d1, #div1").text("java");
	});	
	
</script>
</head>
<body>
	<div id="div1"><a>itcast</a></div>
	<div class="d1">itcast</div>
	<div class="d1">itheima</div>
	<div id="div1"><a>itcast</a></div>
	<div>itheima</div>
	<div>itheima</div>
</body>
</html>