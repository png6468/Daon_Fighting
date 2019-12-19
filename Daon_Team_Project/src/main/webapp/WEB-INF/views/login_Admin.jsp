<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<script type="text/javascript">
function loginCheck(){
	var id=document.getElementById("InputId").value;
	var pw = document.getElementById("InputPw").value;
	var frm = document.forms[0];
	frm.action = "./loginAdbsame.do";
	var result="";
	
	if(id==null || id.trim()==""){
		document.getElementById("InputId").focus();
		$("InputId").val("");
		swal("로그인", "ID를 입력해주세요.");
	}else if(pw==null || pw.trim()==""){
		document.getElementById("InputPw").focus();
		$("#InputPw").val("");
		swal("로그인", "비밀번호를 입력해주세요.");
	}else{
		$.ajax({
			type : "post",
			url : "./loginCheckMap.do",
			data : "id="+id+"&pw="+pw,
			success : function(msg){
				if(msg.isc=="성공"){
					frm.submit();
				}else{
					swal("로그인 실패", "ID나 비밀번호를 확인해주세요.")
				}
			},
			error : function(){
				swal("로그인", "로그인에 문제가 있습니다.")
			}
		});
	}
}

window.onlead = function(){
	document.getElementById("SignUp").onclick=function(){
		location.href="./signUpForm.do";
	}
}

</script>
<body>
<!-- 	<form action="./loginAdbsame.do" method="post"> -->
	<form method="post">
		<table border="1">
			<tr>
				<td><a>아이디</a></td>
				<td>
					<input type="text" name="adm_id" id="InputId" required="required" placeholder="ID를 입력하세요."><br>
				</td>
			</tr>
			<tr>
				<td><a>비밀번호</a></td>
				<td>
					<input type="password" name="adm_pw" id="InputPw" required="required" placeholder="비밀번호를 입력하세요.">
					
				</td>
			</tr>
		
		</table>
		<input type="button" id="login" name="login" value="로그인" onclick="loginCheck()"><br>
	<!-- 	<input type="submit" value="로그인"> -->
		<div id="bottom">
			<a href="#" onclick="signUp()">
				<input type="button" id="SignUp" name="signUp" value="관리자가입">
			</a>
		</div>
	</form>




</body>
</html>
