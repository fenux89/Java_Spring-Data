<%--
  Created by IntelliJ IDEA.
  User: Oched
  Date: 18.07.2021
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Books</title>
    <style>
        <%@include file="../style.css"%>
    </style>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Book</th>
        <th>Author</th>
        <th>Year</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="book">
        <tr>
            <td>${book.id}</td>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>${book.year}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<hr>
<div class="content">
<h3><a href="../books/add">Add book...</a></h3>
<h3><a href="../index.jsp">Go to main...</a></h3>
</div>
</body>
</html>
