<%@page import="com.min.edu.dtos.Subject_Dto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과목 상세 조회</title>
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
	Subject_Dto sdto = (Subject_Dto) request.getAttribute("sdto");
%>
<body>


	<table>
		<tr>
			<th><%=sdto.getSub_name()%></th>
		</tr>
		<tr>
			<th><%=sdto.getSub_time()%></th>
		</tr>
		<tr>
			<th><%=sdto.getSub_exp()%></th>
		</tr>
	</table>
	<input type="button" value="과목수정" onclick="location.href='./modfysubform.do?sub_code=<%=sdto.getSub_code()%>'">

	<input type="button" value="완료">

</body>
</html>