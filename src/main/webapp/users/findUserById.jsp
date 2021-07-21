<%--
  Created by IntelliJ IDEA.
  User: Oched
  Date: 20.07.2021
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User id</title>
    <style>
        <%@include file="../style.css"%>
    </style>
</head>
<body>
<c:if test="${index == 1}">
    <div class="content">
        <form action="../users/findUserById" method="post">
            <p>Id : <input type="number" name="id"></p>
            <input type="submit" value="Pass data">
        </form>
    </div>
</c:if>

<c:if test="${index == 2}">
    <div class="content">
        <form action="../users/findUserByEmail" method="post">
            <p>Email : <input type="text" name="email"></p>
            <input type="submit" value="Pass data">
        </form>
    </div>
</c:if>

<c:if test="${index == 3}">
    <div class="content">
        <form action="../users/findUserByLogin" method="post">
            <p>Login : <input type="text" name="login"></p>
            <input type="submit" value="Pass data">
        </form>
    </div>
</c:if>
<hr>
<div class="content">
    <h3><a href="../index.jsp">Go to main...</a></h3>
</div>
</body>
</html>
