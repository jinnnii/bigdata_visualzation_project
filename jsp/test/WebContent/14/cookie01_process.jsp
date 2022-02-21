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
		
		if(id.equals("admin")&&pass.equals("1234")){
			Cookie cookie_id = new Cookie("userId",id);
			Cookie cookie_pw = new Cookie("userPw",pass);
			response.addCookie(cookie_id);
			response.addCookie(cookie_pw);
			out.print("쿠키 생성 성공!<br>");
			out.print(id+"님 환영합니다 :-)<br>");
		}else{
			out.print("쿠키 생성 실패!");
		}
	%>
</body>
</html>