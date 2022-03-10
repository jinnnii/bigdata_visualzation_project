<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp"%>
<!-- <form action="/board/insert" method="post">
		<table border="1">
			<tr>
				<th width="100">제목</th>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<th width="100">작성자</th>
				<td><input type="text" name="writer"></td>
			</tr>
			<tr>
				<th width="100">내용</th>
				<td ><textarea rows="10" cols="50" name="content"> 
				</textarea></td>
			</tr>
			<tr>
				<td colspan="3" align="center">
					<input type="reset" value="리셋"> 
					<input type="button" value="목록"> 
					<input type="submit" value="등록">
				</td>

			</tr>
		</table>
	</form> -->
<div class="container">
	<h2>글쓰기</h2>
	<form action="/board/insert" method="post">
		<div class="form-group">
			<label for="title">제목:</label> <input type="text"
				class="form-control" id="title" placeholder="Enter title"
				name="title">
		</div>
		<div class="form-group">
			<label for="writer">작성자:</label> <input type="text"
				class="form-control" id="writer" name="writer" value="${sMember.id }">
		</div>
		<div class="form-group">
			<label for="content">내용:</label>
			<textarea class="form-control" rows="5" id="content" name="content"></textarea>
		</div>
		<button type="submit" class="btn btn-primary btn-sm">Submit</button>
	</form>
</div>

<%@ include file="../includes/footer.jsp" %>