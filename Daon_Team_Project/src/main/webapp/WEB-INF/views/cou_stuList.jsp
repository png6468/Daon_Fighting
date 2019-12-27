<%@page import="com.min.edu.dtos.Student_Dto"%>
<%@page import="com.min.edu.dtos.StuCou_Dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생조회</title>
<style type="text/css">
table {
	width: 100%;
	border-top: 1px solid #444444;
	border-collapse: collapse;
}

th, td {
	border-bottom: 1px solid #444444;
	padding: 10px;
}
</style>
</head>
<%
List<Student_Dto> stulist = (List<Student_Dto>)request.getAttribute("sclist");
	
%>


<body>
<table>
	<tr>
		<th>이름</th>
		<th>ID</th>
		<th>전화번호</th>
		<th>과정</th>
		<th>점수</th>
	</tr>
	<tr>
	<%
	for (Student_Dto scd : stulist) {
	%>
	<%=scd.getStu_id()%>
	
	<%
	}
	%>
	</tr>
</table>
</body>
</html>