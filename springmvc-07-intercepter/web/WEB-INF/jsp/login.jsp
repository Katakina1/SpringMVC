<%--
  Created by IntelliJ IDEA.
  User: 马越
  Date: 2023/4/27
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登录界面</h1>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    用户名：<input type="text" name="username">
    密码：<input type="text" name="password">
    <input type="submit" value="提交">
</form>
</body>
</html>
