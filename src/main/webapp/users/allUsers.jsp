<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: Oched
  Date: 07.07.2021
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>List of users</title>
    <style>
        <%@include file="../style.css"%>
    </style>
</head>
<body>
    <h2>List of users : </h2>
    <table>
        <thead>
        <tr>
            <th>Status</th>
            <th>ID</th>
            <th>Email</th>
            <th>login</th>
            <th>Password</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="user" varStatus="status">
            <tr>
                <td>${status.index}</td>
                <td>${user.id}</td>
                <td>${user.email}</td>
                <td>${user.login}</td>
                <td>${user.password}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <hr>
    <div class="content">
    <p><a href="../users/add">Go to users form...</a></p>
    <p><a href="../index.jsp">Go to main...</a></p>
    </div>
</body>
</html>
