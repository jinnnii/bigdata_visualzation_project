<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page errorPage="exception_error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		if(id==null|| "".equals(id)|| passwd==null|| "".equals(passwd)){
			throw new ServletException("요청 파라미터 값이 없습니다.");
		}
	%>
	id : <%=id %> <br>
	password : <%=passwd %>
</body>
</html>