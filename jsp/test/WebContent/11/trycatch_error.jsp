<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ page errorPage = "errorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	오류가 발생하였습니다.<br>
	<p><%="숫자1 : "+request.getParameter("num1") %>
	<p><%="숫자2 : "+request.getParameter("num2") %>
</body>
</html>