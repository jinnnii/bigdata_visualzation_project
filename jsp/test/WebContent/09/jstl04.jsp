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
	<p> ------ 기본 로케일 ------
	<fmt:setBundle basename="resourceBundle.myBundle" var="resourceBundle"/>
	<p> 제목 : <fmt:message bundle="${resourceBundle }" key="title"/>
	<p> <fmt:message bundle="${resourceBundle }" key="username" var="userMsg"/>
		이름 : ${userMsg }
		
	<p> ------ 영문 로케일 ------
	<fmt:setLocale value="en"/>
	<fmt:setBundle basename="resourceBundle.myBundle" var="resourceBundle"/>
	<p> 제목 : <fmt:message bundle="${resourceBundle }" key="title"/>
	<p> 이름 : <fmt:message bundle="${resourceBundle }" key="username"/>
</body>
</html>