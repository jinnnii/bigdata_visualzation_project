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
		NumberFormat curency = NumberFormat.getCurrencyInstance(locale);
		NumberFormat percentage = NumberFormat.getPercentInstance(locale);
		
		String fcurency = curency.format(1234567);
		String fpercentage = percentage.format(0.25);
	%>
	<p> 로케일의 통화 형식 : <%=fcurency %></p>
	<p> 로케일의 비율 형식 : <%=fpercentage %></p>
</body>
</html>