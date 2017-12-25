<%--
  User: xiu
  Date: 2017/10/31
  Time: 15:38
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jump to userList</title>
</head>
<body>
    <%
        response.sendRedirect(request.getContextPath()+"/userAction/selectUser");
    %>
</body>
</html>
