<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로그인 폼 전송 예제</h2>
	
	<form action="pro_login.jsp" method="POST"> <!-- GET -->
	
		<p><input type="text" name="id" placeholder="아이디입력"></p>
		<p><input type="password" name="pw" placeholder="비밀번호입력"></p>
		<p><input type="submit" value="로그인전송">
	
		
	</form>
</body>
</html>