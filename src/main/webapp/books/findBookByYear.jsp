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
    <title>Book Year</title>
    <style>
        <%@include file="../style.css"%>
    </style>
</head>
<body>
<div class="content">
    <form action="../books/findBookByYear" method="post">
        <p>Year : <input type="number" name="year"></p>
        <input type="submit" value="Pass data">
    </form>
</div>
<hr>
<div class="content">
    <h3><a href="../index.jsp">Go to main...</a></h3>
</div>
</body>
</html>
