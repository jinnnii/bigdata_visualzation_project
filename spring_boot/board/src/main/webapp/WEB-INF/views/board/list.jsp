<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<h2>Total (${count})</h2>
	<div class="form-group text-right">
	<c:if test="${not empty sessionScope.sMember}">
		<button type="button" class="btn btn-secondary btn-sm" id="btnWrite"
			onclick="location.href='/board/input'">글쓰기</button>
	</c:if>
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
					<td><a href="/board/read?bno=${board.bno}&pageNum=${p.curPage}&field=${field}&word=${word}">${board.title }(${board.replycount})</a></td>
					<td><fmt:formatDate value="${board.regdate}"
							pattern="yyyy-MM-dd" /></td>
					<td>${board.hitcount }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="d-flex justify-content-between mt-3">
		<ul class="pagination">
			<!-- 이전 -->
			<c:if test="${p.startPage>p.blockSize}">
				<li class="page-item"><a class="page-link"
					href="list?pageNum=${p.startPage-p.blockSize}&field=${field}&word=${word}">Previous</a></li>
			</c:if>
			<!--페이지 리스트-->
			<c:forEach begin="${p.startPage}" end="${p.endPage}" var="i">
				<li class="page-item"><a class="page-link"
					href="list?pageNum=${i}&field=${field}&word=${word}">${i}</a></li>
			</c:forEach>

			<!-- 다음 -->
			<c:if test="${p.endPage<p.totPage}">
				<li class="page-item"><a class="page-link"
					href="list?pageNum=${p.endPage+1}&field=${field}&word=${word}">Next</a></li>
			</c:if>
		</ul>

		<form class="form-inline" action="/board/list" id="searchFrm">
			<select name="field" class="form-control mb-2 mr-sm-2">
				<option value="" disabled selected>--</option>
				<option value="writer" ${field== 'writer' ? 'selected': '' }>작성자</option>
				<option value="title"  ${field== 'title' ? 'selected': '' }>제목</option>
				<option value="content"  ${field== 'content' ? 'selected': '' }>내용</option>
				<option value="cwt"  ${field== 'cwt' ?' selected' : '' }>제목,작성자,내용</option>
			</select> 
			<input type="text" class="form-control mb-2 mr-sm-2"
				placeholder="Enter Search" name="word" value="${word}">
<%-- 			<input type="hidden" name="pageNum" value="${p.curPage}"> --%>
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