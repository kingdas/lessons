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
		<h3>修改用户</h3>
		<!--form action指定处理页，method提交方式：get（默认）|post -->
		<form action="controller.jsp" method="post">
			<input type="hidden" name="m" value="doUpdate" />
			<input type="hidden" name="id" value="${u.id}" />
			<table width="360" border="1" align="center">
				<tr>
					<td align="right">编号：</td>
					<td><input type="text" value="${u.id}" disabled="disabled" /></td>
				</tr>
				<tr>
					<td align="right">用户名：</td>
					<td><input type="text" name="name" value="${u.name}" /></td>
				</tr>
				<tr>
					<td align="right">电&nbsp;&nbsp;&nbsp;&nbsp;话：</td>
					<td><input type="text" name="tel" value="${u.tel}" /></td>
				</tr>
				<tr>
					<td align="right">组&nbsp;&nbsp;&nbsp;&nbsp;号：</td>
					<td><input type="text" name="group_id" value="${u.group_id}" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="修改" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>