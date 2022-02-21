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
	Cookie[] cookies = request.getCookies();

	for(int i=0; i<cookies.length;i++){
		String name = cookies[i].getName();
		String value = cookies[i].getValue();
		if (name.equals("userId")){
			if(value.equals("") || value==null){
				response.sendRedirect("cookie_out.jsp");
			}
			
			out.print(value+"님 반갑습니다 :-)");
		}
	}
%>
	<a href='cookie_out.jsp'>로그아웃</a>
</body>
</html>