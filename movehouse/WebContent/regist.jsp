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
	<form action="${ pageContext.request.contextPath }/MoveServlet?method=regist" method="post">
		<table border="1px" width="700px">
			<tr>
				<td>起始地区：</td>
				<td>
					<select name="area">
						<option value="海淀区">海淀区</option>
						<option value="朝阳区">朝阳区</option>
						<option value="西城区">西城区</option>
						<option value="东城区">丰台区</option>
						<option value="大兴区">大兴区</option>
						<option value="石景山">石景山</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>所用车型：</td>
				<td>
					<input type="radio" name="cartype" value="金杯">金杯
					<input type="radio" name="cartype" value="皮卡">皮卡
					<input type="radio" name="cartype" value="厢式小货" checked>厢式小货
					<input type="radio" name="cartype" value="1041货车">1041货车
				</td>
			</tr>
			<tr>
				<td>搬家日期：</td>
				<td>
					<input type="text" name="movedate">
				</td>
			</tr>
			<tr>
				<td>联系人：</td>
				<td>
					<input type="text" name="contact">
				</td>
			</tr>
			<tr>
				<td>联系电话：</td>
				<td>
					<input type="text" name="phone">
					<input type="hidden" name="status" value="1">
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="预约登记">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>