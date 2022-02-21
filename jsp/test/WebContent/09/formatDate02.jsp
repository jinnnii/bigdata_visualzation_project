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
	<p> date : <fmt:formatDate value="${now}" type="date"/> </p>
	<p> time : <fmt:formatDate value="${now}" type="time"/> </p>
	<p> both: <fmt:formatDate value="${now}" type="both"/> </p>
	<p> with pattern: <fmt:formatDate value="${now}" type="both" pattern ="yyyy년 MM월 dd일 HH시 mm분 ss초 E요일"/> </p>
	<h4>----dateStyle----</h4>
	<p> default: <fmt:formatDate value="${now}" type="both" dateStyle="default"/> </p>
	<p> short: <fmt:formatDate value="${now}" type="both" dateStyle="short"/> </p>
	<p> medium: <fmt:formatDate value="${now}" type="both" dateStyle="medium"/> </p>
	<p> long: <fmt:formatDate value="${now}" type="both" dateStyle="long"/> </p>
	<p> full: <fmt:formatDate value="${now}" type="both" dateStyle="full"/> </p>
</body>
</html>