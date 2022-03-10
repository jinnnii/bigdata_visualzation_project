<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp"%>
<%-- <form action="/board/update" method="post">
		<input type="hidden" value="${board.bno}" name="bno" >
		<table border="1">
			<tr>
				<th width="100">제목</th>
				<td><input type="text" name="title" value="${board.title}"></td>
			</tr>
			<tr>
				<th width="100">작성자</th>
				<td><input type="text" name="writer" value="${board.writer}"></td>
			</tr>
			<tr>
				<th width="100">내용</th>
				<td><textarea rows="10" cols="50" name="content"> ${board.content }
				</textarea></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="reset" value="리셋">
					<input type="button" value="목록"> <input type="submit"
					value="수정"></td>

			</tr>
		</table>
	</form> --%>
<div class="container">
	<h2>${board.writer}글보기</h2>
	<form action="/board/update" method="post">
		<div class="form-group">
			<label for="num">글번호</label> <input type="text" class="form-control"
				id="bno" name="bno" value="${board.bno }" readonly="readonly">
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