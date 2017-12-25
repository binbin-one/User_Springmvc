<%--
  User: xiu
  Date: 2017/10/31
  Time: 15:41
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <h2>添加用户</h2>
    <form action="${pageContext.request.contextPath}/userAction/addUser" method="post">
        姓名：<input name="uname" /><br />
        性别:<input name="usex" type="radio" value="男" checked/>男
        <input name="usex" type="radio" value="女"/>女<br/>
        年龄：<input name="uage" /><br />
        爱好：<input name="uhobby" type="checkbox" value="体育" />体育
              <input name="uhobby" type="checkbox" value="音乐" />音乐
              <input name="uhobby" type="checkbox" value="游戏" />游戏<br />
        时间：<input name="uintime" /><br />
        <input type="submit" value="提交" />
    </form>
</body>
</html>
