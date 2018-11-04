<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<script language="javascript" type="text/javascript">
	/* 	$(document).ready(function() {
	 $("a").click(function() {
	 alert("Hello world!");
	 });
	 });
	 */
	function xx() {
		//document.write("xx");
		//alert("...");
	}
	/* $(function() {
		//alert("###");
		$(".c").click(function() {//类选择器
			alert("c");
		});
		$("#err").click(function() {//ID选择器
			alert("err");
		});
		
	}); */
	function jq() {
		alert($("div > p").html());//css选择器
		$("div > p").html("TWO");
		document.getElementById("one").innerHTML = "ONE";
		$("#three").html("THREE");
	}
	function jq1() {
		$("img").each(function() {
			this.src = "img/2.jpg";
		});
		$("#err").css("color", "red");
	}
	$(function() {
		$("#one").hover(function() {
			$(this).addClass("red");
		}, function() {
			$(this).removeClass("red");
		});
	});
</script>
<style type="text/css">
.red {
	color: red;
	font-size: 36px;
}
</style>
</head>
<body onload="xx()">
	<a href="#">点击</a>
	<br />
	<a href="#">点击~~</a>
	<br />
	<span class="c">点点</span>
	<br />
	<span id="err">点点***</span>
	<br />
	<hr />
	<p id="one">one</p>
	<div>
		<p>two</p>
	</div>
	<p id="three">three</p>
	<a href="#" id="test" onClick="jq()">jQuery</a>
	<hr />
	<img src="img/1.jpg" />
	<img src="img/1.jpg" />
	<a href="#" id="test" onClick="jq1()">jQuery</a>
</body>
</html>
