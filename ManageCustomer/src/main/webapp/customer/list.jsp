
<%--
  Created by IntelliJ IDEA.
  User: sonvu
  Date: 23/05/2022
  Time: 2:18 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Đây là danh Sách</h1>
<a href="/customers?act=create">Tạo mới</a>
<c:forEach var="cus" items="${dsKH}">
    <h2>${cus.id},${cus.name},${cus.age}</h2>
</c:forEach>
</body>
</html>