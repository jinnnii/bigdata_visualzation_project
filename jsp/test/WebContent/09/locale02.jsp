<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "java.util.Locale" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setContentType("text/html");
		response.setHeader("Content-Language","es");
		String title = "Espa&ntilde;ol";
	%>
	<h3>타이틀 : <%=title %></h3>
	<p> Idioma : <%=title %></p>
	<p> &iexcl;Hola Mundo!</p>
</body>
</html>