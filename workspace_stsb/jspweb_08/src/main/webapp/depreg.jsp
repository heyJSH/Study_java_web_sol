<!-- 서버에서 부서 정보를 처리하는 JSP -->
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
	String depid = request.getParameter("depid");
	String name = request.getParameter("name");
	String location = request.getParameter("location");
	String contact = request.getParameter("contact");
	
	// 오라클 DB와 접속
	Connection connection = null;
	PreparedStatement pstmt = null;
	
	// 접속하기
	try {
      // connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
      connection = DBconfig.getConnection();
      System.out.println("jsp계정 접속성공");
    } catch (Exception e) {
       System.out.println("jsp계정 접속실패");
    }
	
	// 폼 정보에서 받은 변수 depid, name, location, contact
	try {	// sql 문을 실행할 때 발생할 수 있는 예외들을 처리하기 위한 구문
		String sql = "INSERT INTO DEPARTMENTS (DEPART_ID, DEPART_NAME, LOCATION, PHONE_NUMBER) VALUES (?,?,?,?)";
		pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, depid);
		pstmt.setString(2, name);
		pstmt.setString(3, location);
		pstmt.setString(4, contact);
		
		int result = pstmt.executeUpdate();
		System.out.println("데이터 입력결과: " +result);
		
		// 등록 성공 시 => 부서목록화면 deplist.jsp로 이동
		if(result==1) {
			out.println("<script>alert('부서 등록 성공')</script>");
	        out.println("<script>location.href='deplist.jsp'</script>");
		} else {
			out.println("<script>location.href='depform.jsp'</script>");
		}
		
	} catch(SQLException se) {
		
	}
	
%>
	<h1>부서정보처리</h1>
	<p>부서번호 : <%= depid %></p>
    <p>부서명 : <%= name %></p>
    <p>지역 : <%= location %></p>
    <p>연락처 : <%= contact %></p>
</body>
</html>