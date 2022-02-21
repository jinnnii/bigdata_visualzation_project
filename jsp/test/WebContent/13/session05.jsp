<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>-----세션을 삭제하기 전-----</h4>
	<%
		session.setAttribute("userId", "admin");
	
		Enumeration en = session.getAttributeNames();
		int i=0;
		
		while(en.hasMoreElements()){
			i++;
			String name = en.nextElement().toString();
			String value = session.getAttribute(name).toString();
			
			out.println("설정된 세션 속성명[ "+i+" ] : "+name+"<br>");
			out.println("설정된 세션 속성값[ "+i+" ] : "+value+"<br>");
		}
		
		session.removeAttribute("userId");
	%>
	
	<h4>-----세션을 삭제한 후-----</h4>
	<%
		en = session.getAttributeNames();
		i=0;
		
		while(en.hasMoreElements()){
			i++;
			String name = en.nextElement().toString();
			String value = session.getAttribute(name).toString();
			
			out.println("설정된 세션 속성명[ "+i+" ] : "+name+"<br>");
			out.println("설정된 세션 속성값[ "+i+" ] : "+value+"<br>");
		}
	%>
</body>
</html>