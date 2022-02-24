<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		function deleteConfirm() {
			return confirm("정말 삭제하시겠습니까?")
		}
	</script>
	<h2>회원 목록</h2>
	<table border="1">
		<tr>
			<td colspan="8" style="text-align: right;"><a
				href="memberWrite">가입</a></td>
		</tr>
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>이메일</th>
			<th>주소</th>
			<th>등록일</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
		<c:forEach var="member" items="${memberList}">
			<tr>
				<td>${member.id }</td>
				<td>${member.passwd }</td>
				<td>${member.name }</td>
				<td>${member.email }</td>
				<td>${member.addr }</td>
				<td><fmt:formatDate type="both" value="${member.regdate }" /></td>
				<td><a href="memberUpdate?id=${member.id}">수정</a></td>
				<td><a href="memberDelete?id=${member.id}"
					onclick="return deleteConfirm()">삭제</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>