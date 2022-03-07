<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="../includes/header.jsp"%>

<%--
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td colspan="5" align="right"><a href="/board/input">게시글 작성</a></td>
		</tr>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>업데이트날짜</th>
		</tr>
		<c:forEach var="board" items="${list }">
			<tr>
				<td>${board.bno }</td>
				<td><a href="/board/read?bno=${board.bno}">${board.title }</a></td>
				<td>${board.writer }</td>
				<td>${board.regdate }</td>
				<td>${board.updatedate }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html> --%>

<div class="container">
	<h2>Total (${count}) </h2>
	<div class="form-group text-right">
		<button type="button" class="btn btn-secondary btn-sm" id="btnWrite"
			onclick="location.href='/board/input'">글쓰기</button>
	</div>
	<table class="table table-hover">
		<thead>
			<tr>
				<th>번호</th>
				<th>작성자</th>
				<th>제목</th>
				<th>작성일시</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="board" items="${list }">
				<tr>
					<td>${board.bno }</td>
					<td>${board.writer }</td>
					<td><a href="/board/read?bno=${board.bno}">${board.title }</a></td>
					<td><fmt:formatDate value="${board.regdate}"
							pattern="yyyy-MM-dd" /></td>
					<td>0</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="d-flex justify-content-between mt-3">
		<ul class="pagination">
			<!-- 이전 -->
			<li class="page-item"><a class="page-link" href="#">Previous</a></li>
			<!--페이지 리스트-->
			<li class="page-item"><a class="page-link" href="#">1</a></li>

			<!-- 다음 -->
			<li class="page-item"><a class="page-link" href="#">Next</a></li>
		</ul>

		<form class="form-inline" action="#" id="searchFrm">
			<select name="field" class="form-control mb-2 mr-sm-2">
				<option value="writer">작성자</option>
				<option value="title">제목</option>
			</select> <input type="text" class="form-control mb-2 mr-sm-2"
				placeholder="Enter Search" name="word">
			<button type="submit" class="btn btn-secondary mb-2 btn-sm">Search</button>
		</form>
	</div>
</div>
<script type="text/javascript">
	$("#btnWrite").click(()=>{
		location.href="/board/input"
	})
</script>

<%@ include file="../includes/footer.jsp"%>