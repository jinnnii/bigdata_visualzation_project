<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<table border="1" align="center" width="500">
		<tr>
			<th>번호</th>
			<td colspan="3">${board.bno}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td colspan="3">${board.title}</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${board.writer }</td>
			<th>조회수</th>
			<td>${board.hitcount }</td>
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
			<td colspan="3">${board.content }</td>
		</tr>
		<tr>
			<td colspan="4" align="right">
				<button type="button" id="listBtn">목록</button>
				<button type="button" id="updateBtn">수정</button>
				<button type="button" id="deleteBtn">삭제</button>
			</td>
		</tr>
	</table>
</body>
<script type="text/javascript">
	$("#updateBtn").click(()=>{
		if(confirm("수정하시겠습니까?")){
			location.href="/board/updateForm?bno=${board.bno}";
		}
	})
	$("#deleteBtn").click(()=>{
		if(confirm("정말 삭제하겠습니까?")){
			location.href="/board/delete?bno=${board.bno}";
		}
	})
	
	$("#listBtn").click(()=>{
		location.href="/board/list";
	})
</script>
</html>