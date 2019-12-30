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

<form action="./delSub.do" method="post">
<input type="hidden" name="sub_code" value="<%=sdto.getSub_code()%>">
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
	<input type="submit" value="삭제" > 
	<input type="button" value="완료">
</form>
</body>
</html>