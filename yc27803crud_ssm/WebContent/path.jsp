<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.lang.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=request.getRealPath("/")%>
	<%-- <%
out.print("xx");
%> --%>
	<!-- xxx -->
	<%=3 + 4 + "java" + 3 + 4%>
	<%-- <jsp:forward page=""></jsp:forward>
	<jsp:include page=""></jsp:include>
	 --%>
	<jsp:useBean id="u" class="com.yc.crud.model.User"></jsp:useBean>
	<jsp:setProperty property="name" name="u" value="zs" />
	<jsp:getProperty property="name" name="u" />

</body>
</html>