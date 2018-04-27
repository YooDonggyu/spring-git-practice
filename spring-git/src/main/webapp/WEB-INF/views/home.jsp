<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="//code.jquery.com/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#loginForm").submit(function() {
			var inputId = $("#id").val();
			var inputPw = $("#password").val();
			
			if(inputId.trim().length == 0 || inputPw.trim().length == 0){
				alert("아이디 혹은 비밀번호를 입력하세요");
				return false;
			}
		});//login
		
		$("#logoutBtn").click(function(){
			location.href="logout.do";
		})//logoutBtn
		
		
	});//document
</script>
<body>

<h3>Spring - Git Practice</h3>
<h4>with Git Stash</h4>

<jsp:include page="header.jsp" /><hr>

<table>
	<thead>
		<tr>
			<td>선택</td><td>회사명</td><td>가격</td>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${stockList }" var="list">
		<tr>
			<td><input type="radio" name="stockRadio"></td>
			<td>${list.symbol }</td>
			<td>${list.price }</td>
		</tr>
	</c:forEach>
	</tbody>
</table><br>
<c:if test="${customerVO !=null }">
	<input type="radio" name="buysell">매수 &nbsp; 
	<input type="radio" name="buysell">매도 &nbsp;<br>
	수량 <input type="number" name="quantity" min="1" max="999999"> &nbsp;
	<input type="button" value="거래하기" name=""><br><br>
	
	<table>
		<thead>
			<tr>
				<td>회사명</td><td>수량</td><td>총합</td>
			</tr>
		</thead>
		<tbody id="shareList">
				<c:forEach items="${shareList }" var="slist">
					<tr>
						<td>${slist.symbol }</td>
						<td>${slist.quantity }</td>
						<td>${slist.totalprice }</td>
					</tr>
				</c:forEach>
		</tbody>
	</table>
	
</c:if>



</body>
</html>