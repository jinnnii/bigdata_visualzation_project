<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원가입</h3>
	<form action="#" name="member" method="post">
		<p>아이디: <input type="text" name="id" required>
				 <input type="button" value="아이디 중복 검사"></p>
		<p>비밀번호 : <input type="password" name="passwd" placeholder="입력하세요"></p>
		<p>이름 : <input type="text" name="name" autofocus></p>
		<p>연락처 : 
		<select name="phone1">
			<option>010</option>
			<option>011</option>
			<option>012</option>
			<option>013</option>
		</select>-
		<input type="text" maxlength="4" size="4" name="phone2">-
		<input type="text" maxlength="4" size="4" name="phone3"></p>
		<p>성별 :<input type="radio" name="gender" value="남성" checked>
				<input type="radio" name="gender" value="여성"></p>
		<p>취미 : 독서<input type="checkbox" name="hobby1" checked>
				 운동<input type="checkbox" name="hobby2" >
				 영화<input type="checkbox" name="hobby3" ></p>
		<p><textarea rows="3" cols="30" name="comment"></textarea>
		<p><input type="submit" value="가입">
		<input type="reset" value="다시 쓰기">
		</p>
	</form>
</body>
</html>