<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="fileForm" action="fileupload02_process.jsp" method="post"
		enctype="multipart/form-data">
		<input type="file" name="filename"><br>
		<input type="submit" value="파일올리기">	
	</form>
</body>
</html>