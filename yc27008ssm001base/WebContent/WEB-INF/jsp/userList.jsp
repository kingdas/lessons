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
	<p>
		<a href="${pageContext.request.contextPath }/user/add">增加用户</a>
	</p>
	<table width="640" border="1">
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>备注</th>
			<th>组号</th>
			<th>修改</th>
			<th>删除</th>
		</tr>
		<c:forEach items="${us}" var="u">
			<tr>
				<td>${u.id }</td>
				<td>${u.name }</td>
				<td>${u.remark }</td>
				<td>${u.groupModel.name}</td>
				<td><a href="userController?m=update&id=${u.id }">修改</a></td>
				<td><a href="userController?m=del&id=${u.id }">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>