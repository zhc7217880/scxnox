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
	<form action="${ pageContext.request.contextPath }/MoveServlet?method=deal&id=${ move.id }" method="post">
		<table>
			<input type="hidden" name="${ move.id }">
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
				<td>
				<select name="status">
						<option value="0">未处理</option>
						<option value="1">已派车</option>
						<option value="2">已结束</option>
				</select>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="提交">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>