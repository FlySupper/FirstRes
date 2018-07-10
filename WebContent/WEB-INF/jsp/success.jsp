<%@page import="org.springframework.web.context.request.RequestScope"%>
<%@page import="org.springframework.web.bind.annotation.RequestParam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	id查询产品：${requestScope.product}
	<br>
	<hr>
	class查询产品：${requestScope.product_class}
	<br>
	<hr>
	n_name查询新闻内容：${requestScope.news}
	<br>
	<hr>
	<h2>产品类别</h2>
	<table border="1">
		<tr>
			<th>产品类别</th>
		</tr>
		<c:forEach items="${PCnames}" var="pcnames">
			<tr>
				<td><a href="selectProductbyclass.action?name=${pcnames}">${pcnames }</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<hr>
	荣誉：${requestScope.HonorPicture}
	<br>
	<hr>
</body>
</html>