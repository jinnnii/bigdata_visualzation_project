<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 	<form action="insert" method="post"> -->
	<form action="res" method="post">
		<table>
			<tr>
				<td>���̵�</td>
				<td><input type="text" name="id"/></td>
			</tr>
			<tr>
				<td>��й�ȣ</td>
				<td><input type="text" name="pw"/></td>
			</tr>
			<tr>
				<td>��ȭ��ȣ</td>
				<td><input type="text" name="phone"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="submit"/></td>
			</tr>
		</table>
		<p>${msg }</p>
	</form>
</body>
</html>