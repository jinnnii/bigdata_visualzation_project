<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	if (response.getStatus() == 500) {
	%>
	<p>
		오류 발생 :
		<%=exception.getMessage()%>
		<jsp:include page="exception.jsp"></jsp:include>
		<%
		} else {
		%>
	
	<p>
		오류 발생 코드 :
		<%=response.getStatus()%><br>
		<a href="exception.jsp">처음페이지로 돌아가기</a>
		<%
		}
		%>
	
</body>
</html>