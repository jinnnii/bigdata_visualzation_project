<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insert_process.jsp" method="post">
		<p> 학번 : <input type="text" name="sno"></p>
		<p> 학과 : <input type="text" name="dept"></p>
		<p> 이름 : <input type="text" name="name"></p>
		<p> 주소 : <input type="text" name="add"></p>
		<p> 연락처 : <input type="text" name="phone"></p>
		<p> <input type="submit" value="전송"></p>
	</form>
</body>
</html>