<%@page import="com.yc.oa.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
		Employee emp = (Employee) session.getAttribute("emp");
		if (emp == null) {
			response.sendRedirect("/login.jsp");
		}
	%> --%>
	<div align="center">
		<h3>申请借款</h3>
		<form action="${pageContext.request.contextPath }/loan/add"
			method="post">
			<table width="640">
				<tr>
					<td>标题</td>
					<td><input type="text" name="title" /></td>
				</tr>
				<tr>
					<td>金额</td>
					<td><input type="text" name="amount" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="申请" /></td>
				</tr>
			</table>

		</form>
	</div>
</body>
</html>