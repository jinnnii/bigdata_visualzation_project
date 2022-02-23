<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품 목록</title>
</head>
<body>
	<h2>제품 목록</h2>
	<table border="1">
		<tr>
			<td colspan="4" style="text-align: right;">
				<a href="productWrite">제품 등록</a>
			</td>
		</tr>
		<tr>
			<th>제품 아이디</th>
			<th>제품명</th>
			<th>제품 가격</th>
			<th>등록일</th>
		</tr>
		<c:forEach var="product" items="${productList}">
		<tr>
			<td>${product.pid }</td>
			<td>${product.pname }</td>
			<td>${product.price }</td>
			<td><fmt:formatDate type="both" value="${product.reqdate }"/></td>
			<td><a href="productUpdate?pid=${product.pid}">수정</a></td>
			<td><a href="productDelete?pid=${product.pid}">삭제</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>