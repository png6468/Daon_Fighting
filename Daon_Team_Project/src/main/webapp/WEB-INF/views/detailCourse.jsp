<%@page import="com.min.edu.dtos.Course_Dto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과정상세조회</title>
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
	Course_Dto detail = (Course_Dto) request.getAttribute("cdto");
%>
<body>
<form action="./delCou.do" method="post">
<input type="hidden" name="cou_code" value="<%=detail.getCou_code()%>">
	<table>
		<tr>
			<th>회차</th>
			<th>강사 </th>
			<th>시작일 </th>
			<th>종료일</th>
			<th>교육시간</th>
		</tr>
		
	
		<tr>
			<td><%=detail.getCou_cnt()%></td>
			<td><%=detail.getTea_id()%></td>
			<td><%=detail.getStartdate()%> </td>
			<td><%=detail.getEnddate()%></td>
			<td><%=detail.getTotaltime()%> </td>
		</tr>
			<tr>
			<th><%=detail.getCou_exp()%></th>
		</tr>
				<tr
			onclick="location.href='./coustu.do?cou_code=<%=detail.getCou_code()%>'">

			<td>학생</td>
		
		</tr>
		
	</table>
			<input type="button" value="과정수정" onclick="location.href='./modfycouform.do?cou_code=<%=detail.getCou_code()%>'">
			<input type="submit" value="삭제" > 
			
	</form>

</body>
</html>