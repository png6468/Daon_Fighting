<%@page import="com.min.edu.dtos.Subject_Dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과목조회</title>
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
List<Subject_Dto> sulist =	(List<Subject_Dto>)request.getAttribute("sulist");
%>
<body>
	<table>

		<tr>
			
			<th>과목명</th>
			<th>운영 시간</th>
		</tr>

		<%
for(Subject_Dto sdto : sulist) {
%>

		<tr onclick="location.href='./detailCou.do?cou_code=<%=sdto.getSub_code()%>'">
			
			<th><%=sdto.getSub_name()%></th>
			<th><%=sdto.getSub_time()%></th>
		</tr>

		<%
			}
		%>
	</table>
</body>
</html>