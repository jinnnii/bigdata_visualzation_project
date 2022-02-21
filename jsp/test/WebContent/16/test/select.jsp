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
	<table border="1">
		<tr>
			<th> 학번 </th>
			<th> 학과 </th>
			<th> 이름 </th>
			<th> 주소 </th>
			<th> 연락처 </th>
		</tr>
		<%
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try{
				String sql="SELECT * FROM STUDENT";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while(rs.next()){
					String sno = rs.getString("num");
					String dept = rs.getString("depart");
					String name = rs.getString("name");
					String add = rs.getString("address");
					String phone = rs.getString("phone");
		%>
		<tr>
			<td><%=sno %></td>
			<td><%=dept %></td>
			<td><%=name %></td>
			<td><%=add %></td>
			<td><%=phone %></td>
		</tr>
		<%
				}
			}catch(SQLException e){
				
			}finally{
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}
		%>
	</table>
</body>
</html>