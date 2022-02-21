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
		String session_id = session.getId();
	
		long last_time = session.getLastAccessedTime();
		long start_time= session.getCreationTime();
		
		long user_time = (last_time-start_time)/60000;
	%>
	<p> 세션 아이디 : <%=session_id %>
	<p> 요청시작시간 : <%=start_time %>
	<p> 요청마지막시간 : <%=last_time %>
	<p> 웹사이트 경과 시간 : <%=user_time %>
</body>
</html>