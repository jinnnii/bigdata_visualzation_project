$(document).ready(() => {
	//	var exp = /^[0-9{3}[0-9]{4}[0-9]{4}$]/
	$("#btnJoin").click(() => {
		if ($("#id").val() == "") {
			alert("아이디를 입력하세요");
			$("#id").focus();
			return false;
		}
		if ($("#pass").val() == "") {
			alert("비밀번호를 입력하세요");
			$("#pass").focus();
			return false;
		}
		if ($("#pass_check").val() == "") {
			alert("비밀번호를 입력하세요");
			$("#pass_check").focus();
			return false;
		}
		if ($("#pass").val() != $("#pass_check").val()) {
			alert("비밀번호가 일치하지 않습니다.");
			$("#pass_check").focus();
			return false;
		}
		if ($("#name").val() == "") {
			alert("이름을 입력하세요");
			$("#name").focus();
			return false;
		}
		if ($("#addr").val() == "") {
			alert("주소를 입력하세요");
			$("#addr").focus();
			return false;
		}
		const data = {
			"id": $("#id").val(),
			"name": $("#name").val(),
			"pass": $("#pass").val(),
			"addr": $("#addr").val(),
		}
		$.ajax({
			type: "post",
			url: "/member/join",
			contentType: "application/json;charset=utf-8",
			data: JSON.stringify(data)
		})
			.done((res) => {
				if (res == "success") {
					alert("가입을 축하드립니다.");
					location.href = "/member/login"
				} else if (res == "fail") {
					alert("동일한 아이디가 있습니다.");
					$("#id").val();
				}
			})

		$("#frm").submit();
	})

	$("#btnLogin").click(() => {
		$.ajax({
			type: "post",
			url: "/member/login",
			data: {
				"id": $("#id").val(),
				"pass": $("#pass").val()
			}
		}).done((resp) => {
			if (resp == "no") {
				alert("회원이 아닙니다. 회원가입하세요");
				location.href = "join"
			} else if (resp == "success") {
				alert("로그인 성공");
				location.href = "/board/list"
			} else {
				alert("비밀번호를 확인하세요");
			}
		})
	})

	$("#btnIdCheck").click(() => {
		$.ajax({
			type: "post",
			url: "/member/idCheck",
			data: {
				"id": $("#id").val()
			}
		}).done((res) => {
			if (res == "available") {
				alert("사용할 수 있는 아이디");
			} else {
				alert("사용할 수 없는 아이디");
			}
		})
	})
});
