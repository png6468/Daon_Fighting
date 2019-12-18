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
	List<SelectSel_Dto> listS = (List<SelectSel_Dto>)request.getAttribute("listS");
	List<DescPortSel_Dto> listD = (List<DescPortSel_Dto>)request.getAttribute("listD");
%>
<body>
<form action="./jechool.do" method="get">
	<%
	for(SelectSel_Dto Sdto : listS){
	%>
<table>
	<tr>
		<th>
		<input type="hidden" value="<%=Sdto.getCur_code()%>">
		<input type="hidden" value="<%=Sdto.getExa_code()%>">
		<input type="hidden" value="<%=Sdto.getCurexa_code()%>">
		</th>
	<!-- EXA_CODE, CUREXA_CODE, CUR_CODE, CONTENT, COR_ANSWER, FILENAME, WRO_ONE, WRO_TWO, WRO_THREE  -->
		<th>문제내용</th>
		<td><%=Sdto.getContent()%></td>
	</tr>
</table>
	<%
	}
	%>
</form>
<input type="submit" value="제출하기">
<input type="button" value="취소" onclick="history.back(-1)">

</body>
</html>