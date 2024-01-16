<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="utils.DBConfig" %> <!--  다른 경로의 자바 파일 호출 -->
<%@ page import="java.sql.*" %> <!-- 오라클 쿼리를 동작하기 위한 라이브러리 호출 -->    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		// 클라이언트 폼정보를 받음
		String empName = request.getParameter("employeeName");
		String subject = request.getParameter("postTitle");
		String content = request.getParameter("postContent");
		
		// 디비접속 (주의사항: import 먼저해야 사용가능)
		Connection connection = null;
		try {
			connection = DBConfig.getConnection();
			System.out.println("디비접속 성공-게시글등록");
		}catch(Exception e) {
			System.out.println("에러로그: " + e.getMessage());
		}
		
		// 쿼리실행 
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			String sql = "INSERT INTO BO_FREE (name, subject, content) VALUES (?, ?, ?)";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, empName);
			pstmt.setString(2, subject);
			pstmt.setString(3, content);
			result = pstmt.executeUpdate(); // 1이면 성공, 0이면 실패
			System.out.println("게시글등록결과: " + result);
			if(result==1) { // 성공시 board.jsp 로 이동
				out.println("<script>location.href='board.jsp'</script>");
			}else{
				// 실패해도 board.jsp로 이동 (에러로그 남기고)
				out.println("<script>location.href='board.jsp'</script>");
			}
		}catch(SQLException se) {
			System.out.println("에러로그: " + se.getMessage());
		}
		
	%>
</body>
</html>