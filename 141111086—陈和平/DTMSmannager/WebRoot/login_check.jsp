<%@page import="java.sql.ResultSet"%>
<%@ page contentType="text/html; charset=utf-8" language="java" %>
<jsp:useBean class="com.AdminTable" id="admin" scope="session"/>
<%request.setCharacterEncoding("utf-8");%>
<html>
<head>

		<title>登录验证</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">	
	</head>
	<body background="background1.jpg">
	<%
	
		String a_username = request.getParameter("UserName");
		String a_password = request.getParameter("UserPassword");
        admin.setA_username(a_username);
        admin.setA_password(a_password);
        boolean flag = admin.check_admin();
           ResultSet users_rs = admin.select_admin();     
            if(flag){
				while(users_rs.next()){
                   session.setAttribute("adminName",users_rs.getString("a_name")); 
                   session.setAttribute("adminUsername",users_rs.getString("a_username"));
                   session.setAttribute("adminpassword",users_rs.getString("a_password"));
                   response.sendRedirect("login_admin.html");
					}
                }
               else {
      
	%>
<MARQUEE scrollAmount=8 direction=right behavior=alternate>
	<B>
		<FONT color=#7700bb size=5>
			<FONT color=lime> 
			<MARQUEE direction=up behavior=alternate width=40 height=200 align="middle">登</MARQUEE>
			<FONT color=red> 
			<MARQUEE direction=up behavior=alternate width=40 height=150>陆</MARQUEE>
			<FONT color=orange> 
			<MARQUEE direction=up behavior=alternate width=40 height=200>失</MARQUEE>
			<FONT color=fuchsia> 
			<MARQUEE direction=up behavior=alternate width=40 height=150>败</MARQUEE>
		</FONT>
	</B>
</MARQUEE>
	
			<h2 align="center">您输入的用户名或者密码有误</h2>
                        <center>
			<input type="button" name="goback" value="返回" onClick="javascript:window.history.go(-1)"	>
			</center> 
	<%
		}
	%>
	</body>
</html>
