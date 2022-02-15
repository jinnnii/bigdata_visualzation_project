<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
	%>
	
	<p> 문자 인코딩 : <%= response.getCharacterEncoding() %><br>
	<p> 콘텐츠 유형 : <%= response.getContentType()%><br>
	
	<%
		response.sendError(404, "요청페이지를 찾을 수 없음둥");
	%>
</body>
</html>