<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp"%>
<%-- <table border="1" width="400">
	<tr>
		<th>제목</th>
		<td>${board.title}</td>
	</tr>
	<tr>
		<th>작성자</th>
		<td>${board.writer}</td>
	</tr>
	<tr>
		<th>작성일</th>
		<td>${board.regdate}</td>
	</tr>
	<tr>
		<th>업데이트</th>
		<td>${board.updatedate}</td>
	</tr>
	<tr>
		<th>내용</th>
		<td>${board.content}</td>
	</tr>
	<tr>
		<td colspan="2" align="right"><a
			href="/board/edit?bno=${board.bno}">수정</a> <a
			href="/board/delete?bno=${board.bno}">삭제</a> <a href="/board/list">목록</a>
		</td>
	</tr>
</table> --%>

<div class="container">
	<h2>user00 글보기</h2>

	<div class="form-group">
		<label for="num">글번호</label> <input type="text" class="form-control"
			id="bno" name="bno" value="${board.bno }" readonly="readonly">
	</div>
	<div class="form-group">
		<label for="title">제목</label> <input type="text" class="form-control"
			id="title" name="title" value="${board.title }" readonly="readonly">
	</div>
	<div class="form-group">
		<label for="writer">작성자</label> <input type="text"
			class="form-control" id="writer" name="writer"
			value="${board.writer }" readonly="readonly">
	</div>
	<div class="form-group">
		<label for="content">내용</label>
		<textarea class="form-control" rows="5" id="content" name="content"
			readonly="readonly">${board.content }</textarea>
	</div>

	<div class="form-group text-right">
		<c:if test="${sMember.id==board.writer}">
			<button type="button" class="btn btn-secondary btn-sm" id="btnUpdate">수정하기</button>
			<button type="button" class="btn btn-secondary btn-sm" id="btnDelete">삭제하기</button>
		</c:if>
		<button type="button" class="btn btn-secondary btn-sm" id="btnList">목록</button>
	</div>


	<div class="container mt-5">
		<div class="form-group">
			<label for="comment">Comment:</label>
			<textarea class="form-control" rows="5" id="reply" name="text"></textarea>
		</div>
		<button type="button" class="btn btn-success" id="replyBtn">Reply
			Write</button>
	</div>
	<div id="replyResult"></div>


</div>
<script type="text/javascript">
	const init= ()=>{
		$.ajax({
			type: "get",
			url : "/replies/getList/${board.bno}.json",
			cotentType: "application/json; charset=utf-8"
		}).done((resp)=>{
			var str= "<table class='table table-hover mt-3'>";
			$.each(resp, (key,val)=>{
				str+="<tr>";
				str+="<td>"+val.replyer+"</td>";
				str+="<td>"+val.reply+"</td>";
				str+="<td>"+val.replydate+"</td>";
				if("${sessionScope.sMember.id}"==val.replyer){
					str+="<td><a href='javascript:fdel("+val.rno+")'>삭제</a></td>";
				}
				str+="</tr>";
			})
			str+="</table>";
			$("#replyResult").html(str);	
		})
	}
	$("#btnUpdate").click(()=>{		
		if(confirm("정말 수정할까요?")){
			location.href="/board/edit?bno=${board.bno}";
		}
	})
	
	$("#btnDelete").click(()=>{		
		if(confirm("정말 삭제할까요??")){
			location.href="/board/delete?bno=${board.bno}";
		}
	})
	
	$("#btnList").click(()=>{		
		location.href="/board/list?pageNum=${pageNum}&field=${field}&word=${word}";
	})
	
	$("#replyBtn").click(()=>{
		if(${empty sessionScope.sMember}){
			alert("로그인이 필요합니다.");
			location.href="/member/login";
		}
		data={
				"bno": $("#bno").val(),
				"reply" : $("#reply").val(),
				"replyer" : "${sMember.id}"
		}
		$.ajax({
			type:"post",
			url:"/replies/new",
			contentType : "application/json; charset=utf-8",
			data: JSON.stringify(data)
		}).done((resp)=>{
			alert("댓글 추가 성공");
			init();
		}).fail(()=>{
			alert("댓글 추가 실패");
		})
	})
	
	function fdel(rno){
		$.ajax({
			type:"delete",
			url:"/replies/"+rno,
		}).done((resp)=>{
			alert("댓글 삭제 완료");
			init();
		}).fail(()=>{
			alert("댓글 삭제 실패")
		})
	}
	
	init();
</script>
<%@ include file="../includes/footer.jsp"%>