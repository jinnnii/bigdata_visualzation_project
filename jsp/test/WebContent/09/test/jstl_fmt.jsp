<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String lo= request.getParameter("lo");
	lo = lo!=null ? lo:"ko";
	%>
	<fmt:setLocale value="<%= lo%>"/>
	<fmt:setBundle basename="bundle.myBundle" var="resourceBundle"/>
	<fmt:message bundle="${resourceBundle }" key="id" var="id"/>
	<fmt:message bundle="${resourceBundle }" key="password" var="pass"/>
	<fmt:message bundle="${resourceBundle }" key="button" var="btn"/>
	<ul>
		<a href="?lo=ko">Korean</a>
		<a href="?lo=en">English</a>
	</ul>
	<p> ${id } : <input type="text" /></p>
	<p> ${pass } : <input type="text" /></p>
	<p> <input type="submit" value="${btn}">
</body>
</html>