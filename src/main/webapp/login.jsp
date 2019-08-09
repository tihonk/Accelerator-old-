<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="US-ASCII">
    <title>Login Page</title>
</head>
<body>

<form action="LoginServlet" method="post">

    Username: <input type="text" name="user">
    <br>
    Password: <input type="password" name="pwd">
    <br>
    <input type="submit" value="Login">
</form>
</body>
</html>