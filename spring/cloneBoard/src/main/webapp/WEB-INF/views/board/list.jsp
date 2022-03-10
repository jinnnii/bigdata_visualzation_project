<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<table border="1" align="center" width="500">
	<tr>
		<td colspan="5" align="right"><a href="/board/insertForm">작성</a></td>
	</tr>
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>조회수</th>
	</tr>
	<c:forEach var="board" items="${list}">
		<tr>
			<td>${board.bno }</td>
			<td><a href="/board/detail?bno=${board.bno}">${board.title }</a></td>
			<td>${board.writer }</td>
			<td><fmt:formatDate value="${board.regdate }" pattern="yy-MM-dd"/></td>
			<td>${board.hitcount }</td>
		</tr>
	</c:forEach>
</table>