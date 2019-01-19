<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>编号</td>
			<td>名称</td>
			<td>状态</td>
			<td>删除标记</td>
			<td>操作</td>
			
		</tr>
		<c:forEach items="${adminList}" var="admin">
		<tr>
			<td>${admin.id}</td>
			<td>${admin.adminName}</td>
			<td>${admin.adminstatus}</td>
			<td>${admin.isDel}</td>
			<td><a href="delAdminById?id=${admin.id}">删除</a></td>
		</tr>
		</c:forEach>
		
	</table>
</body>
</html>