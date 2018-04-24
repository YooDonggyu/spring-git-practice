<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:choose>
<c:when test="${customerVO ==null }">
    <form action="login.do" method="post" id="loginForm">
    아이디 <input type="text" name="id" id="id"> &nbsp;  
    비밀번호 <input type="password" name="password" id = "password"> &nbsp; 
    <input type="submit"  value="로그인">
    </form>
</c:when>
<c:otherwise>
	${customerVO.address }에 사는 ${customerVO.name }님 환영합니다!  &nbsp;
	<input type="button" value="로그아웃"  id="logoutBtn">
</c:otherwise>
</c:choose>


