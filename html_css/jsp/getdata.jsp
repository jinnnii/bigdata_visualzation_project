<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
<title>GET 방식 요청</title>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
</head>
<body>
<!-- JSP 문법 작성 -->
	<%
	String strName=request.getParameter("name");
	String strMajor=request.getParameter("major");
	out.println("이름 :" + strName + "<br/>");
	out.println("학과 :" + strMajor + "<hr/>");
	%>
	웹 브라우저 URL 주소 입력 부분을 살펴보세요.
</body>
</html>
