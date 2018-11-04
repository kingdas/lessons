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
    <title>试题详细信息</title>
    <style type="text/css">
    .gridtable{
    margin: 5px auto 0;
    
    }
    </style>
  </head>
  
  <body background=background1.jpg>
  <h2><p align="center"><font size="5" color="blue">试题详细信息</font></p></h2>
  	<%
  		int id = Integer.parseInt(request.getParameter("question_id"));
  		que.setQuestion_id(id);
  		 if(que.init()){
  			%>
  			<table class="gridtable" width="60%" border="1" cellpadding="3" cellspacing="1" style="table-layout: fixed;">
                <tr>
                    <td class="gridtable_td" bgcolor="#37b5f8" style="width: 30%">
                        题目
                    </td>
                    <td style="width: 70%;white-space: nowrap;overflow: hidden;text-overflow: ellipsis;">
                        <%=que.getQ_name() %>
                    </td>
                    </tr>
                <tr>
                    <td class="gridtable_td" bgcolor="#37b5f8" >
                        试题类别
                    </td>
                    <td >
                        <%=que.getQ_item() %>
                    </td>
                </tr>
                <tr>
                <td class="gridtable_td" bgcolor="#37b5f8" >
                        选项A
                    </td>
                    <td style="width: 200px">
                        <%=que.getAnswer_A() %>
                    </td>
                </tr>
                <tr>
                <td class="gridtable_td" bgcolor="#37b5f8" >
                        选项B
                    </td>
                    <td style="width: 200px">
                        <%=que.getAnswer_B() %>
                    </td>
                </tr>
                <tr>
                    <td class="gridtable_td" bgcolor="#37b5f8" >
                         选项C
                    </td>
                    
                    <td>
                        <%=que.getAnswer_C() %>
                    </td>
                    </tr>
                <tr>
                    <td class="gridtable_td" bgcolor="#37b5f8" >
                         选项D
                    </td>
                    <td>
                       <%=que.getAnswer_D() %>
                    </td>
                </tr>
                <tr>
                    <td class="gridtable_td" bgcolor="#37b5f8" >
                        正确答案
                    </td>
                    <td>
                        <%=que.getRight_key() %>
                    </td>
                    </tr>
                <tr>
                    <td class="gridtable_td" bgcolor="#37b5f8" >
                        正确解析
                    </td>
                    <td style="white-space: nowrap;overflow: hidden;text-overflow: ellipsis;">
                        <%=que.getSubjectparse() %>
                    </td>
                </tr>
                
            </table>
  			<% 
  		}
  	 %>
  	 <div style="height: 20px"></div>
  	 <center>
  	 <input type="button" src="index.jsp" value="返回首页"></input>
  	 <input type="button" name="goback" value="返回上一页" onClick="javascript:window.history.go(-1)">
  	 </center>
  	 
  	 
  </body>
</html>
