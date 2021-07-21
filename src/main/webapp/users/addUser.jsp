<%--
  Created by IntelliJ IDEA.
  User: Oched
  Date: 07.07.2021
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
    <style>
        <%@include file="../style.css"%>
    </style>
</head>
<body>
<div class="content">
<form class ="from1"  action="../users/add" method="post" modelAttribute="${user}">
    <p>Login : <input type="text" name="login"></p>
    <p>Email : <input type="text" name="email"></p>
    <p>Password : <input type="text" name="password"></p>
    <input type="submit" value="Pass data">
</form>
</div>
<hr>
<div class="content">
<p><a href="../users/all">Get list...</a></p>
<p><a href="../index.jsp">Go to main...</a></p>
</div>
</body>
</html>
