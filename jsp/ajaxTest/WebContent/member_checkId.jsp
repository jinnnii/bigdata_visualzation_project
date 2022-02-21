<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
	<%
	Connection conn = null;
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String user = "scott";
	String password = "tiger";

	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn = DriverManager.getConnection(url, user, password);
	%>
	
	<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	//아이디 값 중복 여부 1:중복 아님 / 0: 중복
	int checkId = 0;
	
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	try{
		String sql = "SELECT * FROM MEMBER WHERE ID=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		
		if(id.equals("")||rs.next()==true){
			// 중복 아이디
			checkId = 0;
		}else{
			checkId=1;
		}
		
	}catch(SQLException e){
		out.println("MEMBER 테이블 호출 실패 <br>");
		out.println("SQLException : "+ e.getMessage());
	}finally{
		if(conn!=null) conn.close();
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
	}
	
	if(checkId == 0){
		out.println(0); // 중복
	}else{
		out.println(1); // 중복아님
	}
	%>