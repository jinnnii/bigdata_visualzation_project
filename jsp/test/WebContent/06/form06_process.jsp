<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Processing</title>
</head>
<body>
	<table border="1">
		<tr>
			<th> 요청 파라미터 이름</th>
			<th> 요청 파라미터 값</th>
		</tr>
		<%
		request.setCharacterEncoding("utf-8");
		Enumeration paramNames = request.getParameterNames();
		while(paramNames.hasMoreElements()){
			String name=(String) paramNames.nextElement();
			out.println("<tr><td>"+name+"</td><br>");
			if(name.equals("hobby")){
				String[] paramValue = request.getParameterValues(name);
				out.println("<td>");
				for(String pv : paramValue){
					out.println(pv+" ");
				}
				out.println("</td>");
			}
			else {
				String paramValue = request.getParameter(name);
				out.println("<td>"+paramValue+"</td></tr><br>");
			}
		}
		%>
	</table>
</body>
</html>