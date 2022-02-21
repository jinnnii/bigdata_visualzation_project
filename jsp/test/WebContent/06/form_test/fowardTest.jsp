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
		int age = Integer.parseInt(request.getParameter("age"));
		
		if(age<20){%>
			<script>
				alert('19세 미만이므로 입장 불가능');
				history.go(-1);
			</script>
<!-- 			pageContext.forward("fowardForm.jsp"); -->
	<%
		}else{
// 			request.setAttribute("name","홍길동");
			
// 			RequestDispatcher dispatcher = request.getRequestDispatcher("fowardResult.jsp");
// 			dispatcher.forward(request, response);

%>

			<jsp:forward page="fowardResult.jsp">
				<jsp:param value="<%=java.net.URLEncoder.encode("홍길동") %>" name="name"/>
			</jsp:forward>
	<%	}
	%>
</body>
</html>