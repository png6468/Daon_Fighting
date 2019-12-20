<%@page import="com.min.edu.dtos.DescPortSel_Dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서술형 + 포폴 문제 조회</title>
</head>
<script type="text/javascript" src="./ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="./js/jquery-3.4.1.js"></script>
<script type="text/javascript">

// 	$(function() {
// 		CKEDITOR.replace('ckeditor1', {
// 			width : "100%",
// 			height : "300px",
// 			filebrowserUploadUrl : "./imgUp.do"
// 		});
// 	});
// 	$(function() {
// 		CKEDITOR.replace('ckeditor2', {
// 			width : "100%",
// 			height : "300px",
// 			filebrowserUploadUrl : "./imgUp.do"
// 		});
// 	});
</script>


<%
	List<DescPortSel_Dto> lists = (List<DescPortSel_Dto>)request.getAttribute("lists");
%>
<body>
<%=lists%>
<form action="">
<%
		for(DescPortSel_Dto dto :lists ){
	%>
<input type="hidden" name="curexa_code" value="<%=dto.getCurexa_code()%>">
<input type="hidden" name="cur_code" value="<%=dto.getCur_code() %>">
	<table>
	
		<tr>
			<td>문제<%=dto.getExa_code()%></td>
		</tr>
		<tr>
			<td>
				<%=dto.getContent() %>
			</td>
		</tr>
		<tr>	
			<td>
				<%=dto.getStandard() %>
			</td>
		</tr>
		<%
		}
		%>
		
		

	</table>
 
</form>
</body>
</html>