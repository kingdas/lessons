<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/main.css" rel="stylesheet">
<style type="text/css">
h1 { /* font-size: 36px; */
	/* 	background-color: blue; */
	/* color: green; */ /* 就近原则 */
	
}

strong {
	color: red;
}

li {
	color: gray;
}

li strong {
	color: blue;
}

#sidebar p {
	font-style: italic;
	text-align: right;
	margin-top: 0.5em;
}

#err {
	
}

.err {
	
}

[title] {
	color: orange;
}

[title=yy] {
	color: silver;
}
</style>
</head>
<body>
	<h1>用户列表</h1>
	<!-- style="color: red;" -->
	<p>
		<strong>我是粗体字，不是斜体字，因为我不在列表当中，所以这个规则对我不起作用</strong>
	</p>
	<ul>
		<li><strong>我是斜体字。这是因为 strong 元素位于 li 元素内。</strong>xxx</li>
		<li>我是正常的字体。</li>
	</ul>
	<hr />
	<div id="sidebar">
		<span>xx</span><br />
		<p>中</p>
	</div>
	<hr />
	<span id="err" class="err" style="">xx</span>
	<span id="error" class="err" style="">xx</span>
	<form action="" name=""></form>
	<input name="" />

	<div title="xx">xx</div>
	<div title="yy">yy</div>


</body>
</html>