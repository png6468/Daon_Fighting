<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ID 중복 확인</title>
</head>
<script type="text/javascript">
	onload = function(){
		var id = opener.document.getElementById("id").value;
		document.getElementById("id").value=id;
	}
	
	function confirmChk(bool){
		if(bool){
			opener.document.getElementsByName("password")[0].focus();
			opener.document.getElementById("id").title="y";
		}else{
			opener.document.getElementById("id").value="";
			opener.document.getElementById("id").focus();
		}
		self.close();
	}
	
	function cancel(){
		opener.document.getElementById("id").value="";
		opener.document.getElementById("id").focus();
		self.close();
	}
	
</script>

<body>
<table>
<tr>
	<td>
		<input type="text" name="adm_id" id="id" readonly="readonly">
	</td>
</tr>
<tr>
	<td>
		<c:if test="${isc}">
			사용할 수 있습니다.
		</c:if>
		<c:if test="${!isc}">
			사용할 수 없습니다.
		</c:if>
	</td>
</tr>
<tr>
	<td>
		<input type="button" value="확인" onclick="confirmChk(${isc})">
		<input type="button" value="취소" onclick="cancel()">
	</td>
</tr>
</table>
</body>
</html>