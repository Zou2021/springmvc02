<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>修改用户</title>
</head>
<style>
    body {
        text-align: center;
        background-color: #FDF5E6;
    }

    input {
        width: 10%;
        height: 4%;
    }
</style>
<body>
<h1>用户修改信息的页面</h1>
<form action="editUser.do" method="post">
    <input type="hidden" name="id" value="${user.id }"/><br>
    <h2>用户名称：<input type="text" name="name" value="${user.name }"/></h2>
    <h2>用户年龄：<input type="text" name="age" value="${user.age }"/></h2>
    <h2>用户性别：<input type="text" name="sex" value="${user.sex }"/></h2>
    <input type="submit" value="提交">
</form>
</body>
</html>