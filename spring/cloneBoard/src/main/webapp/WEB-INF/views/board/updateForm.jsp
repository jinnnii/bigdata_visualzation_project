<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/board/update" method="post">
		<table border="1" align="center" width="500">
			<tr>
				<th>번호</th>
				<td><input type=hidden" value="${board.bno}" name="bno">${board.bno}</td>
			</tr>
			<tr>
				<th>제목</th>
				<td colspan="3"><input type="text" name="title"value="${board.title }"></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td colspan="3">${board.writer }</td>
			</tr>
			<tr>
				<th>작성일</th>
				<td colspan="3">${board.regdate }</td>
			</tr>
			<tr>
				<th>수정일</th>
				<td colspan="3">${board.updatedate }</td>
			</tr>
			<tr>
				<th>내용</th>
				<td colspan="3"><textarea rows="30" cols="50" name="content">${board.content }</textarea>
				</td>
			</tr>
			<tr>
				<td colspan="4" align="right"><a href="/board/list">목록</a> <input
					type="submit" value="수정"></td>
			</tr>
		</table>
	</form>
</body>
</html>