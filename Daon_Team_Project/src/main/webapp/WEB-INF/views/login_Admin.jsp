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
				<td><a>���̵�</a></td>
				<td>
					<input type="text" name="adm_id">
				</td>
			</tr>
			<tr>
				<td><a>��й�ȣ</a></td>
				<td>
					<input type="password" name="adm_pw">
				</td>
			</tr>
		
		</table>
		<input type="submit" value="�α���">
	</form>

</body>
</html>
