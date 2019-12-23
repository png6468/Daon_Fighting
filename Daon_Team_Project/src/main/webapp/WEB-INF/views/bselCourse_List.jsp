<%@page import="com.min.edu.dtos.Course_Dto"%>
<%@page import="com.min.edu.dtos.Paging_Dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>종료 과정 리스트 페이지</title>
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
	List<Course_Dto> clists = (List<Course_Dto>) request.getAttribute("clists");
%>
<body>
	<table>

		<tr>
			<th style="text-align: center;"><input type="text" value="운영과정"
				readonly="readonly"></th>
		</tr>
		<tr style="border: auto;">
			<th><input type="hidden" value="번호"></th>
			<th>과정명</th>
			<th>회차</th>
			<th>강사</th>
			<th>시작일</th>
			<th>종료일</th>
			<th>총교육시간</th>
		</tr>
		<%
			for (Course_Dto vo : clists) {
		%>
		<tr class="bseldetail" onclick="location.href='./detailCou.do?cou_code=<%=vo.getCou_code()%>'">
		 
			<td><input type="hidden" value="<%=vo.getCou_code()%>">
			</td>
			
			<td><%=vo.getCou_name()%></td>
			<td><%=vo.getCou_cnt()%></td>
			<td><%=vo.getTea_id()%></td>
			<td><%=vo.getStartdate()%></td>
			<td><%=vo.getEnddate()%></td>
			<td><%=vo.getTotaltime()%></td>
		</tr>
	
		<%
			}
		%>
	</table>
</body>
</html>