<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ include file="../includes/header.jsp"%> --%>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
<title>Login</title>

<!-- Google Fonts and Icons -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="../css/bootstrap.css">

<!-- Custom styles for this template -->
<link href="../css/signin.css" rel="stylesheet">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body class="text-center">
	<div class="form-signin">
		<a href="../" title="Home으로 가기"> <i
			class="material-icons display-4">android</i>
		</a>
		<h1 class="h3 mb-3 font-weight-normal">회원 로그인</h1>

		<label for="inputId" class="sr-only">ID</label> <input type="text"
			name="id" id="id" class="form-control" placeholder="아이디" required
			autofocus> <label for="pass" class="sr-only">Password</label>
		<input type="password" name="pass" id="pass" class="form-control"
			placeholder="비밀번호" required>

		<div class="checkbox mb-3">
			<label> <input type="checkbox" name="rememberMe"
				value="remember-me"> 로그인 상태 유지
			</label>
		</div>

		<div class="custom-control custom-checkbox text-center mb-3">
			<input type="checkbox" class="custom-control-input" id="customCheck1"
				name="rememberMe" value="remember-me"> <label
				class="custom-control-label" for="customCheck1">로그인 상태 유지</label>
		</div>

		<div class="custom-control custom-switch text-center mb-3">
			<input type="checkbox" class="custom-control-input"
				id="customSwitch1" name="rememberMe" value="remember-me"> <label
				class="custom-control-label" for="customSwitch1">로그인 상태 유지</label>
		</div>

		<button class="btn btn-lg btn-primary btn-block" id="loginbtn">
			<i class="material-icons align-middle">login</i> <span
				class="align-middle">로그인</span>
		</button>

		<hr class="featurette-divider">

		<div class="text-center text-secondary">
			<a href="#">아이디 찾기</a> | <a href="#!">비밀번호 찾기</a> | <a
				href="/member/join.html">회원가입</a>
		</div>

		<p class="mt-5 mb-3 text-muted">&copy; 2017-2021</p>
	</div>
	<script>
	$("#loginbtn").click(function(){
		$.ajax({
			data:{
				"id" : $("#id").val(),
				"pass": $("#pass").val()
			},
			type:"post",
			url:"/member/login"
		
		}).done((res)=>{
			if(res=="failed"){
				alert("회원이 아닙니다. 회원가입하세요");
				location.href="join";
			}else if(res=="nopass"){
				alert("비밀번호가 틀렸습니다.");
			}
			else{
				alert("로그인 성공");
				location.href="../";
			}
	})
	})
</script>
</body>