<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p> <fmt:parseDate value="20220216114600" pattern="yyyyMMddHHmmss"/>
	<p> <fmt:parseDate pattern="yyyyMMddHHmmss">20220216114600</fmt:parseDate>
	<p> <fmt:parseDate value="20220216114600" pattern="yyyyMMddHHmmss"
			var="date" scope="page"/>
	<p> <fmt:formatDate value="${date}" pattern="yyyy-MM-dd HH:mm"/>
</body>
</html>