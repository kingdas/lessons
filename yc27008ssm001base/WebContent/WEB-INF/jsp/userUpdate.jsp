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
	<h3 align="center">修改用户</h3>
	<form action="userController" method="post">
		<input type="hidden" name="m" value="doUpdate" /> <input
			type="hidden" name="id" value="${u.id}" />
		<table width="640" border="1" align="center">
			<tr>
				<td>编号：</td>
				<td><input type="text" value="${u.id}" disabled="disabled" />
				</td>
			</tr>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="name" value="${u.name}" /></td>
			</tr>
			<tr>
				<td>备注：</td>
				<td><input type="text" name="remark" value="${u.remark}" /></td>
			</tr>
			<tr>
				<td>组名：</td>
				<td><select name="groupId">
						<c:forEach items="${gs }" var="g">
							<option value="${g.id}"
								<c:if test="${g.id==u.groupId}">selected="selected"</c:if>>${g.name}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="修改" /></td>
			</tr>
		</table>
	</form>
</body>
</html>