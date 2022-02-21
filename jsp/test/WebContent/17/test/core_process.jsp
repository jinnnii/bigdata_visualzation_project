<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String score = request.getParameter("score");
%>
<c:set var="score" value="<%=score %>"/>
<c:choose>
	<c:when test="${score>=90 }">
		점수 ${score}은 A학점입니다.
	</c:when>
	<c:when test="${score>=80 }">
		점수 ${score}은 B학점입니다.
	</c:when>
	<c:when test="${score>=70 }">
		점수 ${score}은 D학점입니다.
	</c:when>
	<c:otherwise>		
		점수 ${score}은 F학점입니다.
	</c:otherwise>
</c:choose>
</body>
</html>