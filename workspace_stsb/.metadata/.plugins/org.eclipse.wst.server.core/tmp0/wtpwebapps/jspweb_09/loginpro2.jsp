<!-- 동일한 id를 select하여 실행 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="utils.DBconfig" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h2>사용자 인증 처리</h2>
   <%
      String empid = request.getParameter("employeeId");
      String userpw = request.getParameter("userPw");
      
      Connection connection = null;         // 디비 접속 성공시 접속 정보 저장
      PreparedStatement pstmt = null;         // 쿼리를 실행하기 객체 정보
      ResultSet resultSet = null;            // SELECT 결과를 저장하는 정보
      
      // DB 접속
      try {
         connection = DBconfig.getConnection();   // 주의: 접속 성공시 접속 정보 저장
         System.out.println("접속 성공");
      } catch(SQLException se) {
         System.out.println("접속 실패");
      }
      // 아이디 비밀번호 체크
      int result = 0;
      try {
         // String sql = "SELECT count(*) as CNT FROM EMPLOYEES WHERE EMPLOYEE_ID = ? AND USER_PW=?";
         String sql = "SELECT EMPLOYEE_ID, USER_PW FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
         pstmt = connection.prepareStatement(sql);
         pstmt.setInt(1, Integer.valueOf(empid));
         // pstmt.setString(2, userpw);
         resultSet = pstmt.executeQuery();    // executeQuery: SELECT 일 경우
         
         /* 수정 필요(구체적으로 뭐하라는겨?)
         while(resultSet.next()){
            result = resultSet.getInt("CNT");
            System.out.println("결과: "+result);	// 1이면 id/pw가 존재, 아니면 존재하지 않음
         }
         if(result == 1) {	// 로그인 성공 => main.jsp
        	 out.println("<script>location.href='main.jsp'</script>");
         } else {	// 로그인 실패 => loginform.jsp
        	 out.println("<script>location.href='loginform.jsp'</script>");
         }
         */
      } catch(SQLException se) {
         
      }
      
      
   %>
   
   <% //System.out.println("empid = "+ empid); %>
   <br>
   <% //System.out.println("userpw = "+ userpw); %>
</body>
</html>