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
	<p>숫자 : <fmt:formatNumber value="1234.567" type="number"/> </p>
	<p>통화 : <fmt:formatNumber value="1234.567" type="currency" currencySymbol="원"/> </p>
	<p>퍼센트 : <fmt:formatNumber value="1234.567" type="percent"/> </p>
	<p>패턴(.0000) : <fmt:formatNumber value="1234.567" pattern=".0000"/> </p>
</body>
</html>