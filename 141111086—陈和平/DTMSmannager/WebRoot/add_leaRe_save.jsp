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
    <jsp:useBean class="com.LearnRecordTable" id="lr" scope="session"></jsp:useBean>
  </head>
  
  <body background=background1.jpg>
  <%
  				
		String student_id = request.getParameter("student_id");
		String l_juli = request.getParameter("l_juli");
		String time = request.getParameter("time");
		String subject = request.getParameter("subject");
		String car_number = request.getParameter("car_number");
			if("kesan".equals(subject)){
				lr.setSubject("科目三");
			}
			if("keer".equals(subject)){
				lr.setSubject("科目二");
			}
			
			
			
		lr.setStudent_id(student_id);
		lr.setL_juli(l_juli);
		lr.setTime(time);
		lr.setCar_number("豫"+car_number+"学");
				
		boolean flag =  lr.add_learnrecord();
   if(flag)
		{
		    	
                    out.println("<h2 align=center>添加成功</h2>"); 
        %>
                    <center><a href="list_lr.jsp">返回</a></center>
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
