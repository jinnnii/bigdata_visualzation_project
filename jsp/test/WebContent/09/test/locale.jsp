<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <%@ page import = "java.util.Locale" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% Locale locale = request.getLocale();
		String lang = locale.getLanguage();
		String ctr = locale.getCountry();
	%>
	<h3>현재 로케일</h3>
	<p>언어 : <%=lang %></p>
	<p>국가 : <%=ctr %></p>
</body>
</html>