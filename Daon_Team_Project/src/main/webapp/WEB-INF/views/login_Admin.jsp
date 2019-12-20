<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<script type="text/javascript">
function regiForm(){
	location.href="./signUp.do";
}
function check(){
	if(fr.adm_id.value=="" || fr.adm_id.value==null){
		alert("ID를 입력하세요.");
		fr.adm_id.focus();
		return false;
	}else if(fr.adm_pw.value=="" || fr.adm_pw.value==null){
		alert("비밀번호를 입력하세요.");
		fr.adm_pw.focus();
		return false;
	}else{ 
		return true;
	}
}

/* window.onlead = function(){
	document.getElementById("SignUp").onclick=function(){
		location.href="./signUpForm.do";
	}
} */


</script>
<body>
<!-- 	<form action="./loginAdbsame.do" method="post"> -->
	<form name="fr" onsubmit="return check()" action="./loginAdbsame.do" method="post">
		<table border="1">
			<tr>
				<td><a>아이디</a></td>
				<td>
					<input type="text" name="adm_id" required="required" placeholder="ID를 입력하세요."><br>
				</td>
			</tr>
			<tr>
				<td><a>비밀번호</a></td>
				<td>
					<input type="password" name="adm_pw" required="required" placeholder="비밀번호를 입력하세요.">
					
				</td>
			</tr>
		
		</table>
		<input type="submit" value="로그인"><br>
	<!-- 	<input type="submit" value="로그인"> -->
		<!-- <div id="bottom">
			<a href="#" onclick="signUp()">
				<input type="button" id="SignUp" name="SignUp" value="관리자가입">
			</a>
		</div> -->
		
		<input type="button" value="관리자 가입" onclick="regiForm()">
	</form>




</body>
</html>
