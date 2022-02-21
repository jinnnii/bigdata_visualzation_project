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
				url :"jsonData.jsp",
				dataType:"json",
				success : function(data){
					$("table").html("<tr><th>번호</th><th>이름</th><th>나이</th><th>사는곳</th></tr>")		
					var show="";
					$.each(data,function(index, item){
						show+="<tr><td>"+(index+1)+"</td>";
						show+="<td>"+item.name+"</td>";
						show+="<td>"+item.age+"</td>"
						show+="<td>"+item.loc+"</td></tr>"
					});
					$("table").append(show);
				},
				error : function(){
					alert("요청에 실패했습니다.")
				},
			})
		});
	});
</script>
</head>
<body>
	<center>
		<h3>ajax 로드</h3>
		<div></div>
		<table border="1">
		</table>
	</center>
</body>
</html>