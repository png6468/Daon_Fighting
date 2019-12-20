<%@page import="com.min.edu.dtos.ExamDesc_Dto"%>
<%@page import="com.min.edu.dtos.ExamSelect_Dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function gosel(){
		var sub = document.getElementById("sub").value;
		location.href="./munlist.do?mean=S&sub="+sub;
	}
	function godesc(){
		var sub = document.getElementById("sub").value;
		location.href="./munlist.do?mean=D&sub="+sub;
	}
	function goport(){
		var sub = document.getElementById("sub").value;
		location.href="./munlist.do?mean=P&sub="+sub;
	}
</script>
<body>

<% 
	String mean = (String)request.getAttribute("mean");
	String sub = (String)request.getAttribute("sub");
%>
<input type="button" value="객관식 문제" onclick="gosel()">
<input type="button" value="주관식 문제" onclick="godesc()">
<input type="button" value="포트폴리오형 문제" onclick="goport()">
<input type="hidden" id="sub" value="<%=sub%>">
<table border="1">
	<%
	if(mean.equalsIgnoreCase("S")){
		List<ExamSelect_Dto> lists = (List<ExamSelect_Dto>)request.getAttribute("lists");
	%>
	<thead>
	<tr>
		<td>선택</td>
		<td>문제내용</td>
		<td>첨부파일</td>
		<td>정답</td>
		<td>오답1</td>
		<td>오답2</td>
		<td>오답3</td>
	</tr>
	</thead>
	<%for(ExamSelect_Dto dto : lists){
	%>
	<tr>
		<td>
			<input type="checkbox" value="<%=dto.getSeq()%>">
			<input type="hidden" value="<%=dto.getExa_code()%>">
		</td>
		<td><%=dto.getContent()%></td>
		<%if(dto.getFilename()==null || dto.getFilename().equalsIgnoreCase(null) || dto.getFilename().equalsIgnoreCase("null")){ %>
		<td></td>
		<%}else{%>
		<td><%=dto.getFilename()%></td>
		<%}%>
		<td><%=dto.getCor_answer()%></td>
		<td><%=dto.getWro_one()%></td>
		<td><%=dto.getWro_two()%></td>
		<td><%=dto.getWro_three()%></td>
	</tr>
	<% 
	}
	}else{
		List<ExamDesc_Dto> lists = (List<ExamDesc_Dto>)request.getAttribute("lists");
	%>
	<thead>
	<tr>
		<td>선택</td>
		<td>문제내용</td>
		<td>첨부파일</td>
		<td>정답예시</td>
	</tr>
	</thead>
	<%for(ExamDesc_Dto dto : lists){
	%>
	<tr>
		<td>
			<input type="checkbox" value="<%=dto.getSeq()%>">
			<input type="hidden" value="<%=dto.getExa_code()%>">
		</td>
		<td><%=dto.getContent()%></td>
		<%if(dto.getFilename()==null || dto.getFilename().equalsIgnoreCase(null) || dto.getFilename().equalsIgnoreCase("null")){ %>
		<td></td>
		<%}else{%>
		<td><%=dto.getFilename()%></td>
		<%}%>
		<td><%=dto.getStandard()%></td>
	</tr>
	<% 
	}
	}
	%>
</table>
<input type="button" value="뒤로가기" onclick="location.href='./test_domain.do';">
</body>
</html>