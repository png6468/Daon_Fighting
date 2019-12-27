<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과목수정</title>
<%
	
%>
</head>
<body>
	<form action="./modfysub.do" method="post">
		<input type="hidden" name="sub_code" value="${subdto.sub_code}">
		<table>

			<tr>
				<th>과목 이름</th>
				<td><input type="text" name="sub_name"
					value="${subdto.sub_name}" /></td>
			</tr>
			<tr>
				<th>과목 시간</th>
				<td><input type="text" name="sub_time"
					value="${subdto.sub_time}" /></td>
			</tr>

			<tr>
				<th>과목 설명</th>
				<td><input type="text" name="sub_exp" value="${subdto.sub_exp}" /></td>
			</tr>
		</table>
		<input type="submit" value="수정 완료"> <input type="button"
			value="취소" onclick="history.back(-1)">
	</form>
</body>
</html>