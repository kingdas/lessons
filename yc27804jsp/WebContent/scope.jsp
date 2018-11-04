<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>scope范围</h3>
	<%-- <%
		pageContext.setAttribute("ps", "pv");
		pageContext.setAttribute("pst", "pvt", pageContext.PAGE_SCOPE);
		request.setAttribute("rs", "rsv");
		pageContext.setAttribute("rst", "rstv", pageContext.REQUEST_SCOPE);
		session.setAttribute("ss", "sv");
		pageContext.setAttribute("sst", "ssv", pageContext.SESSION_SCOPE);
	%>



	rs=<%=request.getAttribute("rs")%>---${rs}
	<br /> rst=<%=request.getAttribute("rst")%>---${rst}
	<br />pageContext[rs]=<%=pageContext.getAttribute("rs", pageContext.REQUEST_SCOPE)%>
	<br />pageContext[ps]=<%=pageContext.getAttribute("ps", pageContext.PAGE_SCOPE)%>
	<br />
	<br /> >${rs }<,<%=pageContext.getAttribute("x")%><br /> st=${sst } --%>
	<%
		pageContext.setAttribute("s", "pv", pageContext.PAGE_SCOPE);
		request.setAttribute("s", "rv");
		session.setAttribute("s", "sv");
		application.setAttribute("s", "av");
	%>
	${s}
	<br /> ${pageScope.s}
	<br /> ${requestScope.s}
	<%-- <%session.setMaxInactiveInterval(1); %> --%>
	<br /> ${sessionScope.s}
	<br /> ${applicationScope.s}

	<%-- <jsp:forward page="scopeVal.jsp"></jsp:forward> --%>
	<%
		response.sendRedirect("scopeVal.jsp");
	%>

</body>
</html>