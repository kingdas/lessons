<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@ page  import="java.sql.*" %>
<jsp:useBean class="com.QuestionTable" id="que" scope="session"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>学员列表</title>
	</head>
	<body  background=background1.jpg>
		<h2><p align="center"><font size="5" color="blue">试题列表</font></p></h2>
		<div style="width: 600px;height: 35px;margin: auto;" >
			<form action="list_que.jsp" method="post" accept-charset="utf-8">题目编号：
			<input type="text" size="15" name="que_id" >
			<input type="submit" value="查询">
			
			试题类型：
			<select name="type" style="width: 138px;">
				<option value="all">所有</option>
				<option value="check">选择题</option>
				<option value="judge">判断题</option>
			</select>
			<input type="submit" value="查询">
			</form>
		</div>
		
		
		<div align="center">
	<table width="70%" border="1" cellpadding="3" cellspacing="1" style="table-layout: fixed;">
	<tr bgcolor="#3366cc">
			<td width="6%" align="center"><font size="4" color="#FFFFFF"><b>题目编号</b></font></td>
			<td width="16%" align="center"><font size="4" color="#FFFFFF"><b>题目</b></font></td>
			<td width="7%" align="center"><font size="4" color="#FFFFFF"><b>试题类型</b></font></td>
			<td width="6%" align="center"><font size="4" color="#FFFFFF"><b>正确答案</b></font></td>
			<td width="16%" align="center"><font size="4" color="#FFFFFF"><b>答案解析</b></font></td>
			<td width="10%" align="center"><font size="4" color="#FFFFFF"><b>操作</b></font></td>
			</td>
			</tr>
			<%
				int que_id = 0;
				String id = request.getParameter("que_id");
				if( !("".equals(id))&&id!=null){
					 que_id = Integer.parseInt(id);
				}
				String type = request.getParameter("type");
				ResultSet users_rs=que.show_all_ques_con(que_id,type);
				int i=0;		
				while(users_rs.next())
				{
			%> 
				<tr>
						<td width="6%" align="center"><%=users_rs.getInt("question_id")%></td>
						<td width="16%" align="left" style="white-space: nowrap;overflow: hidden;text-overflow: ellipsis;"><%=users_rs.getString("q_name")%></td>
						<td width="7%" align="center"><%=users_rs.getString("q_item")%></td>
						<td width="6%" align="center"><%=users_rs.getString("right_key")%></td>
                        <td width="16%" align="left" style="white-space: nowrap;overflow: hidden;text-overflow: ellipsis;"><%=users_rs.getString("subjectparse")%></td>
                        <td width="10%" align="center">
                        	<a href="xiangxi_que.jsp?question_id=<%=users_rs.getInt("question_id") %>">详情</a>
							<a href="delete_que.jsp?question_id=<%=users_rs.getInt("question_id") %>">删除</a>
							<a href="motify_que.jsp?question_id=<%=users_rs.getInt("question_id") %>">修改</a>
                        </td> 
			       </tr>
			<%		
			        }
			%>
		</table>
		</div>
		<div style="height: 20px"></div>	
		<center>
		<input type="button"  value="添加试题" onclick='location.href=("add_question.jsp")'>
  	 	<input type="button" onclick='location.href=("add_learnrecord.jsp")' value="返回首页"></input>
  	 	<!-- <input type="button" name="goback" value="返回上一页" onClick="javascript:window.history.go(-1)"> -->
  	 </center>
	</body>
</html>
