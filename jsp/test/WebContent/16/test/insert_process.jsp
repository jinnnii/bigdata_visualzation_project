<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../dbconn.jsp" %>
<%
	request.setCharacterEncoding("utf-8");
	String sno = request.getParameter("sno");
	String dept = request.getParameter("dept");
	String name = request.getParameter("name");
	String add = request.getParameter("add");
	String phone = request.getParameter("phone");
	
	PreparedStatement pstmt = null;
	
	try{
		String sql="INSERT INTO STUDENT(NUM, DEPART, NAME, ADDRESS, PHONE) VALUES(?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, sno);
		pstmt.setString(2, dept);
		pstmt.setString(3, name);
		pstmt.setString(4, add);
		pstmt.setString(5, phone);
		pstmt.executeUpdate();
		
		out.print("데이터 삽입 성공");
		
	}catch(SQLException e){
		out.print(e.getMessage());
	}finally{
		if(pstmt!=null) pstmt.close();
		if(conn!=null) conn.close();
	}
%>
</body>
</html>