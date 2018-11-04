<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<c:set var="n" value="<%=new java.util.Random().nextInt(100) %>"></c:set>
	<a href="a.jsp" target="cnt">aaaaaaaaaaaaa</a>
	<br />
	<c:if test="${n%2==0 }">
		<a href="b.jsp" target="_blank">bbbbbbbbbbbbbbbbb</a>
		<br />
	</c:if>
	<a href="login.jsp" target="_top">退出</a>
	<br />
</body>
</html>