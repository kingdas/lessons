<%@page import="com.yc.userSys.UserModel"%>
<%@page import="java.util.List"%>
<%@page import="com.yc.userSys.UserDaoImpl"%>
<%@page import="com.yc.userSys.UserDao"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div align="right">
			<a href="userAdd.jsp">增加用户</a>
		</div>
		<h3>用户列表</h3>
		<table width="640" border="1" align="center">
			<tr>
				<th>编号</th>
				<th>姓名</th>
				<th>电话</th>
				<th>组号</th>
				<th>修改</th>
				<th>删除</th>
			</tr>
			<%
				UserDao userDao = new UserDaoImpl();
				List<UserModel> us = userDao.findAll();
				for (UserModel u : us) {
			%>
			<tr>
				<td><%=u.getId()%></td>
				<td><%=u.getName()%></td>
				<td><%=u.getTel()%></td>
				<td><%=u.getGroup_id()%></td>
				<td><a href="userUpdate.jsp?id=<%=u.getId()%>">修改</a></td>
				<td><a href="userDel.jsp?id=<%=u.getId()%>">删除</a></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>