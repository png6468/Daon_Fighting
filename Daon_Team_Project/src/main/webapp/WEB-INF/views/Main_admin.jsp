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
�α��ο� �����߳�
<br>
<h2><%=dto.getAdm_id()%>�� ȯ���մϴ�.</h2>
</body>
</html>