<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.text.DateFormat"%>
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
		String date = DateFormat.getDateTimeInstance(DateFormat.FULL,
			DateFormat.SHORT, locale).format(new Date());
	%>
	<p> 로케일의 날짜 형식</p>
	<p> <%=date %></p>
</body>
</html>