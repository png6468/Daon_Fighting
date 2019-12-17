<%@page import="com.min.edu.dtos.Admin_Dto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script type="text/javascript" src="./js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="./js/bootstrap.min.js"></script>
<script type="text/javascript" src="./js/sweetalert.min.js"></script>

<link type="text/css" rel="stylesheet" href="./css/bootstrap.min.css">
<link type="text/css" rel="stylesheet" href="./css/bootstrap-theme.min.css">
<link type="text/css" rel="stylesheet" href="./css/sweetalert.min.css">
<script>
    // html dom 이 다 로딩된 후 실행된다.
    $(document).ready(function(){
        // menu 클래스 바로 하위에 있는 a 태그를 클릭했을때
        $(".menu>a").click(function(){
            var submenu = $(this).next("ul");
 
            // submenu 가 화면상에 보일때는 위로 보드랍게 접고 아니면 아래로 보드랍게 펼치기
            if( submenu.is(":visible") ){
                submenu.slideUp();
            }else{
                submenu.slideDown();
            }
        });
    });
</script>
<script>
    // html dom 이 다 로딩된 후 실행된다.
    $(document).ready(function(){
        // memu 클래스 바로 하위에 있는 a 태그를 클릭했을때
        $(".menu>a").click(function(){
            // 현재 클릭한 태그가 a 이기 때문에
            // a 옆의 태그중 ul 태그에 hide 클래스 태그를 넣던지 빼던지 한다.
            $(this).next("ul").toggleClass("hide");
        });
    });
</script>
	<% Admin_Dto dto = (Admin_Dto)session.getAttribute("dto"); %>
	<div><%=dto.getAdm_id()%>님 환영합니다.</div>
	<div>
    <ul>
    	<li>
    		<h3>다온</h3>
    	</li>
    	<%if(dto.getAdm_auth().equals("T")){
    		%>    		
        <li>
            <a href="./allAdmin.do">관리자 조회</a>
        </li>
    		<%
    	}
    	%>
    	<%if(dto.getAdm_auth().equals("U")){
    		%>    		
        <li class="menu">
            <a>회원 조회</a>
            <ul class="hide">
                <li>강사 조회</li>
                <li>학생 조회</li>
            </ul>
        </li>
        <li class="menu">
            <a>회원 등록</a>
            <ul class="hide">
                <li>강사 등록</li>
                <li>학생 등록</li>
            </ul>
        </li>
    		<%
    	}
    	%>
       <%if(dto.getAdm_auth().equals("C")){
    		%>    		
        <li class="menu">
            <a>과정</a>
            <ul class="hide">
                <li>운영 과정 조회</li>
                <li>종료 과정 조회</li>
                <li>예정 과정 조회</li>
                <li>과정 개설</li>
            </ul>
        </li>
        <li class="menu">
            <a>과목</a>
            <ul class="hide">
                <li>과목 조회</li>
                <li>과목 생성</li>
            </ul>
        </li>
    		<%
    	}
    	%>
    	 <li>
            <a>마이페이지</a>
        </li>
    	 <li>
            <a href="./logout_Admin.do">로그아웃</a>
        </li>
        
    </ul>
</div>
