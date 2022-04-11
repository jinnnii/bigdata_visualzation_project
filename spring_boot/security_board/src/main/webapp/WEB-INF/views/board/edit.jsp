<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp"%>
<div class="container">
	<h2>${board.writer}글보기</h2>
	<form action="/board/edit" method="post">
		<div class="form-group">
			<label for="id">글번호</label> <input type="text" class="form-control"
				id="id" name="id" value="${board.id }" readonly="readonly">
		</div>
		<div class="form-group">
			<label for="title">제목</label> <input type="text" class="form-control"
				id="title" name="title" value="${board.title }">
		</div>
		<div class="form-group">
			<label for="writer">작성자</label> <input type="text"
				class="form-control" id="writer" name="writer"
				value="${board.writer }" readonly="readonly">
		</div>
		<div class="form-group">
			<label for="content">내용</label>
			<textarea class="form-control" rows="5" id="content" name="content">${board.content }</textarea>
		</div>
		<div class="form-group text-right">
			<button type="submit" class="btn btn-secondary btn-sm" id="btnModify">수정하기</button>
		</div>
	</form>
</div>

<%@ include file="../includes/footer.jsp"%>