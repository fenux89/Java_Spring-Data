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
    <title>Year Book Result</title>
    <style>
        <%@include file="../style.css"%>
    </style>
</head>
<body>
<div class="content">
    <c:forEach items="${list}" var="book">
        <h2>${book.id} | ${book.name} | ${book.author} | ${book.year}</h2>
    </c:forEach>

</div>
<hr>
<div class="content">
    <h3><a href="../books/findBookByYear">Search new one...</a></h3>
    <h3><a href="../index.jsp">Go to main...</a></h3>
</div>
</body>
</html>
