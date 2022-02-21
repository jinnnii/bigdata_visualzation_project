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
	<jsp:useBean id="now" class="java.util.Date"/>
	<p> date 형식 : <fmt:formatDate value="${now}" type="date"/> </p>
	<p> time 형식 : <fmt:formatDate value="${now}" type="time"/> </p>
	<p> both 형식 : <fmt:formatDate value="${now}" type="both"/> </p>
</body>
</html>