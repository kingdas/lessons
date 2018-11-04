<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>删除成功</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<jsp:useBean class="com.QuestionTable" id="que" scope="session"/>
  </head>
  
  <body>
  		<%
  			int id = Integer.parseInt(request.getParameter("question_id"));
  			que.setQuestion_id(id);
  			if(que.delete_que())
      {
	  out.println("<h2 align=center>删除成功</h2>");%>
	<center><a href="list_que.jsp">返回</a></center>
  <%  }
  else{
	  out.println("<h2 align=center>删除失败</h2>");
	  %>
	  <center><a href="index.html">首页</a></center>
  <%
  }

%>
  </body>
</html>
