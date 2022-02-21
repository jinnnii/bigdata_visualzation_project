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
		
		if(id.equals("admin")&&pass.equals("admin1234")){
			session.setAttribute("userID", id);
			session.setAttribute("userPW", pass);
			
			response.sendRedirect("welcome.jsp");
		}
	%>
</body>
</html>