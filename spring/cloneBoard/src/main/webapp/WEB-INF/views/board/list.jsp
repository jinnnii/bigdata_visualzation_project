<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<table>
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>조회수</th>
	</tr>
	<c:forEach var="board" items="list">
		<tr>
			<td>${board.bno }</td>
			<td>${board.title }</td>
			<td>${board.writer }</td>
			<td><fmt:formatDate value="${board.regdate }" pattern="yy-MM-dd"/></td>
			<td>0</td>
		</tr>
	</c:forEach>
</table>