<!-- 게시판 작성 폼 출력 및 처리 -->
<!-- 서버에서 게시판 정보를 처리하는 JSP -->
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="utils.DBconfig"%>
<%@page import="java.sql.Connection"%>
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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String hp = request.getParameter("hp");
		String hompy = request.getParameter("hompy");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		
		// 오라클 DB와 접속
		Connection connection = null;
	    PreparedStatement pstmt = null;
	    
	    // 접속하기
	    try {
	    	connection = DBconfig.getConnection();
	    	System.out.println("jsp계정 접속성공");
	    } catch(Exception e) {
	    	System.out.println("jsp계정 접속실패");
	    }
	    
	    // 폼 정보에서 받은 변수를 id, pw, name, hp, hompy, subject, content 값으로
	    try {
	    	String sql = "";
	    } catch(SQLException se) {
	    	
	    }
	%>
</body>
</html>