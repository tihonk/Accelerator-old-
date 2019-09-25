<%--
  Created by IntelliJ IDEA.
  User: t.kasko
  Date: 25.9.19
  Time: 21.53
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Accelerator</title>
    <spring:url value="/resources/core/css/accelerator.css" var="coreCss" />
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
<body>
<div class="jumbotron">
    <div class="container">
        <div class="row">
            <p>Copy and paste the PDB file:</p>
            <form method="post">
                <div class="col-md-4 divTextaria">
                    <label>
                        <textarea name="text"  rows="12" placeholder="Enter all dates from the PDB file:"></textarea>
                    </label>
                    <input type="hidden" name="_csrf" value="{{_csrf.token}}" />
                    <p><button type="submit">Get result</button> <button type="reset">Clean out</button></p>
                </div>

                <div class="col-md-4 divSelect">
                    <p class="polzun"><input  type="range" min="0" max="10" onchange="document.getElementById('rangeValue').innerHTML = this.value;" ><span id="rangeValue">5</span>Å</p>
                    <p class="selectedDate"><label>
                        <select name="element">
                             <option value="AR">Ar (argon)</option>
                             <option value="KR">Kr (krypton)</option>
                             <option value="XE">Xe (xenon)</option>
                             <optgroup label="Metals">
                                 <option value="CO">Co (cobalt)</option>
                                 <option value="CA">Ca (calcium)</option>
                                 <option value="K">K (potassium)</option>
                                 <option value="LI">Li (lithium)</option>
                                 <option value="MG">Mg (magnesium)</option>
                             </optgroup>
                             <optgroup label="Others">
                                 <option value="S">S (sulfur)</option>
                                 <option value="CL">Cl (chlorine)</option>
                             </optgroup>
                         </select>
                    </label></p>
                </div>
            </form>
        </div>
    </div>
</div>
${text}


</body>
</html>
