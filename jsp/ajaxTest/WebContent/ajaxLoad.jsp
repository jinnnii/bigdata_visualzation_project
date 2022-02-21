<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function(){
		$("h3").click(function(){
			$.ajax({
				url :"data.jsp",
				dataType:"html",
				success : function(data){
					$("div").html(data)		
				},
				error : function(){
					alert("요청에 실패했습니다.")
				},
			});
		});
	});
</script>
</head>
<body>
	<center>
		<h3>ajax 로드</h3>
		<div></div>
		<table>
		</table>
	</center>
</body>
</html>