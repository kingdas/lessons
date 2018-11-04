<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>新增练习记录</title>
  </head>
  
  <body background=background1.jpg>
	   <h2><p align="center"><font size="5" color="#0000FF">新增练习记录</font></p></h2>
		<div align="center">
		<form  method="post" action="add_leaRe_save.jsp" accept-charset="utf-8">
		<table width="80%" border="0">
		<tr>
		<td width="40%" align="right"><font color="blue"><b>学员手机号：</b></font></td>
		<td width="60%" align="left"><input type="text" name="student_id"  size="40" maxlength="11" style="width: 313px;"></td>
		</tr>
		<tr>
		<td width="40%" align="right"><font color="blue"><b>练习里程：</b></font></td>
		<td width="60%" align="left"><input type="text" name="l_juli" size="40" maxlength="2" style="width: 313px;"></td>
		</tr>
                <tr>
		<td width="40%" align="right"><font color="blue"><b>练习时长：</b></font></td>
		<td width="60%" align="left"><input type="text" name="time"   size="40" maxlength="3" style="width: 313px;"></td>
		</tr>
		<tr>
		<td width="40%" align="right"><font color="blue"><b>科目类别：</b></font></td>
		<td width="60%" align="left"><select name="subject" style="width: 313px;">
				<option value="keer">科目二</option>
				<option value="kesan">科目三</option>
			</select>
			</td>
		</tr>
		<tr>
		<td width="40%" align="right"><font color="blue"><b>教练车牌号：</b></font></td>
		<td width="60%" align="left"><select name="car_number" style="width: 313px;">
				<option value="N04566">豫N04566学</option>
				<option value="N02458">豫N02458学</option>
				<option value="N06697">豫N06697学</option>
				<option value="N04486">豫N04486学</option>
				<option value="N00052">豫N00052学</option>
				<option value="N00450">豫N00450学</option>
				<option value="N06489">豫N06489学</option>
			</select></td>
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
	
	</body>
</html>
