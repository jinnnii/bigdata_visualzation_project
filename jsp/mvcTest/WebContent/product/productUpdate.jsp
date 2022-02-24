<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>제품 수정</h2>
	<form action="productUpdate" method="post">
		<table>
			<tr>
				<td><label>제품 아이디</label></td>
				<td>${product.pid}<input type="hidden" name="pid"
					value="${product.pid}" /></td>
			</tr>
			<tr>
				<td><label id="pname">제품명</label></td>
				<td><input type="text" name="pname" id="pname"
					value="${product.pname}" /></td>
			</tr>
			<tr>
				<td><label id="price">제품 가격</label></td>
				<td><input type="text" name="price" id="price"
					value="${product.price}" /></td>
			</tr>
			<tr>
				<td><label>등록일자</label></td>
				<td>${product.regdate}</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="수정" />
					<input type="button" value="목록"
					onclick="location.href='productList'" /></td>
			</tr>
		</table>
	</form>
</body>
</html>