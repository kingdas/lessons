<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:useBean class="com.QuestionTable" id="que" scope="session"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改结果</title>
  </head>
  
  <body background=background1.jpg>
    <%
    			
		String q_name = request.getParameter("q_name");
		String q_item = request.getParameter("q_item");
		String answer_A = request.getParameter("answer_A");
		String answer_B = request.getParameter("answer_B");
		String answer_C = request.getParameter("answer_C");
		String answer_D = request.getParameter("answer_D");
		String right_key = request.getParameter("right_key");
		String subjectparse = request.getParameter("subjectparse");
				
		que.setQ_name(q_name);
		que.setQ_item(q_item);
		que.setAnswer_A(answer_A);
		que.setAnswer_B(answer_B);
		que.setAnswer_C(answer_C);
		que.setAnswer_D(answer_D);
		que.setRight_key(right_key);
		que.setSubjectparse(subjectparse);
		
		boolean flag = que.update_question();
		if(flag)
		{
		    	
                    out.println("<h2 align=center>修改成功</h2>"); 
        %>
                    <center><a href="list_que.jsp">返回</a></center>
           <% }
		else
		{
	     %>	
			<h2 align="center">修改失败</h2>
			<center>
			<input type="button" name="goback" value="返回" onClick="javascript:window.history.go(-1)">
			</center>
	<%
		}
	%>
  </body>
</html>
