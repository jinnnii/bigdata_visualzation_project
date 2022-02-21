<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Processing</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone1")
				+"-"+request.getParameter("phone2")
				+"-"+request.getParameter("phone3");
		String gender = request.getParameter("gender");
		String[] hobby= request.getParameterValues("hobby");
		String comment = request.getParameter("comment");
	%>
	
	<p>아이디 : <%=id %></p>
	<p>비밀번호 : <%=passwd %></p>
	<p>이름 : <%=name %></p>
	<p>연락처 : <%=phone %></p>
	<p>성별 : <%=gender %></p>
	<p>취미 : <%
		if (hobby !=null){
			for (String h : hobby){
				out.println(" "+h);
			}
		}
		%></p>
	<p>자기소개 : <%=comment %></p>
</body>
</html>