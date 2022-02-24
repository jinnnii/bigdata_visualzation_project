<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품 등록</title>
</head>
<body>
	<h2>제품 등록</h2>
	<form action="productInsert" method="post" name="frm">
		<table>
			<tr>
				<td><label for="pid">제품 아이디</label></td>
				<td><input type="text" name="pid" id="pid"/></td>
			</tr>
			<tr>
				<td><label for="pid">제품명</label></td>
				<td><input type="text" name="pname" id="pname"/></td>
			</tr>
			<tr>
				<td><label for="pid">제품가격</label></td>
				<td><input type="text" name="price" id="price"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="등록"/>
					<input type="reset" value="취소"/>
					<input type="button" value="목록" onclick="location.href='productList'"/>
				</td> 
			</tr>
		</table>
	</form>
</body>
</html>