<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>新增学员</title>
  </head>
  
  <body background=background1.jpg>
	   <h2><p align="center"><font size="5" color="#0000FF">新增学员基本信息</font></p></h2>
		<div align="center">
		<form  method="post" action="add_users_save.jsp" accept-charset="utf-8">
		<table width="80%" border="0">
		<tr>
		<td width="40%" align="right"><font color="blue"><b>姓名：</b></font></td>
		<td width="60%" align="left"><input type="text" name="s_name"  size="40" maxlength="4"></td>
		</tr>
		<tr>
		<td width="40%" align="right"><font color="blue"><b>密码：</b></font></td>
		<td width="60%" align="left"><input type="password" name="s_password" size="40" maxlength="15"></td>
		</tr>
                <tr>
		<td width="40%" align="right"><font color="blue"><b>年龄：</b></font></td>
		<td width="60%" align="left"><input type="text" name="s_age"   size="40" maxlength="1"></td>
		</tr>
		<tr>
		<td width="40%" align="right"><font color="blue"><b>身份证号：</b></font></td>
		<td width="60%" align="left"><input type="text" name="s_cardid"   size="40" maxlength="1"></td>
		</tr>
		<tr>
		<td width="40%" align="right"><font color="blue"><b>性别：</b></font></td>
		<td width="60%" align="left"><input type="text" name="s_sex"   size="40" maxlength="1"></td>
		</tr>
                <tr>
		<td width="40%" align="right"><font color="blue"><b>电话：</b></font></td>
		<td width="60%" align="left"><input type="text" name="s_phone"   size="40" maxlength="11"></td>
		</tr>
                <tr>
		<td width="40%" align="right"><font color="blue"><b>教练：</b></font></td>
		<td width="60%" align="left"><input type="text" name="s_coach"   size="40" maxlength="4"></td>
		</tr>
		
                <tr>
		<td width="40%" align="right"><font color="blue"><b>现住址：</b></font></td>
		<td width="60%" align="left"><input type="text" name="s_address"   size="40" ></td>
		</tr>
			 <tr>
		<td width="40%" align="right"><font color="blue"><b>户籍所在地：</b></font></td>
		<td width="60%" align="left"><input type="text" name="s_d_address"   size="40"></td>
		</tr>
		 <tr>
		<td width="40%" align="right"><font color="blue"><b>是否初次申领：</b></font></td>
		<td width="60%" align="left"><input type="text" name="s_statue"   size="40" maxlength="1"></td>
		</tr>
		<tr>
		<td width="40%" align="right"><font color="blue"><b>报考车型：</b></font></td>
		<td width="60%" align="left"><input type="text" name="s_c_type"   size="40" maxlength="3"></td>
		</tr>
		<tr>
		<td width="40%" align="right"><font color="blue"><b>缴费情况：</b></font></td>
		<td width="60%" align="left"><input type="text" name="s_free_statue"   size="40" maxlength="10"></td>
		</tr>
		<tr>
		<td width="40%" align="right"><font color="blue"><b>获得优惠：</b></font></td>
		<td width="60%" align="left"><input type="text" name="s_discount"   size="40" maxlength="20"></td>
		</tr>
           
                <td colspan="2" align="center">
		<br>
		<input type="submit" name="sub" value="提&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;交">&nbsp;&nbsp;
		<input type="reset" name="res" value="重&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;填">&nbsp;&nbsp;
		<input type="button" name="goback" value="返回上一页" onClick="javascript:window.history.go(-1)">
		</td>
		</tr>		
		</table>
		</form>
		</div>
	
	</body>
</html>
