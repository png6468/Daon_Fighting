<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과정 개설</title>
</head>
<body>
	<form action="./insert_Course.do" method="post">
		<%-- <input type="hidden" name="sub_code" value="${subdto.sub_code}">
 --%>
		<table>
			<tr>
				<th>과정명</th>
				<th><input type="text" name="cou_name"></th>
			</tr>
			<tr>
				<th>강사</th>
				<th><input type="text" name="tea_id"></th>
			</tr>
			<tr>
				<th>시작일</th>
				<th><input type="text" name="startdate"></th>
			</tr>
			<tr>
				<th>과정 설명</th>
				<th><textarea name="cou_exp" rows="7"> </textarea></th>
			</tr>

		</table>
		<input type="submit" value="입력"> <input type="button"
			value="취소" onclick="location.href='./sijak.do'">
	</form>
</body>
</html>