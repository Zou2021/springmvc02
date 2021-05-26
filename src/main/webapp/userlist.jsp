<%--
  Created by IntelliJ IDEA.
  User: 王娉
  Date: 2021/5/24
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>用户信息</title>
</head>
<style>
    body {
        text-align: center;
    }
    table {
        margin: auto;
        border-collapse: collapse;
        width: 80%;
    }
    table tr td {
        border: solid 1px #222;
        padding: 15px 15px 15px 15px;
        text-align: center;
    }
</style>
<body>
<h1>用户信息</h1>
<table>
    <tr>
        <td>用户id</td>
        <td>用户姓名</td>
        <td>用户年龄</td>
        <td>用户性别</td>
        <td>操作</td>
    </tr>

    <!-- 从第二行进行循环取值 -->
    <c:forEach items="${list }" var="user">
        <tr>
            <td>${user.id }</td>
            <td>${user.name }</td>
            <td>${user.age }</td>
            <td>${user.sex }</td>
            <td><a href="edit.do?id=${user.id }">修改</a>
                <a href="del.do?id=${user.id }">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<h2><a href="add.do">添加用户</a></h2>
</body>
</html>