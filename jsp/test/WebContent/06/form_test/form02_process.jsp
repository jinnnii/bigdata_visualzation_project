<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		Enumeration paramName = request.getParameterNames();
		
		while(paramName.hasMoreElements()){
			String name = (String)paramName.nextElement();
			String value = request.getParameter(name);
			out.println(name+" : "+value+"<br>");
		}
	%>
</body>
</html>