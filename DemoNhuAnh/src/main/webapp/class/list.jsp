<%--
  Created by IntelliJ IDEA.
  User: sonvu
  Date: 01/06/2022
  Time: 10:20 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${dsl}" var="cl">
    <h1>${cl.id},${cl.name}</h1>
</c:forEach>
</body>
</html>
