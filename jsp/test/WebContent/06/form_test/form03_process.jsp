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
		request.setCharacterEncoding("utf-8");
		String[] fruits = request.getParameterValues("fruit");
		out.println("<h3>선택한 과일</h3><br>");
		
		for(String f : fruits){
			out.println(f);	
		}
	%>

</body>
</html>