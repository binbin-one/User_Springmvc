<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <title>Insert title here</title>
</head>
<body>
<h2>修改用户信息</h2>
<form action="${pageContext.request.contextPath}/userAction/updateUser" method="post">
    <input type="hidden" name="uno" value="${users.uno}">
    姓名:<input name="uname" value="${users.uname }"><br/>
    性别:<input name="usex" type="radio" value="男">男
    <input name="usex" type="radio" value="女">女<br/>
    年龄:<input name="uage" value="${users.uage}"><br/>
    爱好:
    <input type="checkbox" name="uhobby" value="体育">体育
    <input type="checkbox" name="uhobby" value="音乐">音乐
    <input type="checkbox" name="uhobby" value="游戏">游戏<br/>
    注册时间:<input name="uintime" value="${users.uintime.toString().substring(0,10)}"><br/>
    <input type="submit" value="修改用户">
</form>
<a href="${pageContext.request.contextPath}/index.jsp">返回用户列表</a>
</body>
</html>
<script type="text/javascript">
    //获取性别单选框
    var sex=document.forms[0].usex;//获取sex单选按钮组
    if(sex[0].value=='${users.usex}'){
        sex[0].checked=true;
    }else{
        sex[1].checked=true;
    }
    //获取爱好复选框
    var uhobby=document.forms[0].uhobby;//获取shobby复选按钮组
    for(var i=0;i<uhobby.length;i++){
        if('${users.uhobby}'.indexOf(uhobby[i].value)>=0){
            uhobby[i].checked=true;
        }
    }
</script>