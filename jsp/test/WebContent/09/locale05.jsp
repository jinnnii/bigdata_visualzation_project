<%@page import="java.text.DateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.text.NumberFormat"%>
 <%@ page import = "java.util.Locale" %>
 <%@ page import = "java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Locale locale = request.getLocale();
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
		NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
	%>
	<p> 국가 : <%=locale.getDisplayCountry() %></p>
	<p> 날짜 : <%=dateFormat.format(new Date()) %></p>
	<p> 숫자(12345.67) : <%=numberFormat.format(12345.67) %></p>
</body>
</html>