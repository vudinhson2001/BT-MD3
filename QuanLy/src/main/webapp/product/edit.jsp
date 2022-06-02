<%--
  Created by IntelliJ IDEA.
  User: sonvu
  Date: 26/05/2022
  Time: 3:35 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <input type="number" name="id" value="${spCanSua.id}">
    <input type="text" name="name" value="${spCanSua.name}">
    <input type="number" name="price" value="${spCanSua.price}">
    <button>Sửa</button>
</form>
</body>
</html>
