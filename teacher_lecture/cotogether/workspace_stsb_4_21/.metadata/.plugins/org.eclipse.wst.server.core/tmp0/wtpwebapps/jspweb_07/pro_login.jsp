<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		// 아이디와 비밀번호를 받아서 출력하시오
		String userid = request.getParameter("id");
		String userpw = request.getParameter("pw");
	%>
	
	<p>입력한 아이디: <%= userid %></p>
	<p>입력한 비밀번호: <%= userpw %></p>
</body>
</html>