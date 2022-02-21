<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isErrorPage = "true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	오류가 발생하였습니다 <br>
	예외 유형 <%= exception.toString() %><br>
	오류메시지 : <%= exception.getMessage() %>
</body>
</html>