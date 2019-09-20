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

    <script src="https://www.google.com/jsapi"></script>
    <script>
      google.load("visualization", "1", {packages:["corechart"]});
      google.setOnLoadCallback(drawChart);
      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Газ', 'Объём'],
          ['Азот',     78.09],
          ['Кислород', 20.95],
          ['Аргон',    0.93],
          ['Углекислый газ', 0.03]
        ]);
        var options = {
          title: 'Состав воздуха',
          is3D: true,
          pieResidueSliceLabel: 'Остальное'
        };
        var chart = new google.visualization.PieChart(document.getElementById('air'));
        chart.draw(data, options);
      }
    </script>
</head>
<body>
<%--<%--%>
<%--    //allow access only if session exists--%>
<%--    String user = null;--%>
<%--    if(session.getAttribute("user") == null){--%>
<%--        response.sendRedirect("../login");--%>
<%--    }else user = (String) session.getAttribute("user");--%>
<%--    String userName = null;--%>
<%--    String sessionID = null;--%>
<%--    Cookie[] cookies = request.getCookies();--%>
<%--    if(cookies !=null){--%>
<%--        for(Cookie cookie : cookies){--%>
<%--            if(cookie.getName().equals("user")) userName = cookie.getValue();--%>
<%--            if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();--%>
<%--        }--%>
<%--    }--%>
<%--%>--%>


<%--<div class="jumbotron">--%>
<%--    <div class="container">--%>

<%--        <form action="LogoutServlet" method="post">--%>
<%--            <input type="submit" value="Logout" >--%>
<%--        </form>--%>

<%--    </div>--%>
<%--</div>--%>
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
      <p>Enter the amino acid sequence:</p>
          <textarea name="text" cols="120" rows="12"></textarea>
      <p><input type="submit" value="Count">
          <input type="reset" value="Clean out"></p>
      </form>
    </div>
</div>

<div id="air" style="width: 500px; height: 400px;"></div>


<spring:url value="/resources/core/css/hello.js" var="coreJs" />
<spring:url value="/resources/core/css/bootstrap.min.js" var="bootstrapJs" />

<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</body>
</html>