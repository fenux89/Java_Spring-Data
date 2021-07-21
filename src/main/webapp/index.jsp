<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta  content="text/html"; charset="utf-8">
<%--    <link href="<c:url value="/style.css"/>" rel="stylesheet">--%>
    <title>Главная страница</title>
    <style>
        <%@include file="style.css"%>
    </style>
<%--    <style> body{--%>
<%--        background-color: #58bbee;--%>
<%--    }--%>

<%--    </style>--%>
</head>
<body>
<div id="content">
    <h2>Домашняя работа №3</h2>

    <p id="p"> <a href="/user "> Войти </a> </p>

    <p id="p1"><a href="/all "> Список всех </a> </p>
</div>

<div id="content1">
    <h2>Домашняя работа №4</h2>
    <h3><a href="users/add">Go to users form...</a></h3>
    <h3><a href="users/all">Get users list...</a></h3>

    <hr>

    <h3><a href="/books/add">Add book...</a></h3>
    <h3><a href="/books/all">Books list ...</a></h3>
    <br>
    <hr>
    <h3><a href="/books/findBookByYear">Find books by year...</a></h3>


    <h3><a href="/users/findUserById">Find user by id...</a></h3>
    <h3><a href="/users/findUserByEmail">Find user by email...</a></h3>
    <h3><a href="/users/findUserByLogin">Find user by login...</a></h3>

</div>
</body>
</html>
