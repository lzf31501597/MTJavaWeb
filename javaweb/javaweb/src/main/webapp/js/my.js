/**
 * 
 */
function getXmlHttpRequest(){
	var xmlhttp=null;
	//1.获取一个 XMLHttpRequest 对象
	if (window.XMLHttpRequest){
		   //  IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
		xmlhttp=new XMLHttpRequest();
	}
	else if (window.ActiveXObject){
		    // IE6, IE5 浏览器执行代码
		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	}	
	return xmlhttp;
}