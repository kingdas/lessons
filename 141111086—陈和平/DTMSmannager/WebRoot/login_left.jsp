<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>欢迎使用员工工资管理系统</title>
     <style>
       
           a{
           		color:red;
               font-size:18px;
               font-family:Arial, Helvetica,sans-serif;
            }
           a:link{
              color:red;
              text-decoration:none;
                 }
           a:visited{
              color:black;
           text-decoration:none;
                 }
           a:hover{
               color:yellow;
           text-decoration:underline;
           background-color:blue;
                  }
        </style>
              
	</head>
	<body bgcolor="##AFEEEE" background="login_left.png" style="background-size: 250px 100%" >
		<h1 align="center"><font color=blue>导航栏</font></h1>
		<p align="center">
		
			学员信息管理&nbsp;&nbsp;</br>
                        <a href="add_student.jsp" style="color: red;"  target="buttomFrame">新增学员信息
</a>&nbsp;&nbsp;</br>
                        <a href="list_stu.jsp" style="color: red;"   target="buttomFrame">学员信息列表
</a>&nbsp;&nbsp;</br></br>
                       
                         
                     试题信息管理&nbsp;&nbsp;</br>
                        <a href="add_question.jsp" style="color: red;" target="buttomFrame">新增试题信息
</a>&nbsp;&nbsp;</br>   
                        <a href="list_que.jsp" style="color: red;"   target="buttomFrame">试题信息列表
</a>&nbsp;&nbsp;</br></br>
		        练习信息管理 &nbsp;&nbsp;</br>
                        
                        <a href="list_lr.jsp"  style="color: red;"  target="buttomFrame">学员练习信息列表
</a>&nbsp;&nbsp;</br>
<a href="add_learnrecord.jsp" style="color: red;" target="buttomFrame">新增学员练习记录
</a>&nbsp;&nbsp;</br>
</br>
</br>
			
                        
			<a href="logout.jsp" target="_top">退出登录</a>&nbsp;&nbsp;</br>
		</p>
	</body>
</html>