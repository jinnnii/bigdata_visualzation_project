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
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	
	if(id.equals("admin")&&pass.equals("1234")){
		session.setAttribute("userId", id);
		session.setAttribute("userPW", pass);
		out.println("세션 설정이 성공했습니다<br>");
		out.println(id+"님 환영합니다");
	}else{
		out.println("세션 설정 실패");
	}
%>
</body>
</html>