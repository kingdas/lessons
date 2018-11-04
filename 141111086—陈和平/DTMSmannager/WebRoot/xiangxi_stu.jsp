<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:useBean class="com.StudentTable" id="stu" scope="session"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>详细信息</title>
    <style type="text/css">
    .gridtable{
    margin: 5px auto 0;
    
    }
    </style>
  </head>
  
  <body background=background1.jpg>
  <h2><p align="center"><font size="5" color="blue">学员详细信息</font></p></h2>
  	<%
  		int id = Integer.parseInt(request.getParameter("student_id"));
  		stu.setStuent_id(id);
  		 if(stu.init()){
  		String date = new SimpleDateFormat("yyyy-MM-dd").format(stu.getS_time());
  			%>
  			<table class="gridtable" width="70%" border="1" cellpadding="3" cellspacing="1">
                <tr>
                    <td class="gridtable_td" bgcolor="#37b5f8" style="width: 150px">
                        姓名
                    </td>
                    <td style="width: 200px">
                        <%=stu.getS_name() %>
                    </td>
                    <td class="gridtable_td" bgcolor="#37b5f8" style="width: 150px">
                        性别
                    </td>
                    <td style="width: 200px">
                        <%=stu.getS_sex() %>
                    </td>
                </tr>
                <tr>
                <td class="gridtable_td" bgcolor="#37b5f8" >
                        年龄
                    </td>
                    <td style="width: 200px">
                        <%=stu.getS_age() %>
                    </td>
                
                <td class="gridtable_td" bgcolor="#37b5f8" >
                        身份证号
                    </td>
                    <td style="width: 200px">
                        <%=stu.getS_cardid() %>
                    </td>
                </tr>
                <tr>
                    <td class="gridtable_td" bgcolor="#37b5f8" >
                        电话
                    </td>
                    <td>
                        <%=stu.getS_phone() %>
                    </td>
                    <td class="gridtable_td" bgcolor="#37b5f8" >
                        教练
                    </td>
                    <td>
                       <%=stu.getS_coach() %>
                    </td>
                </tr>
                <tr>
                    <td class="gridtable_td" bgcolor="#37b5f8" >
                        报名时间
                    </td>
                    <td>
                        <%=date %>
                    </td>
                    <td class="gridtable_td" bgcolor="#37b5f8" >
                        是否取得驾驶证
                    </td>
                    <td>
                        <%=stu.getS_result() %>
                    </td>
                </tr>
                <tr>
                    <td class="gridtable_td" bgcolor="#37b5f8" >
                        现住址
                    </td>
                    <td>
                        <%=stu.getS_address() %>
                    </td>
                    <td class="gridtable_td" bgcolor="#37b5f8" >
                        户籍所在地址
                    </td>
                    <td>
                        <%=stu.getS_d_address() %>                    </td>
                </tr>
                <tr>
                    <td class="gridtable_td" bgcolor="#37b5f8" >
                        是否初次申领
                    </td>
                    <td>
                        <%=stu.getS_statue() %>
                    </td>
                    <td class="gridtable_td" bgcolor="#37b5f8" >
                        考试车型
                    </td>
                    <td>
                        <%=stu.getS_c_type() %>
                    </td>
                </tr>
                <tr>
                    <td class="gridtable_td" bgcolor="#37b5f8" >
                        缴费情况
                    </td>
                    <td>
                        <%=stu.getS_free_statue() %>
                    </td>
                    <td class="gridtable_td" bgcolor="#37b5f8" >
                        获得优惠
                    </td>
                    <td>
                        <%=stu.getS_discount() %>
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
