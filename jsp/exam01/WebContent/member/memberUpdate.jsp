<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 수정</h2>
	<form action="memberUpdate" method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td>${member.id }<input type="hidden" name="id"
					value="${member.id }" /></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="passwd"
					value="${member.passwd }" /></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="${member.name }" /></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="email" value="${member.email }" /></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="addr" value="${member.addr }" /></td>
			</tr>
			<tr>
				<td>등록일</td>
				<td>${member.regdate }<input type="hidden" name="regdate"
					value="${member.regdate }" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="수정" />
				<input type="button" value="목록"
					onclick="location.href='memberList'" /></td>
			</tr>
		</table>
	</form>
</body>
</html>