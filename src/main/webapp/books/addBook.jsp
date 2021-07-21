<%--
  Created by IntelliJ IDEA.
  User: Oched
  Date: 18.07.2021
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Book</title>
    <style>
        <%@include file="../style.css"%>
    </style>
</head>
<body>
<div class="content">
<form class ="from1" action="../books/add" method="post" modelAttribute="${book}">
    <p>Name : <input type="text" name="name"></p>
    <p>Author : <input type="text" name="author"></p>
    <p>Year : <input type="text" name="year"></p>
    <input type="submit" value="Pass data">
</form>
</div>
<hr>
<div class="content">
<h3><a href="../books/all">Books list...</a></h3>
<h3><a href="../index.jsp">Go to main...</a></h3>
</div>
</body>
</html>
