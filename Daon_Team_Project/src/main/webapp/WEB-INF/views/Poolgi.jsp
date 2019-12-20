<%@page import="com.min.edu.dtos.ExamSelect_Dto"%>
<%@page import="com.min.edu.dtos.DescPortSel_Dto"%>
<%@page import="com.min.edu.dtos.SelectSel_Dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생의 문제풀이 화면</title>
</head>
<script type="text/javascript" src="./ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="./js/jquery-3.4.1.js"></script>
<script type="text/javascript">

	$(function() {
		CKEDITOR.replace('ckeditor', {
			width : "100%",
			height : "300px",
			filebrowserUploadUrl : "./imgUp.do"
		});
	});
</script>

<%
	String mean = (String)request.getAttribute("mean");
%>
<body>
<table border="1">
<%
	if(mean.equalsIgnoreCase("S")){
		List<SelectSel_Dto> listS = (List<SelectSel_Dto>)request.getAttribute("listS");
%>
	<%
		for(SelectSel_Dto dtos : listS){
	%>
<input type="hidden" value="<%=dtos.getCur_code()%>">
<input type="hidden" value="<%=dtos.getCurexa_code()%>">
<input type="hidden" value="<%=dtos.getExa_code()%>">
	<tr>	
		<th>문제내용</th>
		<td><%=dtos.getContent() %></td>
	</tr>
	<tr>
		<th>파일</th>
		<td><%=dtos.getFilename() %></td>
	</tr>
	<tr>
		<th rowspan="4">답변</th>
		<td><input type="radio" name="radioRd"><%=dtos.getCor_answer() %></td>
	</tr>
	<tr>
		<td><input type="radio" name="radioRd"><%=dtos.getWro_one() %></td>
	</tr>
	<tr>
		<td><input type="radio" name="radioRd"><%=dtos.getWro_two() %></td>
	</tr>
	<tr>
		<td><input type="radio" name="radioRd"><%=dtos.getWro_three() %></td>
	</tr>
		<%}
	}else if(mean.equalsIgnoreCase("D")){
		List<DescPortSel_Dto> listD = (List<DescPortSel_Dto>)request.getAttribute("listD");
		%>
	<%
	for(DescPortSel_Dto dtod: listD){
	%>
	<input type="hidden" value="<%=dtod.getCur_code()%>">
	<input type="hidden" value="<%=dtod.getCurexa_code()%>">
	<input type="hidden" value="<%=dtod.getExa_code()%>">
	<tr>	
		<th>문제내용</th>
		<td><%=dtod.getContent() %></td>
	</tr>
	<tr>
		<th>파일</th>
		<td><%=dtod.getFilename() %></td>
	</tr>
	<tr>
		<td>
		<textarea rows="5" cols="5" id="ckeditor"></textarea>
		</td>
	</tr>
	<tr>
		<th>모법답안</th>
		<td><%=dtod.getStandard()%></td>
	</tr>
		<%
	}
} 
%>
</table>
</body>
</html>