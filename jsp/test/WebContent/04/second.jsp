<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action Tag</title>
</head>
<body>
	<h3>이 파일은 second.jsp 입니다.</h3>
	Today is : <%= request.getParameter("date")%>
	<p>=====second.jsp의 페이지======</p>
</body>
</html>