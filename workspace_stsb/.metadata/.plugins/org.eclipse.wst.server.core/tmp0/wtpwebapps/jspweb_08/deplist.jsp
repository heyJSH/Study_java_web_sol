<!-- 부서목록 가져옴 -->
<!-- 1.화면설계, 2.디비접속, rs = pstmt.executeQuery(); => select, int result = executeUpdate(); => insert, update, delete -->
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 디비접속 -->
<%@ page import ="java.sql.*" %>
<%@ page import="utils.DBconfig" %>
<%@ page import="java.util.*" %>
<%@ page import = "vo.DepVo" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	/* 부서 목록 CSS */
   body {
      font-family: Arial, sans-serif;
      background-color: #f2f2f2;
      margin: 0;
      padding: 0;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
   }
   .department-list {
      background-color: #fff;
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
   }

   table {
      width: 100%;
      border-collapse: collapse;
      margin-top: 20px;
   }

   th, td {
      border: 1px solid #ddd;
      padding: 10px;
      text-align: left;
   }

   th {
      background-color: #3498db;
      color: #fff;
   }
</style>
</head>
<body>

	<%
      // 오라클 디비와 접속
      Connection connection = null;      
      // 접속하기 
      try {
        //connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
        connection = DBconfig.getConnection();
        System.out.println("jsp계정 접속성공");
      }catch(Exception e) {
   	  	System.out.println("jsp계정 접속실패");        
      }
      
      // 직원정보 목록을 가져오는 쿼리 실행
      // Statement stmt = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;		// select된 결과를 저장하는 배열
      ArrayList<DepVo> deplist = new ArrayList<>();	// 상단에 page import="java.util.*"
      
      try {
    	  String sql = "SELECT DEPART_ID, DEPART_NAME, LOCATION, PHONE_NUMBER FROM DEPARTMENTS";
    	  // ?있을 때는 pstmt = connection.prepareStatement(sql);
    	  // ?없이 가져올때는 stmt = connection.createStatement();
    	  // stmt = connection.createStatement();
    	  pstmt = connection.prepareStatement(sql);
    	  rs = pstmt.executeQuery();
    	  while(rs.next()) {
    		  DepVo depvo = new DepVo();	// 상단에 @ page import = "vo.*"
    		  depvo.setDepart_id(rs.getString("DEPART_ID"));
    		  depvo.setDepart_name(rs.getString("DEPART_NAME"));
    		  depvo.setLocation(rs.getString("LOCATION"));
    		  depvo.setPhone_number(rs.getString("PHONE_NUMBER"));
    		  deplist.add(depvo);
    	  }
    	  System.out.println("총개수: " + deplist.size());
      } catch(SQLException se) {
    	  System.out.println("에러로그: 부서목록==> " + se.getMessage());
      }
   %>
   
	 <div class="department-list">
        <h2>부서 목록</h2>
        <button onclick="handleAddButtonClick()">부서 등록</button> <!-- 등록 버튼 추가 -->
        <table>
            <thead>
            <tr>
	            <th>부서번호</th>
	            <th>부서명</th>
	            <th>위치</th>
	            <th>연락처</th>
	            <th>동작</th> <!-- 새로운 열 추가 -->
            </tr>
            </thead>
            <tbody>
            <%
            	for(int i=0; i<deplist.size(); i++) {
            		DepVo temp = deplist.get(i);
            %>
            <tr>
            	<td><%= temp.getDepart_id() %></td>
                <td><%= temp.getDepart_name() %></td>
                <td><%= temp.getLocation() %></td>
                <td><%= temp.getPhone_number() %></td>
                <td><button onclick="handleButtonClick(0)">수정 처리</button> <!-- 버튼 추가 -->
                	<button onclick="handleButtonClick(0)">삭제 처리</button> <!-- 버튼 추가 -->
                
                </td> <!-- 상세보기 버튼 추가 -->
            </tr>
            <%
            	}
            %>
            
            <!-- 다른 부서들의 정보도 추가할 수 있습니다. -->
            </tbody>
        </table>
    </div>
    
    <script>
      function handleAddButtonClick() {
           location.href="depform.jsp";
       }
   </script>
</body>
</html>