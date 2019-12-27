<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과목 생성</title>
</head>
<body>
<form action="./iSubject.do" method="post">
	<%-- <input type="hidden" name="sub_code" value="${subdto.sub_code}">
 --%>	<table>
		<tr>
			<th>과목명</th>
			<th><input type="text" name="sub_name"></th>
		</tr>
		<tr>
			<th>운영시간</th>
			<th><input type="text" name="sub_time"></th>
		</tr>
		<tr>
			<th>설명</th>
			<th><textarea name="sub_exp" rows="7" > </textarea></th>
		</tr>

	</table>
	<input type="submit" value="입력">
	</form>
	
</body>
</html>