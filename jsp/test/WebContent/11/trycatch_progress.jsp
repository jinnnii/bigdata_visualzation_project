<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--     <%@ page errorPage="exception_error.jsp" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	try {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int result = num1 / num2;
		out.print(num1 + "/" + num2 + "=" + result);
		
	} catch (Exception e) {
		RequestDispatcher dispatcher = request.getRequestDispatcher("trycatch_error.jsp");
		dispatcher.forward(request, response);
	}
	%>
</body>
</html>