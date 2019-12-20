<%@page import="com.min.edu.dtos.Course_Dto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과정상세조회</title>
</head>
<% Course_Dto detail =  (Course_Dto)request.getAttribute("cdto"); %>
<body>
<%=detail%>
</body>
</html>