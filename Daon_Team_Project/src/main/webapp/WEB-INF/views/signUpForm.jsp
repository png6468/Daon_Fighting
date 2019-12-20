<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 가입</title>
</head>
<script type="text/javascript">
function idConfirm(){
	var obj = document.getElementsByName("id")[0];
	if(obj.title=="n"){
		alert("아이디 중복 확인을 실행하세요.");
		obj.focus();
	}
}

function idChk(){
	var id=document.getElementById("id").value;
	if(id=="" || id==null){
		var id = document.getElementById("id").focus();
		alert("ID를 입력하세요.");
	}else{
		var url="./idCheck.do?id="+id;
		var title="중복 확인";
		var prop="width=500px, height=500px";
		open(url, title, prop);
	}
}

</script>
<body>
	<form action="./signUp.do" method="post">
	<table>
			<div id="leftInfo">관리자 가입</div>
			
			<tr>
				<th>ID</th>
				<td>
				<input type="text" title="n" name="adm_id" id="id" placeholder="ID를  입력하세요.">
				<input type="button" value="중복 확인" onclick="idChk()" required="required"><br>
				</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td>
				<input type="password" name="password" onclick="idConfirm()" placeholder="비밀번호를 입력하세요." required="required"><br>
				</td>
			</tr>
			<tr>
				<th>비밀번호 확인</th>
				<td>
				<input type="password" id="passwordchk" placeholder="비밀번호를 한번 더 입력하세요." required="required"><br>
				</td>
			</tr>
			<tr>
				<th colspan="3">
				<input type="submit" value="관리자 가입" onsubmit="idChk()">
				<input type="button" value="돌아가기" onclick="history.back(-1)">
				</th>
			</tr>
			</table>
	</form>
	
	
	
</body>
</html>