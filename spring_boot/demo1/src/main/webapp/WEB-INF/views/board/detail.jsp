<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="container mt-4">
	<div class="row">

		<!-- Left Menu -->
		<div class="col-sm-3">

			<!-- Vertical Nav -->
			<ul class="nav flex-column nav-pills">
				<li class="nav-item"><a class="nav-link active" href="#">Active</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
				<li class="nav-item"><a class="nav-link disabled" href="#"
					tabindex="-1" aria-disabled="true">Disabled</a></li>
			</ul>
			<!-- end of Vertical Nav -->
		</div>
		<!-- end of Left Menu -->


		<!-- Right area -->
		<div class="col-sm-9">

			<!-- Contents area -->
			<div class="border border-info p-4 rounded">
				<h5>게시판 글 상세보기</h5>

				<hr class="featurette-divider">

				<!-- 글 상세보기 영역 -->
				<table class="table table-striped">
					<tr>
						<th scope="row" class="text-center">제목</th>
						<td colspan="5">${board.title }</td>
					</tr>
					<tr>
						<th scope="row" class="text-center">작성자</th>
						<td>${board.writer }</td>
						<th scope="row" class="text-center">조회수</th>
						<td>0</td>
					</tr>
					<tr>
						<th scope="row" class="text-center">추천</th>
						<td class="text-primary">264</td>
						<th scope="row" class="text-center">비추천</th>
						<td class="text-danger">7</td>
						<th scope="row" class="text-center">댓글</th>
						<td>70</td>
					</tr>
					<tr>
						<th scope="row" class="text-center">내용</th>
						<td colspan="5">${board.content }
						</td>
					</tr>
					<tr>
						<th scope="row" class="text-center">첨부파일</th>
						<td colspan="5">
							<ul>
								<li>첨부파일1</li>
								<li>첨부파일2</li>
								<li>첨부파일3</li>
								<li>첨부파일4</li>
								<li>첨부파일5</li>
							</ul>
						</td>
					</tr>
				</table>


				<div class="text-right mt-4">
					<button type="button" class="btn btn-info btn-sm"
					onclick="location.href='/board/modify?bno=${board.bno}'">
						<i class="material-icons align-middle">edit</i> <span
							class="align-middle">글수정</span>
					</button>
					<button type="button" class="btn btn-info btn-sm ml-3"
					onclick="location.href='/board/delete?bno=${board.bno}'">
						<i class="material-icons align-middle">delete</i> <span
							class="align-middle">글삭제</span>
					</button>
					<button type="button" class="btn btn-info btn-sm ml-3">
						<i class="material-icons align-middle">reply</i> <span
							class="align-middle">답글쓰기</span>
					</button>
					<button type="button" class="btn btn-info btn-sm ml-3"
						onclick="location.href = '/board/list';">
						<i class="material-icons align-middle">list</i> <span
							class="align-middle">글목록</span>
					</button>
				</div>



				<!-- Comment -->
				<div id="comment" class="border border-secondary mt-5 p-3">
					<i class="material-icons align-middle">forum</i> <span
						class="align-middle">댓글</span>

					<hr class="featurette-divider">

					<ul class="list-unstyled mt-4">
					<c:forEach items="${replyList}" var="reply">
						<li class="media mb-2"><img
							src="../resources/images/image1.jpg" width="50" height="50"
							class="mr-3 rounded-circle">
							<div class="media-body">
								<div class="row">
									<div class="col-md-4">
										<h6>${reply.replyer}</h6>
									</div>
									<div class="col-md-8">
										<div class="text-right text-secondary">
											<time class="comment-date">
											<fmt:formatDate value="${reply.replydate }" type="date"/>
											| <a href="/reply/delete?rno=${reply.rno }" id="reply-delete">삭제</a> 
										</div>
									</div>
								</div>
								<p>${reply.reply }</p>
							</div></li>

						</c:forEach>

						
					</ul>


					<hr class="featurette-divider">


					<!-- write new comment -->
					<form action="" method="post">
						<div class="row my-4">
							<div class="col-10">
								<div class="form-group">
									<label for="exampleFormControlTextarea1">새댓글 작성</label>
									<textarea class="form-control" id="exampleFormControlTextarea1"
										rows="3"></textarea>
								</div>
							</div>
							<div class="col-2 align-self-center">
								<button type="submit" class="btn btn-info btn-sm">작성</button>
							</div>
						</div>
					</form>
					<!-- end of write new comment -->
				</div>
				<!-- end of Comment -->


			</div>
			<!-- end of Contents area -->
		</div>
		<!-- end of Right area -->
	</div>
</div>
<!-- end of middle container -->


<script>
	$("#reply-delete").click(function(){
		$.ajax({
			
		})
	})
</script>
