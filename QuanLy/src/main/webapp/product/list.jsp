<%--
  Created by IntelliJ IDEA.
  User: sonvu
  Date: 26/05/2022
  Time: 2:27 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh Sách Sản Phẩm</h1>
<form action="/products?act=search" method="get">
<h1>Tìm Kiếm Tên Xe
    <input type="text" name="name">
    <input type="submit" value="search">
</h1>
</form>
<a href="/products?act=create">Tạo mới sản phẩm</a>
<c:forEach items='${danhSach}' var="sanPham">
    <h3>${sanPham.id}, ${sanPham.name}, ${sanPham.price} <a href="/products?act=edit&id=${sanPham.id}">Sửa</a>
        <a href="/products?act=remote&id=${sanPham.id}">Xóa</a></h3>
</c:forEach>
</body>
</html>
