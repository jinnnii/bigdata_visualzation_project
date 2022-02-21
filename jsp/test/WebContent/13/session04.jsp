<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>-----세션을 삭제하기 전-----</h4>
	<%
		String id = (String)session.getAttribute("userId");
		String pass = (String)session.getAttribute("userPW");
		out.print("userId : "+id+"<br>");
		out.print("userPW : "+pass+"<br>");
		
		session.removeAttribute("userId");
	%>
	
	<h4>-----세션을 삭제한 후-----</h4>
	<%
		id = (String)session.getAttribute("userId");
		pass = (String)session.getAttribute("userPW");
		out.print("userId : "+id+"<br>");
		out.print("userPW : "+pass+"<br>");
		
		session.removeAttribute("userId");
	%>
	
</body>
</html>