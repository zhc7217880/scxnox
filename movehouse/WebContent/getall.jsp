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
		<table border="1px" width="700px">
			<tr>
				<td>起始地区</td>
				<td>所用车型</td>
				<td>搬家日期</td>
				<td>联系人</td>
				<td>联系电话</td>
				<td>状态</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${ list }" var="move">
			<tr>
				<td>${ move.area }</td>
				<td>${ move.cartype }</td>
				<td>${ move.movedate }</td>
				<td>${ move.contact }</td>
				<td>${ move.phone }</td>
				<td>${ move.status }</td>
				<td>
					<a href="${ pageContext.request.contextPath }/MoveServlet?method=edit&id=${ move.id }">处理</a>
					<a href="${ pageContext.request.contextPath }/MoveServlet?method=showOne&id=${ move.id }">详情</a>
				</td>
			</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>