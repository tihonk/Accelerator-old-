<%--
  Created by IntelliJ IDEA.
  User: t.kasko
  Date: 10.9.19
  Time: 16.25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Chemistry</title>

    <spring:url value="/resources/core/css/home.css" var="coreCss" />
    <spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
    <link href="${bootstrapCss}" rel="stylesheet" />
    <link href="${coreCss}" rel="stylesheet" />
</head>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <ul class="menu">
                <a class="navbar-brand" href="/">Accelerator</a>
                <li><a href=#>My cabinet</a>
                    <ul class="submenu">
                        <li><a href=#>My account</a></li>
                        <li><a href=#>My history</a></li>
                        <c:if test="${not empty name}">
                            <li><a href=#>Sign out</a></li>
                        </c:if>
                        <c:if test="${empty name}">
                            <li><a href=#>Sign in</a></li>
                        </c:if>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="jumbotron">
    <div class="container">
        <h1>${title}</h1>
        <p class="buttons">
            <c:if test="${not empty name}">
            Hello ${name}
            </c:if>

            <c:if test="${empty name}">
            Welcome to the chemical calculation accelerator!
        <p class="buttons">
            <a class="btn btn-info btn-lg signin" href="login" role="button">Sign in</a>
            <a class="btn btn-info btn-lg signup" href="registration" role="button">Sign up</a>
        </p>
        </c:if>
        </p>
    </div>
</div>

<div class="container">

    <form action="LogoutServlet" method="post">
        <input type="submit" value="Logout" >
    </form>

</div>

<spring:url value="/resources/core/css/hello.js" var="coreJs" />
<spring:url value="/resources/core/css/bootstrap.min.js" var="bootstrapJs" />

<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

</html>