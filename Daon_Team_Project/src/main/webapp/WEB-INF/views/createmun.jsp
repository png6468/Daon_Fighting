<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="./ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="./js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	//ck에디터
	$(function() {
		CKEDITOR.replace('ckeditor', {
			width : "100%",
			height : "300px",
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
</script>
<body>
<!-- 객관식 문제 생성 -->
<form action="">
<table border="1">
	<tr>
		<td colspan="4">
			<p>내용</p>
		</td>
	</tr>
	<tr>
		<td colspan="4">
			<textarea rows="4" cols="4" id="ckeditor"></textarea>
		</td>
	</tr>
	<tr>
		<td colspan="4">파일<input type="file" name="filename" id="file" onchange="LoadImg(this)"></td>
	</tr>
	<tr>
		<td colspan="4"><img id="LoadedImg"></td>
	</tr>
	<tr>
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
</form>




</body>
</html>