<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>post 방식으로 한글 깨짐 방지</h3>
	<form action="info" method="post">
		<p> 이름 : <input type="text" name="name"></p>
		<p> 주소 : <input type="text" name="addr"></p>
		<p> <input type="submit" value="전송"></p>
	</form>
</body>
</html>