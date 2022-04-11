<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insert" method="post">
		<table>
			<tr><td>id</td><td><input type="text" name="id"/></td></tr>
			<tr><td>email</td><td><input type="text" name="email"/></td></tr>
			<tr><td>pass</td><td><input type="text" name="pass"/></td></tr>
			<tr><td>name</td><td><input type="text" name="name"/></td></tr>
			<tr><td>address</td><td><input type="text" name="addr"/></td></tr>
			<tr><td>memo</td><td><input type="text" name="memo"/></td></tr>
			<tr><td colspan="2"><input type="submit" value="전송"/></td></tr>
		</table>
	</form>
</body>
</html>