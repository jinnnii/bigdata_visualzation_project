<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="dbconn.jsp" %>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String name = request.getParameter("name");
	
	Statement stmt = null;
	
	try{
		String sql =String.format("INSERT INTO MEMBER(ID, PASSWD, NAME)VALUES('%s','%s','%s')",id, passwd, name);
		stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		out.print("Member 테이블 삽입 성공");
		
	}catch(SQLException ex){
		out.print("Member 테이블 삽입 실패<br>");
		out.print("SQLException : "+ex.getMessage());
		
	}finally{
		if(stmt !=null) stmt.close();
		if(conn !=null) conn.close();
	}
%>
</body>
</html>