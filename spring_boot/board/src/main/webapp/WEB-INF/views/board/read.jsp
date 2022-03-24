<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp"%>

<div class="container">
	<h2>user00 글보기</h2>

	<div class="form-group">
		<label for="num">글번호</label> <input type="text" class="form-control"
			id="id" name="id" value="${board.id }" readonly="readonly">
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
		<label for="regdate">등록일자</label> <input type="text"
			class="form-control" id="regdate" name="regdate"
			value="${board.regdate }" readonly="readonly">
	</div>

	<%-- <div class="form-group">
		<label for="file">파일</label>
		<div>
			<ul>
				<c:forEach items="${board.fileList}" var="fileInfo">
					<li style="list-style: none">
						<c:choose>
							<c:when test="${fileInfo.filetype=='image'}">
								<img src="/resources/upload/${fileInfo.savefolder}/${fileInfo.savefile}" height="50">
							</c:when>
							<c:otherwise>
								<img src="/resources/upload/file.svg" height="50">
							</c:otherwise>
						</c:choose>
						${fileInfo.originfile}
						<a class="filedown"
							href="#" 
							fno="${fileInfo.fno}" 
							sfolder="${fileInfo.savefolder}"
							ofile="${fileInfo.originfile}"
							sfile="${fileInfo.savefile}"> 
							[다운로드]
						</a>
					</li>
				</c:forEach>
			</ul>
		</div>
	</div> --%>

	<div class="form-group">
		<label for="content">내용</label>
		<textarea class="form-control" rows="5" id="content" name="content"
			readonly="readonly">${board.content }</textarea>
	</div>

	<div class="form-group text-right">
		<c:if test="${sUser.username==board.writer}">
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
	<div id="replyResult">
		<%--		<c:forEach items="${replies}" var="reply"> --%>
		<%-- 			${reply.content} --%>
		<%-- 		</c:forEach> --%>
	</div>


</div>
<script type="text/javascript">
	const init= ()=>{
		$.ajax({
			type: "get",
			url : "/replies/getList/${board.id}",
			dataType:"JSON",
			cotentType: "application/json; charset=utf-8"
		}).done((resp)=>{
			var str= "<table class='table table-hover mt-3'>";
			$.each(resp, (key,val)=>{
				str+="<tr>";
				str+="<td>"+val.writer+"</td>";
				str+="<td>"+val.content+"</td>";
				str+="<td>"+val.regdate+"</td>";
				if("${sessionScope.sUser.username}"==val.writer){
					str+="<td><a href='javascript:fdel("+val.id+")'>삭제</a></td>";
				}
				str+="</tr>";
			})
			str+="</table>";
			$("#replyResult").html(str);	
		})
	}
	$("#btnUpdate").click(()=>{		
		if(confirm("정말 수정할까요?")){
			location.href="/board/edit?id=${board.id}";
		}
	})
	
	$("#btnDelete").click(()=>{		
		if(confirm("정말 삭제할까요??")){
			location.href="/board/delete?id=${board.id}";
		}
	})
	
	$("#btnList").click(()=>{		
		location.href="/board/list?pageNum=${pageNum}&field=${field}&word=${word}";
	})
	
	$("#replyBtn").click(()=>{
		if(${empty sessionScope.sUser}){
			alert("로그인이 필요합니다.");
			location.href="/login";
		}
		data={
				"content" : $("#content").val(),
				"writer" : "${sUser.username}"
		}
		$.ajax({
			type:"post",
			url:"/replies/new/${board.id}",
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
	
	$(".filedown").click(function(){
		var fno=$(this).attr('fno');
		console.log(fno);
		alert("fno:"+fno+" 원본:"+$(this).attr("ofile")+" 저장:"+$(this).attr("sfile"));
		location.href="/board/download/"+fno;
	})  
	
	init();
</script>
<%@ include file="../includes/footer.jsp"%>