<%--
  Created by IntelliJ IDEA.
  User: Oched
  Date: 20.07.2021
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Id User Result</title>
    <style>
        <%@include file="../style.css"%>
    </style>
</head>
<body>
<c:if test="${index == 1}">
    <div class="content">
            <%--<c:forEach items="${list}" var="user">--%>
        <h2>${list.id} | ${list.email} | ${list.login} | ${list.password}</h2>
            <%--</c:forEach>--%>

    </div>
</c:if>

<c:if test="${index == 2}">
    <div class="content">
            <%--            <c:forEach items="${list}" var="user">--%>
        <h2>${user.id} | ${user.email} | ${user.login} | ${user.password}</h2>
            <%--            </c:forEach>--%>

    </div>
</c:if>

<c:if test="${index == 3}">
    <div class="content">
        <c:forEach items="${list}" var="user">
            <h2>${user.id} | ${user.email} | ${user.login} | ${user.password}</h2>
        </c:forEach>

    </div>
</c:if>

<hr>
<div class="content">
    <h3><a href="../users/findUserById">Search new one id...</a></h3>
    <h3><a href="../users/findUserByEmail">Search new one email...</a></h3>
    <h3><a href="../users/findUserByLogin">Search new one Login...</a></h3>
    <h3><a href="../index.jsp">Go to main...</a></h3>
</div>
</body>
</html>
