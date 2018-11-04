<%@page import="java.text.SimpleDateFormat"%>
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
    <title>试题信息修改</title>
  </head>
  <body background=background1.jpg>
    <h2><p align="center"><font size="5" color="blue">试题详细修改</font></p></h2>
    <%
    	int id = Integer.parseInt(request.getParameter("question_id"));
  		que.setQuestion_id(id);
    	if(que.init()){
     %>
     <div align="center">
		<form  method="post" action="motify_ques_save.jsp" accept-charset="utf-8">
		<table width="80%" border="0">
		<tr>
		<td width="40%" align="right"><font color="blue"><b>题目：</b></font></td>
		<td width="60%" align="left"><input type="text" name="q_name" value="<%=que.getQ_name() %>"  size="40"></td>
		</tr>
		<tr>
		<td width="40%" align="right"><font color="blue"><b>试题类型：</b></font></td>
		<td width="60%" align="left"><input type="text" name="q_item" value="<%=que.getQ_item()%>" size="40" maxlength="3"></td>
		</tr>
                <tr>
		<td width="40%" align="right"><font color="blue"><b>选项A：</b></font></td>
		<td width="60%" align="left"><input type="text" name="answer_A"  value="<%=que.getAnswer_A()%>"  size="40" ></td>
		</tr>
		<tr>
		<td width="40%" align="right"><font color="blue"><b>选项B：</b></font></td>
		<td width="60%" align="left"><input type="text" name="answer_B"  value="<%=que.getAnswer_B()%>" size="40" ></td>
		</tr>
		<tr>
		<td width="40%" align="right"><font color="blue"><b>选项C：</b></font></td>
		<td width="60%" align="left"><input type="text" name="answer_C"  value="<%=que.getAnswer_C()%>" size="40" ></td>
		</tr>
                <tr>
		<td width="40%" align="right"><font color="blue"><b>选项D：</b></font></td>
		<td width="60%" align="left"><input type="text" name="answer_D" value="<%=que.getAnswer_D()%>"  size="40" ></td>
		</tr>
                <tr>
		<td width="40%" align="right"><font color="blue"><b>正确选项：</b></font></td>
		<td width="60%" align="left"><input type="text" name="right_key"  value="<%=que.getRight_key()%>"  size="40" maxlength="2"></td>
		</tr>
		
        <tr>
		<td width="40%" align="right"><font color="blue"><b>正确解析：</b></font></td>
		<td width="60%" align="left"><input type="text" name="subjectparse"  value="<%=que.getSubjectparse()%>" size="40" ></td>
		</tr>
                <td colspan="2" align="center">
		<br>
		<input type="submit" name="sub" value="提&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;交">&nbsp;&nbsp;
		<input type="reset" name="res" value="重&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;填">&nbsp;&nbsp;
		<input type="button" name="goback" value="返回上一页" onClick="javascript:window.history.go(-1)">
		</td>
		</table>
		</form>
		</div>
     <%
     
     }
      %>
  </body>
</html>
