<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>----- 세션을 삭제하기 전 -----</h4>
	<%
		String id = (String) session.getAttribute("userId");
		String pass = (String) session.getAttribute("userPW");
	%>
	
	<p> 설정된 세션의 속성 값[1] : <%=id %></p>
	<p> 설정된 세션의 속성 값[2] : <%=pass %></p>
	
	<%
		if(request.isRequestedSessionIdValid()==true){
			out.print("세션이 유효합니다.");
		}else{
			out.print("세션이 유효하지 않습니다.");
		}
	
		session.invalidate();
	%>
	<h4>----- 세션을 삭제한 후 -----</h4>
	<%
		if(request.isRequestedSessionIdValid()==true){
			out.print("세션이 유효합니다.");
		}else{
			out.print("세션이 유효하지 않습니다.");
		}
	%>
</body>
</html>