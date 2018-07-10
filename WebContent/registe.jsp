<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/file/jquery-1.8.3.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
   $(function(){
	   
	   $("#username").blur(function(){
		  
		   var username=$(this).val();
		   alert(username);
	   });
   });
</script>
</head>

<body>
<script type="text/javascript" src="/file/jquery-2.1.0.js"></script>
<form id="form">
    用户名：<input type="text" name="username" id="username"><br><br>
    密码：<input type="password" name="password">
    
</form>
</body>
</html>