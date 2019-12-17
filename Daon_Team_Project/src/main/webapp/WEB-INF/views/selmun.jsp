<%@page import="com.min.edu.dtos.ExamDesc_Dto"%>
<%@page import="com.min.edu.dtos.ExamSelect_Dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<% 
	String mean = (String)request.getAttribute("mean");
%>
<h1>���� ����?</h1>
<table border="1">
	<%
	if(mean.equalsIgnoreCase("S")){
		List<ExamSelect_Dto> lists = (List<ExamSelect_Dto>)request.getAttribute("lists");
	%>
	<thead>
	<tr>
		<td><input type="checkbox"></td>
		<td>��������</td>
		<td>�׸�</td>
		<td>����</td>
		<td>����1</td>
		<td>����2</td>
		<td>����3</td>
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
		<td><%=dto.getFilename()%></td>
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
		<td><input type="checkbox"></td>
		<td>��������</td>
		<td>�׸�</td>
		<td>���俹��</td>
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
		<td><%=dto.getFilename()%></td>
		<td><%=dto.getStandard()%></td>
	</tr>
	<% 
	}
	}
	%>
</table>
</body>
</html>