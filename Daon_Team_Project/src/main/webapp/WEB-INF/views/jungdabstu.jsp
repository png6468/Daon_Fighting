<%@page import="java.util.List"%>
<%@page import="com.min.edu.dtos.AnswerScore_Dto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생의정답조회 주관식/포폴</title>
</head>
<%
	List<AnswerScore_Dto> lists =  (List<AnswerScore_Dto>)request.getAttribute("lists");
%>
<body>
??나오나??
<%=lists %>
</body>
</html>