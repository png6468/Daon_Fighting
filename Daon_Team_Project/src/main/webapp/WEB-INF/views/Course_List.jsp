<%@page import="com.min.edu.dtos.Paging_Dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과정 리스트 페이지</title>
</head>
<%
	List<Paging_Dto> lists = (List<Paging_Dto>)request.getAttribute("lists");
%>
<body>
<form action="" method="post">
	<table>
		<tr>
			<th style="text-align: center;">
				<input type="text" value="운영과정" readonly="readonly">
			</th>
		</tr>
		<%
		for(Paging_Dto pg : lists){
		%>
			
		<tr>
			<td>
				<input type="hidden" value="seq">
			</td>
			<td>과정명</td>
			<td>회차</td>
			<td>강사</td>
			<td>시작일</td>
			<td>종료일</td>
			<td>총교육시간</td>
		</tr>
		<%
		}
		%>
	</table>
</form>
</body>
</html>