<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<link rel="stylesheet" type="text/css" href="css/board.css">
<script type="text/javascript" src="js/board.js"></script>
</head>
<body>
	<div id="wrap" align="center">
		<h1>게시글 상세보기</h1>
		<table>
			<tr>
				<th>작성자</th><th>${board.name}</th>
				<th>이메일</th><th>${board.email}</th>
			</tr>
			<tr>
				<th>작성일</th><th><fmt:formatDate value="${board.whitedate}"/></th>
				<th>조회수</th><th>${board.readCount}</th>
			</tr>
			<tr>
				<th>제목</th>
				<td colspan="3">${board.title}</td>
			</tr>
			<tr>
				<th>내용</th>
				<td colspan="3"><pre>${board.content}</pre></td>
			</tr>
		</table>
		<br><br>
		<input type="button" value="게시글 수정"
			onclick="open_win('BoardServlet?command=board_check_pass_form&num=${board.num}', 'update')"/>
		<input type="button" value="게시글 삭제"
			onclick="open_win('BoardServlet?command=board_check_pass_form&num=${board.num}', 'delete')"/>
		<input type="button" value="게시글 등록"
			onclick="location.href='BoardServlet?command=board_write_form'"/>
		<input type="button" value="목록" onclick="location.href='BoardServlet?command=board_list';"/>
	</div>
</body>
</html>