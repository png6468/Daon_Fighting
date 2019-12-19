<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 가입</title>
</head>
<script type="text/javascript">
function check(){
	var id=document.getElementById("id").value;
	var pw=document.getElementById("password").value;
	var passwordchk=document.getElementById("passwordchk").value;
	var chkId = document.getElementById("chkval").value;
	var frm = document.frm;
	
	if(pw !=passwordchk){
		swal("가입 오류", "비밀번호를 확인하세요.");
		return false;
	}else if(chkId == "0"){
		swal("가입 오류", "ID를 확인하세요.");
		return false;
	}else{
		return true;
	}
}

$(document).ready(function(){
	$("#id").keyup(function(){
		var inputLength=$(this).val().length;
		var id="";
		id=$(this).val();
		if(id.indexOf(" ") != -1){
			$("#result").html("공백은 사용할 수 없습니다.");
			$("#chkbal").val("0");
		}else if(inputLength){
			jQuery.ajax({
				type:"post",
				url:"./idCheck.do",
				data:"id="+$(this).val(),
				async:true,
				success:function(msg){
					if(msg.isc=="true"){
						$("#chkval").val("1");
						$("#result").html("사용 가능한 ID입니다.");
					}else{
						$("chkval").val("0");
						$("#result").html("사용 불가능한 ID입니다.");
					}
				},
				error : function(){alert("오류");}
			});
		}else{
			$("#chkval").val("0");
		}
	});
});

</script>
<body>
	<input type="hidden" id="chkval" value="0">
	<form action="./signUp.do" method="post" id="frm" name="frm" onsubmit="return check()">
		<div id="info">
			<div id="leftInfo">관리자 가입</div>
			<div id="centerInfo">
				<input type="text" id="id" name="id" placeholder="ID를  입력하세요." required="required"><br>
				<input type="password" id="password" name="password" placeholder="비밀번호를 입력하세요." required="required"><br>
				<input type="password" id="passwordchk" placeholder="비밀번호를 한번 더 입력하세요." required="required"><br>
			</div>
			<div id="button">
				<input class="btn btn-success" type="submit" value="가입완료">
				<input class="btn btn-primary" type="button" value="돌아가기" onclick="history.back(-1)">
			</div>
		</div>
	</form>
</body>
</html>