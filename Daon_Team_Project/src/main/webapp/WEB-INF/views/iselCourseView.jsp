<%@page import="com.min.edu.dtos.Course_Dto"%>
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
	List<Course_Dto> lists = (List<Course_Dto>)request.getAttribute("Cdto");
%>
<body>
	<table>
		<tr>
			<th style="text-align: center;">
				<input type="text" value="운영과정" readonly="readonly">
			</th>
		</tr>
		<tr style="border: auto;">
			<th>
				<input type="hidden" value="번호">
			</th>
			<th>과정명</th>
			<th>회차</th>
			<th>강사</th>
			<th>시작일</th>
			<th>종료일</th>
			<th>총교육시간</th>
		</tr>
		<%for(Course_Dto vo : lists){ %>
		<tr>
			<td>
				<input type="hidden" value="<%=vo.getCou_code()%>">
			</td>
			<td><%=vo.getCou_name() %></td>
			<td><%=vo.getCou_cnt() %></td>
			<td><%=vo.getTea_id() %></td>
			<td><%=vo.getStartdate() %></td>
			<td><%=vo.getEnddate() %></td>
			<td><%=vo.getTotaltime() %></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>