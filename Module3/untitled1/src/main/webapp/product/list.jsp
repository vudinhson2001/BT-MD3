<%--
  Created by IntelliJ IDEA.
  User: sonvu
  Date: 20/05/2022
  Time: 9:06 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Danh Sách Sản Phẩm</h1>
<a href="/products?action=create"> tạo mới sản phẩm</a>
<c:forEach items='${danhSach}' var="sanPham">
    <h3>${sanPham.id},${sanPham.name},${sanPham.price}</h3>
</c:forEach>
</body>
</html>