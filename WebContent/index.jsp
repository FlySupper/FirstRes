<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<br>
<br>
    <h2>通过id号查询产品内容</h2>
	<form action="selectProductbyid.action">
	输入id号<input type="text" name="id">
	<input type="submit" value="查询">
	</form>
	<br>
	<br>
	<h2>查询产品类别</h2>
	
	<a href="selectPCNames.action">查询产品类别</a>
	<br>
	<br>
	<a href="selecthonor.action">selecthonor</a>
	<br>
	<br>
	<a href="selectProductbyclass.action">selectProductbyclass</a>
	<br>
	<br>
    <a href="selectnewsbytitle.action">selectnewsbytitle</a>
	<br>
	<br>
	<form action="addMessage.action" method="post">
		留言内容：<input type="text" name="m_text"> <br><br>
		姓名：<input type="text"name="m_name"><br><br>
	       手机号：<input type="text" name="m_phoneNumber"><br><br>
		邮箱：<input type="text" name="m_mailbox"> <br><br>
		<input type="submit"value="提交">
	</form>
	
	
</body>
</html>