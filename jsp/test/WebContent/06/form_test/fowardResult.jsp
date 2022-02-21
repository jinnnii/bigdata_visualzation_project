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
	String name = request.getParameter("name");
	out.println("fowrad 방식으로 이동된 페이지<br>");
	out.println("이름: "+name+"<br>");
// 	out.println("이름: "+(String)request.getAttribute("name")+"<br>");
	out.println("나이: "+request.getParameter("age"));
	%>
</body>
</html>