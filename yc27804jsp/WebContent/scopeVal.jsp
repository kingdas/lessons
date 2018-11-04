<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>scopeVal</h3>
	<br /> ${pageScope.s}
	<br /> ${requestScope.s}
	<br /> ${sessionScope.s}
	<br /> ${applicationScope.s}

</body>
</html>