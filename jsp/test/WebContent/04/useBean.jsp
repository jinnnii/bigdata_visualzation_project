<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="gugudan" class="test.GuGuDan" scope="request" />
	<% for (int i=1; i<10; i++){
		int result= gugudan.process(5, i);
		out.println("5x"+i+"="+result);
	}
	%>
</body>
</html>