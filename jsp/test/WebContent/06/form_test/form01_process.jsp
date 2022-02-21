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
		String name = request.getParameter("name");
		String add = request.getParameter("add");
		String email = request.getParameter("email");
	%>
	
	<p> 아이디 : <%= name %><br>
	<p> 주소 : <%= add %><br>
	<p> 이메일 : <%= email %><br>
</body>
</html>