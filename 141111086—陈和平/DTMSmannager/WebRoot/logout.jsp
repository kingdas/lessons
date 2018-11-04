<%@ page contentType="text/html; charset=utf-8" language="java"  %>
<% 
		session.removeAttribute("adminName");
		session.removeAttribute("adminUsername");
		session.removeAttribute("adminpassword");
		session.invalidate();
		response.sendRedirect("index.html");
%>