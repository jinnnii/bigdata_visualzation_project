<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="now" class="java.util.Date" />
	<p>
		한국 : <fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"/>
	</p>
	<p>
		<fmt:setTimeZone value="GMT-8"/>
			뉴욕 : <fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"/>
	</p>
	<p>
		<fmt:setTimeZone value="GMT"/>
			런던 : <fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"/>
	</p>
</body>
</html>