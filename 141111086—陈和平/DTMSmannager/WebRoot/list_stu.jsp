<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@ page  import="java.sql.*" %>
<jsp:useBean class="com.StudentTable" id="stu" scope="session"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>学员列表</title>
	</head>
	<body  background=background1.jpg>
		<h2><p align="center"><font size="5" color="blue">学员列表</font></p></h2>
		<div align="center">
	<table width="70%" border="1" cellpadding="3" cellspacing="1">
	<tr bgcolor="#3366cc">
			<td width="10%" align="center"><font size="4" color="#FFFFFF"><b>姓名</b></font></td>
			<td width="10%" align="center"><font size="4" color="#FFFFFF"><b>用户名</b></font></td>
			<td width="10%" align="center"><font size="4" color="#FFFFFF"><b>性别</b></font></td>
			<td width="10%" align="center"><font size="4" color="#FFFFFF"><b>电话号</b></font></td>
			<td width="10%" align="center"><font size="4" color="#FFFFFF"><b>教练</b></font></td>         
			<td width="10%" align="center"><font size="4" color="#FFFFFF"><b>报考类型</b></font></td>
			<td width="13%" align="center"><font size="4" color="#FFFFFF"><b>操作</b></font></td>
			</tr>
			<%
				ResultSet users_rs=stu.show_all_stus();		
				int i=0;		
				while(users_rs.next())
				{
			%> 
				<tr>
						<td width="10%" align="center"><%=users_rs.getString("s_name")%></td>
						<td width="10%" align="center"><%=users_rs.getString("s_username")%></td>
						<td width="10%" align="center"><%=users_rs.getString("s_sex")%></td>
                        <td width="10%" align="center"><%=users_rs.getString("s_phone")%></td>
						<td width="10%" align="center"><%=users_rs.getString("s_coach")%></td>
						<td width="10%" align="center"><%=users_rs.getString("s_c_type")%></td>
                        <td width="10%" align="center">
                        	<a href="xiangxi_stu.jsp?student_id=<%=users_rs.getInt("student_id") %>">详情</a>
							<a href="delete_stu.jsp?student_id=<%=users_rs.getInt("student_id") %>">删除</a>
							<a href="motify_stu.jsp?student_id=<%=users_rs.getInt("student_id") %>">修改</a>
                        </td> 
			       </tr>
			<%		 	
			        }
			%>
		</table>
		</div>
		<div style="height: 20px"></div>	
		<center>
		<input type="button"  value="添加新学员" onclick='location.href=("add_student.jsp")'>
  	 	<input type="button" onclick='location.href=("add_learnrecord.jsp")' value="返回首页"></input>
  	 	<!-- <input type="button" name="goback" value="返回上一页" onClick="javascript:window.history.go(-1)"> -->
  	 </center>
	</body>
</html>
