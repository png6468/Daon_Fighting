<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
form {
	position: absolute;
}


</style>
</head>
<script type="text/javascript" src="./ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="./js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	//ck에디터
	$(function() {
		CKEDITOR.replace('ckeditor1', {
			width : "100%",
			height : "300px",
			filebrowserUploadUrl : "./imgUp.do"
		});
	});
	$(function() {
		CKEDITOR.replace('ckeditor2', {
			width : "100%",
			height : "300px",
			filebrowserUploadUrl : "./imgUp.do"
		});
	});
	$(function() {
		CKEDITOR.replace('ckeditor3', {
			width : "100%",
			height : "200px",
			filebrowserUploadUrl : "./imgUp.do"
		});
	});
	
	//미리보기
	function LoadImg(v) {
		if (v.files && v.files[0]) {
			var reader = new FileReader();
			reader.onload = function(e) {
				$("#LoadedImg").attr('src', e.target.result);
				$("#LoadedImg").attr('width', "200");
			}
			reader.readAsDataURL(v.files[0]);
		}
	}
	window.onload = function(){
		var frm1 = document.forms[0];
		var frm2 = document.forms[1];
		frm1.style.visibility="visible";
		frm2.style.visibility="hidden";
	}
	function munMean(){
		var select = document.getElementById("munMean").value;
		var frm1 = document.forms[0];
		var frm2 = document.forms[1];
		jQuery.ajax({  // $.ajax 사용가능
			type : "post",
			url : "./meanCheck.do",
			data : "mean="+select,
			success : function(msg){
				if(msg.trim()=="S"){
					frm1.style.visibility="visible";
					frm2.style.visibility="hidden";
				}else{
					var input = document.getElementById("hiddenval");
					if(msg.trim()=="D"){
						input.value="D";
					}else{
						input.value="P";
					}
					frm2.style.visibility="visible";
					frm1.style.visibility="hidden";
				}
			},
			error : function() {
				alert("문제가있네");
			}
		});
	} 
</script>
<body>
<!-- 객관식 문제 생성 -->
<select id="munMean" onchange="munMean()">
	<option value="S" selected="selected">객관식</option>
	<option value="D">주관식</option>
	<option value="P">포트폴리오</option>
</select>

<input type="hidden" name="sub_code" value="">
<input type="hidden" name="cur_code" value="">
<form action="./makeMun1.do" method="post" name="munsel" class="put">
<input type="hidden" name="mean" value="S">
<table border="1">
	<tr>
		<td colspan="4">
			<p>내용</p>
		</td>
	</tr>
	<tr>
		<td colspan="4">
			<textarea rows="4" cols="4" id="ckeditor1" name="content"></textarea>
		</td>
	</tr>
	<tr>
		<td colspan="4">파일<input type="file" name="file" id="file" onchange="LoadImg(this)"></td>
	</tr>
	<tr>
		<td colspan="4"><img id="LoadedImg"></td>
	</tr>
	<tr >
		<td>정답</td>
		<td>오답1</td>
		<td>오답2</td>
		<td>오답3</td>
	</tr>
	<tr>
		<td><input type="text" required="required" name="cor_answer"></td>
		<td><input type="text" required="required" name="wro_one"></td>
		<td><input type="text" required="required" name="wro_two"></td>
		<td><input type="text" required="required" name="wro_three"></td>
	</tr>
</table>
	<input type="submit" value="문제생성">
	<input type="reset" value="초기화">
	<input type="button" onclick="history.back(-1)" value="뒤로가기">
</form>
<form action="./makeMun2.do" method="post" name="munsel" class="put">
<input type="hidden" id="hiddenval" name="mean">
<table border="1">
	<tr>
		<td colspan="4">
			<p>내용</p>
		</td>
	</tr>
	<tr>
		<td colspan="4">
			<textarea rows="4" cols="4" id="ckeditor2" name="content"></textarea>
		</td>
	</tr>
	<tr>
		<td colspan="4">파일<input type="file" name="file" id="file" onchange="LoadImg(this)"></td>
	</tr>
	<tr>
		<td colspan="4"><img id="LoadedImg"></td>
	</tr>
	<tr>
		<td>정답</td>
	</tr>
	<tr>
		<td><textarea rows="4" cols="4" id="ckeditor3" name="standard"></textarea></td>
	</tr>
</table>
	<input type="submit" value="문제생성">
	<input type="reset" value="초기화">
	<input type="button" onclick="history.back(-1)" value="뒤로가기">
</form>





</body>
</html>