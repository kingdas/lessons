<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<script language="javascript" type="text/javascript">
	function chkName(name) {
		$.ajax({
			url : "AjaxTest?name=" + name + "&version=" + Math.random(),
			type : "get",
			success : function(msg) {
				//$("#err").html(msg);
				var obj=eval("("+msg+")");
				alert(msg);
				alert(obj);
				$("#err").html(obj.code + ":" + obj.content);
			}
		});
	}
</script>
</head>
<body>
	<font color="red"><span id="err">*</span></font>
	<input type="text" onblur="chkName(this.value)" />
</body>
</html>