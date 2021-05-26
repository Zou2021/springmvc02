<%@ page contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<html>
<head>
    <title>添加用户</title>
</head>
<style>
    body {
        text-align: center;
    }
    input{
        width: 10%;
        height: 4%;
    }
</style>
<body>
<form action="${pageContext.request.contextPath}/addUser.do" method="post">
    <h2>姓名：<input type="text" name="name"></h2>
    <h2>年龄：<input type="text" name="age"></h2>
    <h2>性别：<input type="text" name="sex"></h2>
    <input type="submit" value="提交">
</form>
</body>
</html>
