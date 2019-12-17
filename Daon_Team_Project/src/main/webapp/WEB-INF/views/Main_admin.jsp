<%@page import="com.min.edu.dtos.Admin_Dto"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% Admin_Dto dto = (Admin_Dto)session.getAttribute("dto"); %>
로그인에 성공했네
<br>
<h2><%=dto.getAdm_id()%>님 환영합니다.</h2>
</body>
</html>