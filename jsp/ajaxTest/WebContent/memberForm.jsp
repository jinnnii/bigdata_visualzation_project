<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<script src="js/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function(){
		$("#btnCheckId").on("click",function(){
			var idValue= $("#id").val();
			if(idValue!=""&&idValue.length>0){
				$.ajax({
					type:"post",
					url:"member_checkId.jsp",
					data:{"id":idValue},
					dataType:"text",
					success:function(data){
						var retData = data.trim();
						console.log(retData);
						if(retData == 1){ //아이디가 중복되지 않은 경우
							$("#spanCheckId").html("사용 가능한 아이디입니다.")
						}else{
							$("#spanCheckId").html("사용 불가능한 아이디입니다.")
							$("#id").select();
						}
					},
					error: function(){
						console.log("서버요청실패");
					}
				});
			}else{
				$("#spanCheckId").html("");
			}
			return false;
		});
	})
</script>
<body>
<form action="" method="post" name="joinForm">
	<p> 아이디 <input type="text" name="id" id="id">
	<button id="btnCheckId">중복확인</button>
	<span id="spanCheckId"></span>
	</p>
	<p> 비밀번호 <input type="password" name="passwd"></p>
	<p> 이름 <input type="text" name="name"></p>
	<p><input type="submit" value="전송"></p>
</form>
</body>
</html>