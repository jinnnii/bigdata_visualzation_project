<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp"%>

<div class="container">
	<h2>회원가입</h2>
	<form action="#" method="post">
		<div class="row">
			<div class="col">
				<label for="username">아이디:</label> <input type="text" class="form-control"
					id="username" placeholder="Enter id" name="username">
			</div>
			<div class="col align-self-end">
				<button type="button" class="btn btn-primary" id="btnIdCheck">중복확인</button>
			</div>
		</div>
		<div class="form-group">
			<label for="password">비밀번호:</label> <input type="password"
				class="form-control" id="password" placeholder="Enter password"
				name="password">
		</div>
		<div class="form-group">
			<label for="pass_check">비밀번호확인:</label> <input type="password"
				class="form-control" id="pass_check"
				placeholder="Enter password_check" name="pass_check">
		</div>
		<div class="form-group">
			<label for="email">이메일:</label> <input type="text"
				class="form-control" id="email"
				placeholder="Enter email" name="email">
		</div>
		<div class="form-group">
			<label for="role">구분:</label>
			<select class="form-control" id="role" name="role">
				<option value="USER" selected >사용자(default)</option>
				<option value="ADMIN">관리자</option>
			</select>
		</div>
		<button type="button" class="btn btn-primary btn-sm" id="btnJoin">회원가입</button>
	</form>
</div>

<script type="text/javascript" src="../js/member.js"></script>


<%@ include file="../includes/footer.jsp"%>