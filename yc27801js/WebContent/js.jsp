<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function checkName(name) {
		//alert(name);
		//
		/* var xhr = new XMLHttpRequest();
		//xhr.readyState 0初始,1open,2send,3处理中,4处理完成
		//xhr.onreadystatechange//当readyState值改变时，onreadystatechange指定的方法会被调用
		//xhr.responseText//返回的数据
		xhr.open("post", "http://localhost:8088/yc27801js/MyServlet?name="
				+ name, true);//异步;为请求做好准备1
		xhr.send(null);//发送请求2
		//请求发给服务后，服务器要进行处理3
		//处理完成4 */

		var xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				if (xhr.responseText == '1') {
					document.getElementById("err").innerHTML = "用户名已存在";
				} else {
					document.getElementById("err").innerHTML = "*";
				}
			}
		};
		xhr.open("post", "http://localhost:8088/yc27801js/MyServlet?name="
				+ name, true);
		xhr.send(null);
	}
</script>
</head>
<body>
	用户名：
	<input type="text" name="name" onblur="checkName(this.value)">
	<font color="red"><span id="err">*</span></font>
</body>
</html>