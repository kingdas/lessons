<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page errorPage="err1.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.getClass();
		response.getClass();
		page.getClass();
		session.getClass();
		application.getClass();
		out.getClass();
		config.getClass();
		pageContext.getClass();
		//pageContext.getRequest();
		Exception ex = pageContext.getException();

		request.getSession();
		int x = 0;
		x = 1 / x;
	%>
</body>
</html>