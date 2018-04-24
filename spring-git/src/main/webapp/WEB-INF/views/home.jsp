<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

<jsp:include page="header.jsp" />

</body>
</html>