<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
	function loginCheck(){
		const form = document.form;
		
		if(form.id.value.length==0){
			alert("아이디를 입력하세요.");
			return;
		}else if(form.pass.value.length==0){
			alert("비밀번호를 입력하세요")
			return;
		}
		form.submit();
	}
</script>
<body>
	<form name="form" action="validation_process.jsp" method="POST">
		<p> 아이디 : <input type="text" name="id"></p>
		<p> 비밀번호 : <input type="text" name="pass"></p>
		<p> <input type="button" value="전송" onclick="loginCheck()"></p>
	</form>
</body>
</html>