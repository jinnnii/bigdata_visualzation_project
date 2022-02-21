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
	<p>패턴(없음) : <fmt:parseNumber value="1234.567"/> </p>
	<p>패턴(0000.000) : <fmt:parseNumber value="1234.567" pattern="0000.000"/> </p>
	<p>패턴(####.###) : <fmt:parseNumber value="1234.567" pattern="####.###"/> </p>
</body>
</html>