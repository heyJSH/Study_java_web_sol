/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-01-15 07:00:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class readbbs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/header.jsp", Long.valueOf(1705297723037L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("  <style>\r\n");
      out.write("    body {\r\n");
      out.write("      font-family: Arial, sans-serif;\r\n");
      out.write("      background-color: #f4f4f4;\r\n");
      out.write("      margin: 0;\r\n");
      out.write("      padding: 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .container {\r\n");
      out.write("      max-width: 800px;\r\n");
      out.write("      margin: 50px auto;\r\n");
      out.write("      background-color: #fff;\r\n");
      out.write("      padding: 20px;\r\n");
      out.write("      border-radius: 8px;\r\n");
      out.write("      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    h2, h3, p {\r\n");
      out.write("      color: #333;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .meta-info {\r\n");
      out.write("      margin-bottom: 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .meta-info span {\r\n");
      out.write("      font-weight: bold;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .content {\r\n");
      out.write("      line-height: 1.6;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .back-link {\r\n");
      out.write("      display: flex;\r\n");
      out.write("      justify-content: center;\r\n");
      out.write("      margin-top: 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .back-link button {\r\n");
      out.write("      background-color: #4caf50;\r\n");
      out.write("      color: #fff;\r\n");
      out.write("      padding: 10px 15px;\r\n");
      out.write("      border: none;\r\n");
      out.write("      border-radius: 4px;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .back-link button:hover {\r\n");
      out.write("      background-color: #45a049;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .comments-section {\r\n");
      out.write("      margin-top: 30px;\r\n");
      out.write("      border-top: 1px solid #ccc;\r\n");
      out.write("      padding-top: 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .comment-form {\r\n");
      out.write("      margin-bottom: 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .comment-form textarea {\r\n");
      out.write("      width: 100%;\r\n");
      out.write("      padding: 10px;\r\n");
      out.write("      margin-bottom: 10px;\r\n");
      out.write("      border: 1px solid #ccc;\r\n");
      out.write("      border-radius: 4px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .comment-list {\r\n");
      out.write("      list-style: none;\r\n");
      out.write("      padding: 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .comment {\r\n");
      out.write("      border-bottom: 1px solid #ccc;\r\n");
      out.write("      padding: 10px 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .attachment {\r\n");
      out.write("      margin-top: 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .attachment a {\r\n");
      out.write("      display: block;\r\n");
      out.write("      color: #4caf50;\r\n");
      out.write("      text-decoration: none;\r\n");
      out.write("      font-weight: bold;\r\n");
      out.write("      margin-top: 10px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .attachment a:hover {\r\n");
      out.write("      text-decoration: underline;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .delete-button {\r\n");
      out.write("      background-color: #f44336;\r\n");
      out.write("      color: #fff;\r\n");
      out.write("      padding: 10px 15px;\r\n");
      out.write("      border: none;\r\n");
      out.write("      border-radius: 4px;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("      margin-top: 10px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .delete-button:hover {\r\n");
      out.write("      background-color: #d32f2f;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<!-- 헤더영역 공통부분 -->\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("    body {\r\n");
      out.write("      font-family: Arial, sans-serif;\r\n");
      out.write("      margin: 0;\r\n");
      out.write("      padding: 0;\r\n");
      out.write("      background-color: #f4f4f4;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .top-menu {\r\n");
      out.write("      background-color: #333;\r\n");
      out.write("      color: #fff;\r\n");
      out.write("      padding: 10px 20px;\r\n");
      out.write("      display: flex;\r\n");
      out.write("      justify-content: space-between;\r\n");
      out.write("      align-items: center;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .logo {\r\n");
      out.write("      font-size: 24px;\r\n");
      out.write("      font-weight: bold;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .login-menu {\r\n");
      out.write("      display: flex;\r\n");
      out.write("      align-items: center;\r\n");
      out.write("    }\r\n");
      out.write("    .login-menu li {\r\n");
      out.write("        display: inline-block;\r\n");
      out.write("        margin: 5px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .login-menu a {\r\n");
      out.write("      color: #fff;\r\n");
      out.write("      text-decoration: none;\r\n");
      out.write("      margin-left: 20px;\r\n");
      out.write("      font-weight: bold;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .login-menu button {\r\n");
      out.write("      background-color: #4caf50;\r\n");
      out.write("      color: #fff;\r\n");
      out.write("      border: none;\r\n");
      out.write("      padding: 8px 15px;\r\n");
      out.write("      border-radius: 4px;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .login-menu button:hover {\r\n");
      out.write("      background-color: #45a049;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"top-menu\">\r\n");
      out.write("	   <div class=\"logo\">휴먼교육(주)</div>\r\n");
      out.write("	   <div class=\"login-menu\">\r\n");
      out.write("	     <li><a href=\"#\">Home</a></li>\r\n");
      out.write("	     <li><a href=\"#\">About</a></li>\r\n");
      out.write("	     <li><a href=\"board.jsp\">Board</a></li>\r\n");
      out.write("	     <li><button onclick=\"showLoginModal()\">로그인</button></li>\r\n");
      out.write("	   </div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("		function showLoginModal() {\r\n");
      out.write("			location.href='loginform.jsp';\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	<!-- 헤더영역 공통부분 끝 -->\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("    <h2>게시글 제목</h2>\r\n");
      out.write("    <div class=\"meta-info\">\r\n");
      out.write("      <span>작성자:</span> 작성자 이름<br>\r\n");
      out.write("      <span>작성일:</span> 2024-01-14\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("      <p>게시글 내용이 여기에 들어갑니다. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac elit sit amet nunc tincidunt facilisis. Nulla facilisi.</p>\r\n");
      out.write("    </div>\r\n");
      out.write(" <div class=\"back-link\">\r\n");
      out.write("      <button onclick=\"goBack()\">목록으로 돌아가기</button>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 댓글 섹션 시작 -->\r\n");
      out.write("    <div class=\"comments-section\">\r\n");
      out.write("      <h3>댓글</h3>\r\n");
      out.write("\r\n");
      out.write("      <!-- 댓글 작성 폼 -->\r\n");
      out.write("      <div class=\"comment-form\">\r\n");
      out.write("        <textarea id=\"commentText\" placeholder=\"댓글을 작성하세요\"></textarea>\r\n");
      out.write("        <button onclick=\"postComment()\">댓글 작성</button>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- 댓글 목록 -->\r\n");
      out.write("      <ul class=\"comment-list\">\r\n");
      out.write("        <li class=\"comment\">댓글 1: 여기에 댓글 내용이 들어갑니다.</li>\r\n");
      out.write("        <li class=\"comment\">댓글 2: 다른 사용자의 댓글 내용이 들어갑니다.</li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 댓글 섹션 끝 -->\r\n");
      out.write("\r\n");
      out.write("    <!-- 삭제 버튼 -->\r\n");
      out.write("    <button class=\"delete-button\" onclick=\"deletePost()\">게시글 삭제</button>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  	<script>\r\n");
      out.write("  		function goBack() {\r\n");
      out.write("  			location.href='board.jsp';\r\n");
      out.write("  		}\r\n");
      out.write("  	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
