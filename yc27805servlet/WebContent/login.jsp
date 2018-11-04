<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-1.9.1.min.js"></script>
<script type="text/javascript">
	function chgSrc(img) {
		img.src = "http://localhost:8060/yc27805servlet/CodeServlet?t="
				+ Math.random();
	}
</script>
</head>
<body>
	<%
		int n = new Random().nextInt(1000000);
		request.setAttribute("n", n);
	%>
	<form action="login" method="post">
		用户名：<input type="text" name="name" /><br /> 密码：<input
			type="password" name="password" /><br /> 验证码：<input type="text"
			name="c" /> <img id="code" alt="验证码"
			src="http://localhost:8060/yc27805servlet/CodeServlet"
			onclick="chgSrc(this)">
		<%-- <span>${n}</span> --%>
		<br /> <input type="submit" value="登录" />
	</form>
</body>
</html>