<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>新增结果</title>
    <jsp:useBean class="com.StudentTable" id="stu" scope="session"></jsp:useBean>
  </head>
  
  <bodybackground=background1.jpg>
  <%
  		String s_name = request.getParameter("s_name");
		String s_password = request.getParameter("s_password");
		String s_sex = request.getParameter("s_sex");
		String s_phone = request.getParameter("s_phone");
		String s_coach = request.getParameter("s_coach");
		String s_address= request.getParameter("s_address");
		String s_d_address = request.getParameter("s_d_address");
		String s_statue = request.getParameter("s_statue");
		String s_c_type = request.getParameter("s_c_type");
		String s_free_statue = request.getParameter("s_free_statue");
		String s_discount = request.getParameter("s_discount");
		String s_cardid = request.getParameter("s_cardid");
		String s_age = request.getParameter("s_age");
		
		stu.setS_username("xue"+s_phone);
		stu.setS_result("否");
		
		
		stu.setS_age(s_age);
		stu.setS_cardid(s_cardid);
		stu.setS_name(s_name);
		stu.setS_password(s_password);
		stu.setS_sex(s_sex);
		stu.setS_phone(s_phone);
		stu.setS_coach(s_coach);
		stu.setS_address(s_address);
		stu.setS_d_address(s_d_address);
		stu.setS_statue(s_statue);
		stu.setS_free_statue(s_free_statue);
		stu.setS_c_type(s_c_type);
		stu.setS_discount(s_discount);
		boolean flag =  stu.add_student();
   
   if(flag)
		{
		    	
                    out.println("<h2 align=center>添加成功</h2>"); 
        %>
                    <center><a href="list_stu.jsp">返回</a></center>
           <% }
		else
		{
	     %>	
			<h2 align="center">添加失败</h2>
			<center>
			<input type="button" name="goback" value="返回" onClick="javascript:window.history.go(-1)">
			</center>
	<%
		}
	%>
   
  </body>
</html>
