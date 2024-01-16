<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="utils.DBConfig" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	try {
		DBConfig.getConnection();
		out.println("jsp계정 접속성공");
	}catch(Exception e) {
		out.println("jsp계정 접속실패");
		
	}

%>

</body>
</html>