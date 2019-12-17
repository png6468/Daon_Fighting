<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<form action="./login_Admin.do" method="post">
		<table border="1">
			<tr>
				<td><a>아이디</a></td>
				<td>
					<input type="text" name="adm_id">
				</td>
			</tr>
			<tr>
				<td><a>비밀번호</a></td>
				<td>
					<input type="password" name="adm_pw">
				</td>
			</tr>
		
		</table>
		<input type="submit" value="로그인">
	</form>

</body>
</html>
