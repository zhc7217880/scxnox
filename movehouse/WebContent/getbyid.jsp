<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		<table>
			<tr>
				<td>起始地区：</td>
				<td>${ move.area }</td>
			</tr>
			<tr>
				<td>所用车型：</td>
				<td>${ move.cartype }</td>
			</tr>
			<tr>
				<td>搬家日期：</td>
				<td>${ move.movedate }</td>
			</tr>
			<tr>
				<td>联系人：</td>
				<td>${ move.contact }</td>
			</tr>
			<tr>
				<td>联系电话：</td>
				<td>${ move.phone }</td>
			</tr>
			<tr>
				<td>状态：</td>
				<td>${ move.status }</td>
			</tr>
		</table>
	</form>
</body>
</html>