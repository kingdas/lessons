<%@page import="java.text.SimpleDateFormat"%>
<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@ page  import="java.sql.*" %>
<jsp:useBean class="com.LearnRecordTable" id="lr" scope="session"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>练习记录列表</title>
	</head>
	<body  background=background1.jpg>
		<h2><p align="center"><font size="5" color="blue">练习记录列表</font></p></h2>
		<div style="width: 600px;height: 35px;margin: auto;" >
			<form action="list_lr.jsp" method="post" accept-charset="utf-8">学员手机号：
			<input type="text" size="15" name="student_id" maxlength="11">
			<input type="submit" value="查询">
			
			科目类别：
			<select name="subject" style="width: 138px;">
				<option value="all">所有</option>
				<option value="keer">科目二</option>
				<option value="kesan">科目三</option>
			</select>
			<input type="submit" value="查询">
			</form>
		</div>
		
		
		<div align="center">
	<table width="70%" border="1" cellpadding="3" cellspacing="1" style="table-layout: fixed;">
	<tr bgcolor="#3366cc">
			<td width="10%" align="center"><font size="4" color="#FFFFFF"><b>学员用户名</b></font></td>
			<td width="7%" align="center"><font size="4" color="#FFFFFF"><b>学员姓名</b></font></td>
			<td width="7%" align="center"><font size="4" color="#FFFFFF"><b>科目类别</b></font></td>
			<td width="16%" align="center"><font size="4" color="#FFFFFF"><b>结束时间</b></font></td>
			<td width="7%" align="center"><font size="4" color="#FFFFFF"><b>练习时长</b></font></td>
			<td width="10%" align="center"><font size="4" color="#FFFFFF"><b>教练车牌号</b></font></td>
			</td>
			</tr>
			<%
				
				String id = request.getParameter("student_id");
				String subject = request.getParameter("subject");
				if("kesan".equals(subject)){
					subject = "科目三";
				}else if("keer".equals(subject)){
					subject = "科目二";
				}else{
					subject = "所有";
				}
				
				String date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(lr.getStart_time());
				ResultSet users_rs=lr.show_all_lrs_con(id,subject);
				while(users_rs.next())
				{
				String s_username = users_rs.getString("(select s.s_username from student s where l.student_id=s.student_id)");
				String s_name = users_rs.getString("(select s.s_name from student s where l.student_id=s.student_id)");
			%> 
				<tr>
						<td width="8%" align="center"><a href="xiangxi_stu.jsp?student_id=<%=users_rs.getString("student_id") %>"><%=s_username %></a></td>
						<td width="16%" align="center" ><%=s_name %></td>
						<td width="7%" align="center"><%=users_rs.getString("subject")%></td>
						<td width="6%" align="center"><%=date%></td>
                        <td width="16%" align="center" ><%=users_rs.getString("time")%>分钟</td>
                        <td width="10%" align="center">
                        	<%=users_rs.getString("car_number") %>
                        </td> 
			       </tr>
			<%		
			        }
			%>
		</table>
		</div>
		<div style="height: 20px"></div>	
		<center>
		
		<input type="button"  value="添加记录" onclick='location.href=("add_learnrecord.jsp")'>
  	 	<input type="button" onclick='location.href=("add_learnrecord.jsp")' value="返回首页"></input>
  	 	<!-- <input type="button" name="goback" value="返回上一页" onClick="javascript:window.history.go(-1)"> -->
  	 </center>
	</body>
</html>
