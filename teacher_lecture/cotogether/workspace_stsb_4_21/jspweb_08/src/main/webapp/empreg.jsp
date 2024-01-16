<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 디비접속 -->
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
		// 웹서버에 jsp로 클라이언트 폼정보를 받는 기능
		out.println("직원정보처리");
		String empid = request.getParameter("empid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		
		// 오라클 디비와 접속
		Connection connection = null;
		PreparedStatement pstmt = null;
		// 접속하기 
		try {
		  //connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
		  connection = DBConfig.getConnection();
		  out.println("jsp계정 접속성공");
		}catch(Exception e) {
		  out.println("jsp계정 접속실패");		  
		}	
		
		// 폼정보에서 받은 변수들 empid, name, email, contact 값
		try{ // sql문을 실행할 때 발생할 수 있는 예외들을 처리하기 위한 구문
			String sql = "INSERT INTO EMPLOYEES (EMPLOYEE_ID, LAST_NAME, EMAIL, PHONE_NUMBER) VALUES (?,?,?,?)";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, empid);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, contact);
			int result = pstmt.executeUpdate();			
			out.println("데이터입력결과: "+ result);
			// 성공이되면 직원목록화면 emplist.jsp
			if(result == 1) {
				out.println("<script>alert('직원등록성공!!')</script>");
				out.println("<script>location.href='emplist.jsp'</script>");
			}else{ // 실패하면 다시 직원등록화면
				
			}
		}catch(SQLException se) {
			
		}
		
	%>
</body>
</html>