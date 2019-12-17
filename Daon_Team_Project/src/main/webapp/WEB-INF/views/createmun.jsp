<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="./ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="./js/jquery-3.4.1.js"></script>
<script type="text/javascript">
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
<h1>자아 문제를 만들어 볼거에요?</h1>
<h1>온클릭을 걸어서 객/서/포 페이지 이동 없이 뿌리게 할까</h1>
<h1>페이지 이동을 통해 값을 뿌리게 할까</h1>
<h1>만약 페이지 이동없이 양식을 뿌리게 만드려면</h1>
<h1>그 뭐냐 객/서/포 에 해당하는 모든 양식이 있는데 선택 안된 양식은 hide되있는 것 이거지!!!!</h1>

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
			<textarea rows="4" cols="4" id="ckeditor" name="content"></textarea>
		</td>
	</tr>
	<tr>
		<td colspan="4">그림 <input type="file" name="filename" id="file" onchange="LoadImg(this)"></td>
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