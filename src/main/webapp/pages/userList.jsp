<%--
  User: xiu
  Date: 2017/10/31
  Time: 15:41
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
    <h2>用户信息</h2>
    <p style="color: red">${msg}</p>
    <table border="1">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td>爱好</td>
            <td>注册时间</td>
            <td>操作</td>
        </tr>
        <c:forEach var="obj" items="${userList}" varStatus="ids">
            <tr>
                <td>${ids.count}</td>
                <td>${obj.uname}</td>
                <td>${obj.usex}</td>
                <td>${obj.uage}</td>
                <td>${obj.uhobby}</td>
                <td>${obj.uintime.toString().substring(0,10)}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/userAction/selectUserById/${obj.uno}">修改</a> |
                    <a href="${pageContext.request.contextPath}/userAction/deleteUser/${obj.uno}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="${pageContext.request.contextPath}/pages/addUser.jsp">添加用户</a><br />
</body>
</html>
