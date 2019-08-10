<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  com.example.dto.User: t.kasko
  Date: 3.6.19
  Time: 17.34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <spring:url value="/resources/core/css/registration.css" var="registrationCss" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
    <link href="https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/css/bootstrap.min.css" />
    <link href="${registrationCss}" rel="stylesheet" />
    <spring:url value="/resources/core/css/home.css" var="coreCss" />
    <spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
    <link href="${bootstrapCss}" rel="stylesheet" />
    <link href="${coreCss}" rel="stylesheet" />
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <ul class="menu">
                <a class="navbar-brand" href="/">Accelerator</a>
            </ul>
        </div>
    </div>
</nav>


<div class="p-x-1 p-y-3">
    <form class="card card-block m-x-auto bg-faded form-width" method="post" action="/login">
        <legend class="m-b-1 text-xs-center">Login</legend>
        <div class="form-group input-group">
            <span class="input-group-addon">@</span>
            <span class="has-float-label">
 <input class="form-control" name="email" id="email" type="email" placeholder="name@example.com"/>
 <label for="email">E-mail</label>
 </span>
        </div>
        <div class="form-group has-float-label">
            <input class="form-control" name="password" id="password" type="password" placeholder="******" />
            <label for="password">Password</label>
        </div>
        <div class="form-group">
            <label class="custom-control custom-checkbox">
                <input class="custom-control-input" type="checkbox"/>
                <span class="custom-control-indicator"></span>
                <span class="custom-control-description">Remember me</span>
            </label>
        </div>
        <div class="text-xs-center">
            <button class="btn " type="submit">Sign In</button>
        </div>
    </form>
</div>


</body>
</html>